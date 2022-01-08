package com.java.ccs.study.commonstudy.algorithm.p07search;

/**
 * @author caocs
 * @date 2022/1/7
 * 插值查找算法：
 * 类似于二分查找，但是mid的计算公式不同。
 * 对于数据量较大，关键字分布比较均匀的查找表来说，使用插值查找速度比较快。
 * 关键字分布不均匀的情况下，不一定比二分查找好。
 */
public class InsertValueSearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 7, 8, 9};
        int result = insertValueSearch(array, 0, array.length - 1, 3);
        System.out.println(result);

    }

    /**
     * 二分查找：
     * int mid = (left + right) / 2;
     * 插值查找：
     * int mid = left+(right-left)*(key-array[left])/(array[right]-array[left])
     * 插值索引，使用拉格朗日定理。
     *
     * @param array     有序的数组
     * @param left      左边的下标
     * @param right     右边的下标
     * @param findValue 需要找的值
     * @return 如果找到则返回下标，否则返回-1。
     */
    public static int insertValueSearch(int[] array, int left, int right, int findValue) {
        if (left > right || findValue < array[0] || findValue > array[array.length - 1]) {
            return -1;
        }
        int mid = left + (right - left) * (findValue - array[left]) / (array[right] - array[left]);
        int midValue = array[mid];
        if (findValue > midValue) {
            return insertValueSearch(array, mid + 1, right, findValue);
        } else if (findValue < midValue) {
            return insertValueSearch(array, left, mid - 1, findValue);
        } else {
            return mid;
        }
    }

}
