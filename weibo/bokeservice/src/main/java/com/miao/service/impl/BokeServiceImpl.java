package com.miao.service.impl;

import com.miao.dao.BokeDao;
import com.miao.pojo.Boke;
import com.miao.service.BokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <h3>weibo</h3>
 *
 * @author : MLQ
 * @date : 2020-09-04 15:47
 **/
@Service
public class BokeServiceImpl implements BokeService {
    @Autowired
    private BokeDao bokeDao;
    @Override
    public List<Boke> findAll() {
        return bokeDao.findAll();
    }
}
