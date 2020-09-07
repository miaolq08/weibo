package com.miao.service;

import com.miao.pojo.Boke;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Service
@FeignClient("bokeservice")
public interface BokeService {
    @RequestMapping("boke/findAll")
    Map<String,Object> findAll();
}
