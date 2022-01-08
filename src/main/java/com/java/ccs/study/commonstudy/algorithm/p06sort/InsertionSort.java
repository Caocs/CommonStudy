package com.java.ccs.study.commonstudy.algorithm.p06sort;

/**
 * @author caocs
 * @date 2022/1/4
 * 3.插入排序
 * 存在问题：当后面的数比较小时，会移动很多次。
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 7, 1, -1, 6, 10};
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 插入排序：
     * 把n个待排序的元素看成一个有序表和一个无序表，
     * 排序过程中，每次从无序表中取出一个元素，将它插入到有序表的适当位置。
     *
     * @param array 待排序数组
     */
    private static void insertionSort(int[] array) {
        int length = array.length;
        int temp;
        int insertIndex;
        for (int i = 1; i < length; i++) { // 每一次把第i位置放到插入到前面的有序表中
            temp = array[i];
            insertIndex = i;
            for (int j = 0; j < i; j++) {
                if (array[j] > temp) {
                    insertIndex = j; // 找到插入位置
                    break;
                }
            }
            for (int j = i - 1; j >= insertIndex; j--) {
                array[j + 1] = array[j];
            }
            array[insertIndex] = temp;
        }
    }
}
