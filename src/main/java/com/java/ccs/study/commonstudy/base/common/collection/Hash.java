package com.java.ccs.study.commonstudy.base.common.collection;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author caocs
 * @date 2022/1/22
 */
public class Hash {

    /**
     * 实测下来：HashMap比Hashtable的插入数据速度快
     *
     * @param args
     */
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        HashMap<String, String> hashMap = new HashMap<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String value = "" + i;
            hashtable.put(value, value);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String value = "" + i;
            hashMap.put(value, value);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
