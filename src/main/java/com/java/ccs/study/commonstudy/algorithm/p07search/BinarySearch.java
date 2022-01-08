package com.java.ccs.study.commonstudy.algorithm.p07search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author caocs
 * @date 2022/1/7
 * 1.二分查找
 * 注意：使用二分查找的前提是，该数组是有序的。
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 7, 8, 9};
        int result = binarySearch(array, 0, array.length - 1, 3);
        System.out.println(result);
        List<Integer> indexList = binarySearchArray(array, 0, array.length - 1, 5);
        System.out.println(indexList);
    }

    /**
     * 二分查找：
     *
     * @param array     有序的数组
     * @param left      左边的下标
     * @param right     右边的下标
     * @param findValue 需要找的值
     * @return 如果找到则返回下标，否则返回-1。
     */
    public static int binarySearch(int[] array, int left, int right, int findValue) {
        int mid = (left + right) / 2;
        int midValue = array[mid];
        if (left > right) {
            return -1;
        }
        if (findValue > midValue) {
            return binarySearch(array, mid + 1, right, findValue);
        } else if (findValue < midValue) {
            return binarySearch(array, left, mid - 1, findValue);
        } else {
            return mid;
        }
    }


    /**
     * 扩展：
     * 二分查找所有等于findValue值的下标
     *
     * @param array     有序的数组
     * @param left      左边的下标
     * @param right     右边的下标
     * @param findValue 需要找的值
     * @return 如果找到则返回下标，否则返回-1。
     */
    public static List<Integer> binarySearchArray(int[] array, int left, int right, int findValue) {
        int mid = (left + right) / 2;
        int midValue = array[mid];
        if (left > right) {
            return Collections.singletonList(-1);
        }
        if (findValue > midValue) {
            return binarySearchArray(array, mid + 1, right, findValue);
        } else if (findValue < midValue) {
            return binarySearchArray(array, left, mid - 1, findValue);
        } else {
            List<Integer> indexList = new ArrayList<>();
            for (int i = mid; i <= right && array[i] == midValue; i++) {
                indexList.add(i);
            }
            for (int i = mid - 1; i >= left && array[i] == midValue; i--) {
                indexList.add(i);
            }
            return indexList;
        }
    }

}
