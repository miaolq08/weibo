package com.miao.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * <h3>weibo</h3>
 *
 * @author : MLQ
 * @date : 2020-09-04 15:01
 **/
@Data
public class Boke {
    private Integer bid;
    private Integer userId;
    private String title;
    private String info;
    private Integer nice;
    private Integer watch;
    private Integer down;
    private Date createTime;

}
