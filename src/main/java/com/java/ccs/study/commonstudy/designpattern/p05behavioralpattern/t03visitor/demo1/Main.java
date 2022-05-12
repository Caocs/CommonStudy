package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t03visitor.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:19 2022/5/12
 */
public class Main {

    /**
     * 访问者模式：
     * 封装一些作用于某种数据结构的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。
     * 主要将数据结构和数据操作分离，解决数据结构和操作耦合性问题。
     * 基本原理：在被访问的类里面加一个对外提供接待访问者的接口。
     * 应用场景：
     * 需要对一个对象结构中的对象进行很多不同操作（这些操作彼此没有关联）,同时需要避免让这些操作"污染"这些对象的类，可以选用访问者模式。
     * <p>
     * 角色：
     * Visitor抽象访问者：为该对象结构中每个ConcreteElement类声明一个visit操作
     * ConcreteVisitor具体访问者：实现Visitor中声明的操作
     * ObjectStructure对象结构：能枚举它的元素，提供一个高层接口，允许访问者访问元素
     * Element抽象元素：定义一个accept方法，接受一个访问者对象
     * ConcreteElement具体元素：实现了accept方法
     * <p>
     * 优点
     * 1）访问者模式符合单一职责原则、让程序具有优秀的扩展性、灵活性非常高
     * 2）访问者模式可以对功能进行统一，可以做报表、UI、拦截器与过滤器，适用于数据结构相对稳定的系统
     * 缺点
     * 1）具体元素对访问者公布细节，也就是说访问者关注了其他类的内部细节，这是迪米特法则所不建议的，这样造成了具体元素变更比较困难
     * 2）违背了依赖倒转原则。访问者依赖的是具体元素，而不是抽象元素
     * 3）因此，如果一个系统有比较稳定的数据结构，又有经常变化的功能需求，那么访问者模式就是比较合适的
     */
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.display(new Success());
        System.out.println("============");
        objectStructure.display(new Fail());
    }

}
