package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t11chain.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:32 2022/5/15
 */
public abstract class Approver {
    protected Approver nextApprover;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 设置后继者
     */
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void process(PurchaseRequest request) {
        if (canProcess(request)) {
            processRequest(request);
        } else {
            this.nextApprover.process(request);
        }
    }

    protected abstract boolean canProcess(PurchaseRequest request);

    /**
     * 处理请求的方法
     */
    protected abstract void processRequest(PurchaseRequest request);
}
