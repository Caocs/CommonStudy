package com.java.ccs.study.commonstudy.designpattern.p05behavioralpattern.t11chain.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:27 2022/5/15
 */
public class Main {

    /**
     * 职责链模式：
     * 职责链模式通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推
     */
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000.0f);
        //创建相关的审批人
        TeachDirectorApprover teachDirectorApprover = new TeachDirectorApprover("童主任");
        DepartmentHeadApprover departmentHeadApprover = new DepartmentHeadApprover("王院长");
        ChancellorApprover chancellorApprover = new ChancellorApprover("郑校长");
        //设置后继者
        teachDirectorApprover.setNextApprover(departmentHeadApprover);
        departmentHeadApprover.setNextApprover(chancellorApprover);
        //发起一个请求
        teachDirectorApprover.processRequest(purchaseRequest); //请求编号：1，处理人：郑校长
    }

}
