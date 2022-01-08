package com.java.ccs.study.commonstudy.algorithm.p04stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author caocs
 * @date 2021/12/27
 * 中缀表达式
 * 对于计算机来说，不好操作。往往将其转换为后缀表达式来操作。
 * <p>
 * 前缀表达式（波兰表达式）
 * 例如：(3+4)*5-6 的前缀表达式为 -*+3456
 * 从右至左扫描数字，将数字压入堆栈，遇到字符串时，弹出栈顶的两个数，用运算符对他们做相应的计算，并将结果入栈；
 * <p>
 * 后缀表达式
 * 例如：(3+4)*5-6 的前缀表达式为 34-5*6-
 * 从左到右扫描表达式，遇到数字，将数字压入栈，遇到符号，弹出栈顶两个数做运算，并将结果入栈。
 */
public class PostfixExpression {

    /**
     * 后缀表达式，计算器
     */
    public static void main(String[] args) {
        String infixExpression = "(3+4)*5-6";
        List<String> infixList = toInfixExpressionList(infixExpression);
        List<String> postfixList = infixToPostfix(infixList);
        System.out.println(postfixList);
        int result = postfixCalculate(postfixList);
        System.out.println(result);
    }


    /**
     * 中缀表达式转后缀表达式
     */
    public static List<String> infixToPostfix(List<String> infixList) {
        List<String> postfixList = new ArrayList<>(); // 后缀表达式
        Stack<String> stack = new Stack<>(); // 暂存符号符栈

        for (String item : infixList) {
            if (item.matches("\\d+")) {
                // 1.如果是数字，直接加入postfixList
                postfixList.add(item);
            } else if (item.equals("(")) {
                // 2.如果是"("，直接加入stack。
                stack.push(item);
            } else if (item.equals(")")) {
                // 3.如果是")"，则依次弹出stack栈顶的运算符，并加到postfixList，直到遇到左括号为止。
                while (!stack.peek().equals("(")) {
                    postfixList.add(stack.pop());
                }
                stack.pop(); // 将"("出栈，并丢弃。
            } else {
                // 4.当item的优先级小于等于stack栈顶运算符，将stack栈顶的运算法弹出并加入到postfixList。
                // 继续和比较下一个栈顶运算符
                while (stack.size() != 0
                        && Operation.getValue(stack.peek()) >= Operation.getValue(item)) {
                    postfixList.add(stack.pop());
                }
                stack.push(item); // 最后，还需要将item压入栈stack中。
            }
        }
        // 5.将stack中剩余的运算符，加入到postfixList
        while (stack.size() != 0) {
            postfixList.add(stack.pop());
        }
        return postfixList;
    }

    /**
     * @param infixStr 中缀表达式
     * @return 分隔解析出对应的list
     */
    public static List<String> toInfixExpressionList(String infixStr) {
        List<String> infixList = new ArrayList<>();
        String temp;
        int i = 0;
        char ch;
        while (i < infixStr.length()) {
            ch = infixStr.charAt(i);
            if (ch < 48 || ch > 57) {
                infixList.add(String.valueOf(ch));
                i++;
            } else {
                temp = "";
                while (i < infixStr.length() && (ch = infixStr.charAt(i)) >= 48 && (ch = infixStr.charAt(i)) <= 57) {
                    temp += ch;
                    i++;
                }
                infixList.add(temp);
            }
        }
        return infixList;
    }

    /**
     * 后缀表达式计算：
     * 从左到右扫描表达式，遇到数字，将数字压入栈，遇到符号，弹出栈顶两个数做运算，并将结果入栈。
     *
     * @param list 分隔后的后缀表达式数据
     * @return 计算后的结果
     */
    private static int postfixCalculate(List<String> list) {
        Stack<String> stack = new Stack<>();
        for (String item : list) {
            if (item.matches("\\d+")) { // 匹配多位数
                stack.push(item);
            } else {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                int result = 0;
                if ("+".equals(item)) {
                    result = num2 + num1;
                } else if ("-".equals(item)) {
                    result = num2 - num1; // 后出栈的元素是前面的数字
                } else if ("*".equals(item)) {
                    result = num2 * num1;
                } else if ("/".equals(item)) {
                    result = num2 / num1;
                } else {
                    throw new RuntimeException("运算符错误");
                }
                stack.push(result + "");
            }
        }
        return Integer.parseInt(stack.pop());
    }

}
