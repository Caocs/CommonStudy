package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t04iterator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:55 2022/5/12
 * <p>
 * 聚合接口：将客户端和具体的聚合解耦
 */
public interface Aggregate {

    Iterator<Integer> createIterator();

}
