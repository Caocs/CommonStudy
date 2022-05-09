package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t05facade.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:13 2022/5/9
 */
public class Main {

    /**
     * 外观模式
     * 通过定义一个一致的接口，用以屏蔽内部子系统的细节，使得调用端只需跟这个接口发生调用，而无需关心这个子系统的内部细节。
     * <p>
     * 结构说明：
     * 调用者：外观接口的调用者
     * 外观类：为调用端提供统一的调用接口，外观类直到哪些子系统负责处理请求，从而将调用端的请求代理给适当子系统对象。
     * 子系统：多个子系统，处理Facade对象指派的任务。
     * <p>
     * 案例说明：
     * MyBatis 中 Configuration 去创建 MetaObject 对象时使用到了外观模式
     * <p>
     * 外观模式的注意事项和细节
     * 1）外观模式对外屏蔽了子系统的细节，因此外观模式降低了客户端对子系统使用的复杂性
     * 2）外观模式对客户端与子系统的耦合关系，让子系统内部的模块更易维护和扩展
     * 3）通过合理的使用外观模式，可以帮我们更好的划分访问的层次
     * 4）当系统需要进行分层设计时，可以考虑使用 Facade 模式
     * 5）在维护一个遗留的大型系统时，可能这个系统已经变得非常难以维护和扩展，此时可以考虑为新系统开发一个 Facade 类，来提供遗留系统的比较清晰简单的接口，让新系统与 Facade 类交互，提高复用性
     * 6）不能过多的或者不合理的使用外观模式，使用外观模式好，还是直接调用模块好。要以让系统有层次，利于维护为目的
     */
    public static void main(String[] args) throws InterruptedException {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        System.out.println("===========家庭影院初始化============");
        homeTheaterFacade.ready();
        System.out.println("===========家庭影院沉浸式播放============");
        homeTheaterFacade.play();
        Thread.sleep(1000);
        System.out.println("===========家庭影院暂停============");
        homeTheaterFacade.pause();
        Thread.sleep(1000);
        System.out.println("===========家庭影院沉浸式播放============");
        homeTheaterFacade.play();
        Thread.sleep(1000);
        System.out.println("===========家庭影院结束============");
        homeTheaterFacade.end();
    }

}
