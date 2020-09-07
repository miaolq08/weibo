package com.miao.pojo;

import lombok.Data;

/**
 * <h3>weibo</h3>
 *
 * @author : MLQ
 * @date : 2020-09-04 15:42
 **/
@Data
public class User {
    private Integer uid;
    private String username;
    private String password;
    private String name;
}
