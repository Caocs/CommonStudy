package com.java.ccs.study.commonstudy.algorithm.other;

import org.junit.Test;

/**
 * @author caocs
 * @date 2021/11/21
 */
public class IpToInt {

    @Test
    public void ipToInt() {
        String ip = "225.168.0.1";
        String[] splitArr = ip.split("\\.");
        int a = Integer.parseInt(splitArr[0]) << 24;
        int b = Integer.parseInt(splitArr[1]) << 16;
        int c = Integer.parseInt(splitArr[2]) << 8;
        int d = Integer.parseInt(splitArr[3]);
        int result = a | b | c | d;
        System.out.println(result); //-1062731775
    }

    @Test
    public void intToIp() {

        int i = -1;
        int value = Integer.MIN_VALUE+1;
        int a = (value >> 24) & 0xFF;
        int b = (value >> 16) & 0xFF;
        int c = (value >> 8) & 0xFF;
        int d = (value) & 0xFF;
        StringBuilder builder = new StringBuilder();
        builder.append(a).append(".").append(b).append(".").append(c).append(".").append(d);
        System.out.println(builder.toString()); // -1062731775
    }

}
