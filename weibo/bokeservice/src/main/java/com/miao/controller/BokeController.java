package com.miao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.miao.pojo.Boke;
import com.miao.pojo.Json;
import com.miao.service.BokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <h3>weibo</h3>
 *=
 * @author : MLQ
 * @date : 2020-09-04 15:47
 **/
@RestController
@RequestMapping("boke")
public class BokeController {
    @Autowired
    private BokeService bokeService;
    @RequestMapping("findAll")
    public Object findAll(@RequestParam(defaultValue = "3")Integer pageSize,
                          @RequestParam(defaultValue = "1")Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        List<Boke> bokes =bokeService.findAll();
        PageInfo<Boke> pageInfo = new PageInfo<>(bokes);
        return new Json<List>(pageInfo.getTotal(),pageInfo.getList());

    }
}
