package com.java.ccs.study.commonstudy.algorithm.p09tree.t02seqtree;

/**
 * @author caocs
 * @date 2022/1/8
 * 顺序存储二叉树：
 * 一个完全二叉树，其实可以用数组来顺序存储。
 * （1）第n个元素的左子节点为2*n+1
 * （2）第n个元素的右子节点为2*n+2
 * （3）第n个元素的父节点为(n-1)/2
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        preOrder(array,0);
    }

    /**
     * 顺序存储的二叉树，前序遍历
     *
     * @param array
     * @param index
     */
    public static void preOrder(int[] array, int index) {
        if (array == null || array.length == 0) {
            System.out.println("null");
        }
        System.out.println(array[index]);
        // 向左递归遍历
        if ((index * 2 + 1) < array.length) {
            preOrder(array, index * 2 + 1);
        }
        // 向左递归遍历
        if ((index * 2 + 2) < array.length) {
            preOrder(array, index * 2 + 2);
        }
    }

}
