package com.java.ccs.study.commonstudy.base.common;

/**
 * @author caocs
 * @date 2021/11/14
 */
public class StringDemo {

    public static void main(String[] args) {
        /**使用synchronized方法，继承自AbstractStringBuilder*/
        StringBuffer buffer = new StringBuffer();
        /**不是线程安全的，继承自AbstractStringBuilder*/
        StringBuilder builder = new StringBuilder();

        String str = "hello";
    }

}
