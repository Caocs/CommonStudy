package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t11chain.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:39 2022/5/15
 * 校长审批人
 */
public class ChancellorApprover extends Approver {
    public ChancellorApprover(String name) {
        super(name);
    }

    @Override
    protected boolean canProcess(PurchaseRequest request) {
        return true;
    }

    @Override
    protected void processRequest(PurchaseRequest request) {
        System.out.println("请求编号：" + request.getId() + "，处理人：" + this.name);
    }
}
