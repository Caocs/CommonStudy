package com.java.ccs.study.commonstudy.algorithm.p06sort;

/**
 * @author caocs
 * @date 2022/1/5
 * 4.希尔排序（缩小增量排序）
 * 是简单插入排序经过改进后的一个版本。
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 7, 1, -1, 6, 10};
        shellSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 希尔排序：
     * 插入时采用交换法。
     * 思想：
     * 把记录按下标的一定增量分组，对每组使用插入排序算法排序；
     * 随着增量逐渐缩小，直至减为1时算法结束。
     *
     * @param array 待排序数组
     */
    private static void shellSort(int[] array) {
        int length = array.length;
        for (int step = length / 2; step > 0; step /= 2) { // 步长逐渐缩小
            // 每个分组都进行插入排序
            for (int i = step; i < length; i++) {
                for (int j = i - step; j >= 0; j -= step) {
                    if (array[j] > array[j + step]) {
                        int temp = array[j];
                        array[j] = array[j + step];
                        array[j + step] = temp;
                    }
                }
            }
        }
    }

}
