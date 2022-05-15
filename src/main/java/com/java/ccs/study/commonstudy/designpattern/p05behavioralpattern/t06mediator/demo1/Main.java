package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t06mediator.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 17:15 2022/5/15
 */
public class Main {
    /**
     * 中介者模式：
     * 用一个中介对象来封装一系列的对象交互。
     * 中介者使各个对象不需要显示的相互引用，从而使其松散解耦，而且可以独立的改变它们之间的交互。
     * 比如：MVC模式，C（Controller控制器）是M（Model模型）和V（View视图）的中介者，在前后端交互时起到了中间人的作用
     * <p>
     * 中介者模式角色及职责
     * Mediator【抽象中介者】：定义了同事对象到中介者对象的接口
     * ConcreteMediator【具体的中介者对象】：实现抽象中介者方法，需要知道所有具体的同事类，即以一个集合来管理HashMap，并接受某个同事对象消息，完成相应的任务
     * Colleague【抽象同事类】
     * ConcreteColleague【具体的同事类】：会有很多，只知道自己的行为，而不了解其他同事类的行为（方法），但他们都依赖中介者对象
     * <p>
     * 优点
     * 1）多个类相互耦合，会形成网状结构，使用中介者模式将网状结构分离为星型结构，进行解耦
     * 2）减少类间依赖，降低了耦合，符合迪米特原则
     * 缺点
     * 3）中介者承担了较多的责任，一旦中介者出现了问题，整个系统就会受到影响
     * 4）如果设计不当，中介者对象本身变得过于复杂，这点在实际使用时，要特别注意
     */
    public static void main(String[] args) {
        //创建中介者
        Mediator mediator = new ConcreteMediator();

        //创建各个同事类，并加入Mediator中介者的Map对象中
        Alarm alarm = new Alarm(mediator);
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator);
        Curtain curtain = new Curtain(mediator);
        TV tv = new TV(mediator);

        //闹钟响起
        alarm.openAlarm();
        coffeeMachine.completeCoffee();
        tv.closeTV();
        curtain.downCurtain();
    }
}
