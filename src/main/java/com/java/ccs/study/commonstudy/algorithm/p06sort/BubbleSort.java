package com.java.ccs.study.commonstudy.algorithm.p06sort;

/**
 * @author caocs
 * @date 2022/1/4
 * 1.冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 7, 1};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    /**
     * 冒泡排序：
     * （1）如果相邻的元素逆序则交换。
     * （2）如果在某趟排序中，没有发生一次交换，可以提前结束冒泡排序。（优化）
     *
     * @param array 待排序数组
     */
    private static void bubbleSort(int[] array) {
        int length = array.length;
        int temp;
        boolean flag;
        for (int i = length - 1; i > 0; i--) { // 每一次确定最后一个位置的元素
            flag = false;
            for (int j = 0; j < i; j++) { // 依次向后每每相邻比较
                if (array[j] > array[j + 1]) {
                    flag = true;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (!flag) {
                // 如果在某趟排序中，没有发生一次交换，则可以直接退出了。
                break;
            }
        }

    }

}
