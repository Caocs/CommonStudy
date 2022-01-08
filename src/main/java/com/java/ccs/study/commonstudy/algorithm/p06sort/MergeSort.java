package com.java.ccs.study.commonstudy.algorithm.p06sort;

/**
 * @author caocs
 * @date 2022/1/6
 * 6.归并排序
 * 分治法：
 * 先将问题分成一些小的问题，然后递归求解。
 * 而治的阶段将分阶段得到的各个答案"修补"在一起。
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 7, 1, -1, 6, 10};
        int length = array.length;
        int[] tempArray = new int[length];
        mergeSort(array, 0, length - 1, tempArray);

        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 分治排序
     * 先分成解两部分，然后对这两部分合并。
     * 分解时进行递归分解。
     */
    public static void mergeSort(int[] array, int left, int right, int[] tempArray) {
        if (left < right) {
            int mid = (left + right) / 2;
            // 向左递归进行分解
            mergeSort(array, left, mid, tempArray);
            // 向右递归进行分解
            mergeSort(array, mid + 1, right, tempArray);
            // 每分解一次，则合并一次
            merge(array, left, mid, right, tempArray);
        }
    }

    /**
     * 把从left到right的元素进行合并排序
     *
     * @param array     需要排序的数据
     * @param left      当前操作的最左元素下标
     * @param mid       左边有序数组的最右元素下标
     * @param right     当前操作的最右元素下标
     * @param tempArray 需要暂存数据的数据
     */
    public static void merge(int[] array, int left, int mid, int right, int[] tempArray) {
        System.out.println(String.format("left=%d,right=%d", left, right));
        int i = left; // 左边有序序列的初始索引
        int j = mid + 1; // 右边有序序列的初始索引
        int t = 0; // 指向tempArray数组的当前索引
        // 1，先把左右两边(有序)的数据按大小规则填充到tempArray中，直到有一边处理完毕为止。
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                tempArray[t] = array[i];
                t++;
                i++;
            } else {
                tempArray[t] = array[j];
                t++;
                j++;
            }
        }
        // 2,把剩余的数据依次填充到tempArray中。
        while (i <= mid) {
            tempArray[t] = array[i];
            t++;
            i++;
        }
        while (j <= right) {
            tempArray[t] = array[j];
            t++;
            j++;
        }
        // 3,将tempArray数组元素拷贝到array。（注意：并不是每次都拷贝所有）
        i = left;
        t = 0;
        while (i <= right) {
            array[i] = tempArray[t];
            t++;
            i++;
        }
    }

}
