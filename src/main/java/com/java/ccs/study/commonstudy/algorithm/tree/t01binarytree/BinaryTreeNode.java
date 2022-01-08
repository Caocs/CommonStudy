package com.java.ccs.study.commonstudy.algorithm.tree.t01binarytree;

/**
 * @author caocs
 * @date 2022/1/8
 */
public class BinaryTreeNode {

    public int no;
    public String name;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int no, String name) {
        super();
        this.no = no;
        this.name = name;
    }


    @Override
    public String toString() {
        return "BinaryTreeNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
