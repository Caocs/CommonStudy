package com.java.ccs.study.commonstudy.algorithm.p06sort;

/**
 * @author caocs
 * @date 2022/1/5
 * 5.快速排序
 * 是对冒泡排序的一种改进
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 7, 1, -1, 6, 10};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 快速排序：
     * 思想：
     * 通过一趟排序将要排序的数据分隔成独立的两个部分，其中一部分的所有数据都比另一部分的小。
     * 然后按照此方法对这两部分数据分别进行快速排序。
     * 整个排序过程可以递归进行，以此达到整个数据变成有序序列。
     *
     * @param array 待排序数组
     */
    private static void quickSort(int[] array, int left, int right) {
        if (left > right) {
            return; // 退出递归的条件
        }
        int pivot = (left + right) / 2; // 找一个值作为中轴（最左值，最右值，中值都可以）
        int pivotValue = array[pivot];
        int l = left;
        int r = right;
        while (l < r) {
            while (l < r && array[r] >= pivotValue) {
                r--;
            }
            while (l < r && array[l] <= pivotValue) {
                l++;
            }
            // 找到左边的大于pivotValue，右边的小于pivotValue，则进行交换。
            if (l < r) {
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
            }
        }
        // 此时l=r，l左边的值都比pivotValue小于等于，l右边的值都比pivotValue大于等于。
        // 这时把l位置的值和pivot位置的值互换。
        array[pivot] = array[l];
        array[l] = pivotValue;

        quickSort(array, left, l - 1);
        quickSort(array, l + 1, right);
    }


}
