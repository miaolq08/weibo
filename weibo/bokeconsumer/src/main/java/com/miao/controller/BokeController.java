package com.miao.controller;

import com.miao.service.BokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

/**
 * <h3>weibo</h3>
 *
 * @author : MLQ
 * @date : 2020-09-05 09:44
 **/

@RestController
@RequestMapping("boke")
public class BokeController {
    @Autowired
    private BokeService bokeService;
    @RequestMapping("findAll")
    public Object findAll(@RequestParam(defaultValue = "3")Integer pageSize,
                          @RequestParam(defaultValue = "1")Integer pageNum){
        Map<String,Object> bokes =bokeService.findAll();
        return bokes;

    }
}
