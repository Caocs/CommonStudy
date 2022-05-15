package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t10strategy.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:23 2022/5/15
 */
public class Main {

    /**
     * 策略模式：
     * 定义算法族，分别封装起来，让他们之间可以互相替换。此模式让算法的变化独立于使用算法的客户
     * 思路分析
     * 策略模式：分别封装行为接口，实现算法族，超类里放行为接口对象，在子类里具体设定行为对象
     * 原则就是：分离变化部分，封装接口，基于接口编程各种功能。此模式让行为的变化独立于算法的使用者
     * <p>
     * 注意事项和细节
     * 1）策略模式的关键是：分析项目中变化部分与不变部分
     * 2）策略模式的核心思想是：多用组合/聚合，少用继承；用行为类组合，而不是行为的继承，更有弹性
     * 3）体现了“对修改关闭，对扩展开放”原则，客户端增加行为不用修改原有代码，只要添加一种策略（或者行为）即可，避免了使用多重转移语句（if...else if...else）
     * 4）提供了可以替换继承关系的办法：策略模式将算法封装在独立的Strategy类中，使得你可以独立于其Context改变它，使它易于切换、易于理解、易于扩展
     * 5）需要注意的是：每添加一个策略就要增加一个类，当策略过多是会导致类数目庞大
     */
    public static void main(String[] args) {
        // 测试案例：https://blog.csdn.net/qq_54773252/article/details/121032404
        // 具体行为策略
        MemberStrategy primaryMemberStrategy = new PrimaryMemberStrategy(); // 接口回调（向上转型）
        MemberStrategy intermediateMemberStrategy = new IntermediateMemberStrategy();
        MemberStrategy advanceMemberStrategy = new AdvanceMemberStrategy();

        // 用户选择不同策略
        MemberContext primaryContext = new MemberContext(primaryMemberStrategy);
        MemberContext intermediateContext = new MemberContext(intermediateMemberStrategy);
        MemberContext advanceContext = new MemberContext(advanceMemberStrategy);

        //计算一本300块钱的书
        System.out.println("普通会员的价格：" + primaryContext.calcPrice(300, 1));// 普通会员：300
        System.out.println("中级会员的价格：" + intermediateContext.calcPrice(300, 1));// 中级会员 270
        System.out.println("高级会员的价格：" + advanceContext.calcPrice(300, 1));// 高级会员240


    }

}
