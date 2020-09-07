package com.miao.dao;

import com.miao.pojo.Boke;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <h3>weibo</h3>
 *
 * @author : MLQ
 * @date : 2020-09-04 15:48
 **/
@Repository
public interface BokeDao {
     List<Boke> findAll();
}
