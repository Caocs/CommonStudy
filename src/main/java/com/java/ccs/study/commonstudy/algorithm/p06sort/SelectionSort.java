package com.java.ccs.study.commonstudy.algorithm.p06sort;

/**
 * @author caocs
 * @date 2022/1/4
 * 2.选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 7, 1};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    /**
     * 选择排序：
     * （1）每轮都找到最小的元素。
     *
     * @param array 待排序数组
     */
    private static void selectionSort(int[] array) {
        int length = array.length;
        int minIndex;
        int temp;
        for (int i = 0; i < length; i++) { // 每一次确定第i位置的元素
            minIndex = i;
            for (int j = i; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

}
