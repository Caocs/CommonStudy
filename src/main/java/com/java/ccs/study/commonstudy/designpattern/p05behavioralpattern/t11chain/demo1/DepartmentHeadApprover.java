package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t11chain.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:38 2022/5/15
 * 院长审批人
 */
public class DepartmentHeadApprover  extends Approver {
    public DepartmentHeadApprover(String name) {
        super(name);
    }

    @Override
    protected boolean canProcess(PurchaseRequest request) {
        return request.getPrice() > 5000 && request.getPrice() <= 10000;
    }

    @Override
    protected void processRequest(PurchaseRequest request) {
        System.out.println("请求编号：" + request.getId() + "，处理人：" + this.name);
    }
}
