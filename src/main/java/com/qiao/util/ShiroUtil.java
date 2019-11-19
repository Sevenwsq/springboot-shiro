package com.qiao.util;

import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.UUID;

public class ShiroUtil {
    public static String createSalt(){
        //生成32的随机盐值
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
    /**
     * @param srcPwd    原始密码
     * @param saltValue 盐值
     */
    public static String saltPassword(Object srcPwd, String saltValue){
        return new SimpleHash("MD5", srcPwd, saltValue, 1024).toString();
    }
}