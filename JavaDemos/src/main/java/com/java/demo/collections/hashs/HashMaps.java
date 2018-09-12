package com.java.demo.collections.hashs;

import java.util.HashMap;

/**
 * @Auther: FangSS
 * @Date: 2018/6/21 0021 11:17
 */
public class HashMaps {
    public static void main(String[] args) {
        HashMap  hash = new HashMap();
        hash.put(null,"sdfsfds");
        System.out.println(hash.toString());

        hash.put("a", null);
        System.out.println(hash.toString());

    }


}