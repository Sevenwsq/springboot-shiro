package com.qiao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Silent
 * @date 2019/11/17 10:11:56
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private String perms;
    /**
     * 盐值
     */
    private String saltValue;

}
