package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t06flyweight.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:22 2022/5/9
 */
public class WebsiteFactory {

    /**
     * 定义缓存池，存放享元对象。
     */
    private static Map<Website.Type, Website> pool = new HashMap<>();

    public static Website getWebsiteCategory(Website.Type type) {
        if (pool.get(type) == null) {
            pool.put(type, new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    public static Integer getSize() {
        return pool.size();
    }

}
