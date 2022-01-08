package com.java.ccs.study.commonstudy.algorithm.p04stack;

/**
 * @author caocs
 * @date 2021/12/24
 * 使用栈实现"加减乘除"的表达式运算。
 * 分析：
 * 表达式实际上可以看做中缀表达式。
 * 定义两个栈，分别记录操作数和操作符
 * 1.遍历表达式，
 * 2.如果是数字，
 * 则继续判断下一个元素是否是数字。直到不是数字为止，拼接后入数栈。
 * 3.如果是操作符
 * 3.1，如果符号栈中为空，则直接入栈。
 * 3.2，如果符号栈中不为空，需要和上一个符号进行比较优先级。
 * 如果当前优先级小于或等于，则从数栈中pop两个数跟符号栈中符号计算得到结果再入栈后，该符号入栈。
 * 如果当前优先级大于，直接入符号栈。
 * 4.遍历完毕。
 * 5.再顺序从数栈和符号栈中取值，计算得到结果并入栈。
 * 6.最后，数栈中只有一个数字，就是表达式的结果。
 */
public class InfixCalcDemo {

    /**
     * 中缀表达式，完成对表达式解析计算。
     */
    public static void main(String[] args) {
        String expression = "30+2*6-2";
        // 创建两个栈，分别存放数和符号
        ArrayStack numStack = new ArrayStack(20);
        ArrayStack operStack = new ArrayStack(20);
        String keepNum = ""; // 暂存数字
        // 遍历表达式
        int length = expression.length();
        for (int index = 0; index < length; index++) {
            char ch = expression.substring(index, index + 1).charAt(0);
            if (!isOper(ch)) {
                // 如果是数字，继续判断下一个元素是否是数字。直到不是数字为止，拼接后入数栈。
                keepNum += ch;
                if (index == length - 1) {
                    numStack.push(Integer.parseInt(keepNum));
                } else {
                    char next = expression.substring(index + 1, index + 2).charAt(0);
                    if (isOper(next)) {
                        numStack.push(Integer.parseInt(keepNum));
                        keepNum = ""; // 一定要在入栈之后清空
                    }
                }
            } else {
                if (operStack.isEmpty()) {
                    // 符号栈为空，直接入栈
                    operStack.push(ch);
                } else {
                    int preOper = operStack.peek();
                    if (priority(ch) <= priority(preOper)) {
                        // 当前操作符<=上一个，则从数栈中pop两个数跟符号栈中符号计算得到结果再入栈后，该符号入栈。
                        int num1 = numStack.pop();
                        int num2 = numStack.pop();
                        int oper = operStack.pop();
                        int result = cal(num2, num1, oper);
                        numStack.push(result);
                        operStack.push(ch);
                    } else {
                        // 当前oper优先级大，直接入栈
                        operStack.push(ch);
                    }
                }
            }
        }

        // 从数栈和符号栈中pop数据，并计算
        while (true) {
            // 当符号栈为空，则说明计算结束
            if (operStack.isEmpty()) {
                break;
            }
            int num1 = numStack.pop();
            int num2 = numStack.pop();
            int oper = operStack.pop();
            int result = cal(num2, num1, oper); // 注意出栈时，数据的顺序。
            numStack.push(result);
        }
        // 此时数栈中，只有一个元素。就是表达式的结果
        System.out.println(numStack.pop());
    }

    /**
     * 只支持"+-*\/"
     *
     * @param oper 运算符
     * @return 返回运算符的优先级，数字越大，则优先级越高。
     */
    public static int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * @return 判断是否为操作符
     */
    public static boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    /**
     * @return 计算
     */
    public static int cal(int num1, int num2, int oper) {
        int result = 0;
        switch (oper) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                break;
        }
        return result;
    }


}
