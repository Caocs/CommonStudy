package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t06flyweight.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 23:00 2022/5/9
 */
public class Main {

    /**
     * 享元模式：
     * 运用共享技术有效的支持大量细粒度的对象。
     * <p>
     * 说明：
     * 1）常用于系统底层开发，解决系统的性能问题。
     * 像数据库连接池，里面都是创建好的连接对象，在这些连接对象中有我们需要的则直接拿来用，避免重新创建，如果没有我们需要的，则创建一个
     * 2）享元模式能够解决重复对象的内存浪费的问题。
     * 当系统中有大量相似对象，需要缓冲池时，不需总是创建新对象，可以从缓冲池里拿。这样可以降低系统内存，同时提高效率
     * 3）享元模式经典的应用场景就是池技术。
     * String常量池、数据库连接池、缓冲池等等都是享元模式的应用，享元模式是池技术的重要实现方式
     * <p>
     * 将对象的信息分成两个部分
     * 内部状态：值对象共享出来的信息，存储在享元对象内部且不会随环境的改变而改变。
     * 外部状态：指对象得以依赖的一个标记，是随环境改变而改变的、不可共享的状态。
     * <p>
     * 案例说明：
     * 两个通过Integer.valueOf(127)的对象，==为true。 -> 就使用了享元模式
     * 当数值范围在[-128, 127]时，使用valueOf方法执行速度比new更快
     * <p>
     * 注意：
     * 1）在享元模式这样理解，“享”就表示共享，“元”表示对象
     * 2）系统中有大量对象，这些对象消耗大量内存，并且对象的状态大部分可以外部化时，我们就可以考虑选用享元模式
     * 3）用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象，用 HashMap/HashTable 存储
     * 4）享元模式大大减少了对象的创建，降低了程序内存的占用，提高效率
     * 5）享元模式提高了系统的复杂度，需要分离出内部状态和外部状态。而内部状态具有固化特性，不应该随着外部状态的改变而改变，这是我们使用享元模式需要注意的地方
     * 6）使用享元模式时，注意划分内部状态和外部状态，并且需要有一个工厂类加以控制
     * 7）享元模式经典的应用场景是需要缓冲池的场景，比如 String 常量池、数据库连接池
     */
    public static void main(String[] args) {
        Website newsWebsite = WebsiteFactory.getWebsiteCategory(Website.Type.新闻);
        newsWebsite.use(new User("Tom"));
        Website blogWebsite1 = WebsiteFactory.getWebsiteCategory(Website.Type.博客);
        blogWebsite1.use(new User("Jerry"));
        Website blogWebsite2 = WebsiteFactory.getWebsiteCategory(Website.Type.博客);
        blogWebsite2.use(new User("John"));
        Website blogWebsite3 = WebsiteFactory.getWebsiteCategory(Website.Type.博客);
        blogWebsite3.use(new User("Smith"));
        Website wxWebsite = WebsiteFactory.getWebsiteCategory(Website.Type.微信公众号);
        wxWebsite.use(new User("Mack"));
        System.out.println(WebsiteFactory.getSize()); // 只有3个对象实例。
    }

}
