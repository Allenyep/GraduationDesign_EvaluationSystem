package com.gdes.GDES.model.utils;

import org.apache.shiro.crypto.hash.Md5Hash;


public class ShiroKit {

    public static String md5(String originPassword, String salt){
        return new Md5Hash(originPassword,salt).toString();
    }

    public static void main(String[] args) {
        System.out.println(md5("000000","631404090425"));
    }
}
