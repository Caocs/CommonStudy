package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t08interpreter.delm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Cao.cs
 * @Date: Created in 20:55 2022/5/15
 */
public class Main {

    /**
     * 解释器模式：
     * 是指给定一个语言（表达式），定义它的文法的一种表示，并定义一个解释器，使用该解释器来解释语言中的句子（表达式）。
     * 注意事项和细节
     * 1）当有一个语言需要解释执行，可将该语言中的句子表示为一个抽象语法树，就可以考虑使用解释器模式，让程序具有良好的扩展性
     * 2）应用场景：编译器、运算表达式计算、正则表达式、机器人等
     * 3）使用解释器可能带来的问题：解释器模式会引起类膨胀、解释器模式采用递归调用方法，将会导致调试非常复杂、效率可能降低
     */
    public static void main(String[] args) throws IOException {
        System.out.print("请输入表达式：");
        String expStr = getExpStr();
        Map<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(var));
    }

    public static String getExpStr() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static Map<String, Integer> getValue(String expStr) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        String s;
        for (char ch : expStr.toCharArray()) {
            s = String.valueOf(ch);
            if (ch == '+' || ch == '-' || map.containsKey(s)) {
                continue;
            }
            System.out.print("请输入" + s + "的值：");
            map.put(s, Integer.valueOf(getExpStr()));
        }
        return map;
    }

}
