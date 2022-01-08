package com.java.ccs.study.commonstudy.algorithm.p07search;

import java.util.Arrays;

/**
 * @author caocs
 * @date 2022/1/7
 * 3.斐波那契查找算法：
 */
public class FibSearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 7, 8, 9};
        int result = fibSearch(array, 11);
        System.out.println(result);
    }

    /**
     * 斐波那契数组长度
     */
    public static int maxSize = 20;

    /**
     * @return 创建一个长度maxSize的斐波那契数组
     */
    public static int[] fib() {
        int[] fib = new int[maxSize];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < maxSize; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    /**
     * 斐波那契查找算法：
     * int mid = left+F(k-1)-1
     */
    public static int fibSearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        int k = 0; // 表示斐波那契分割数值的下标
        int mid = 0;
        int[] fib = fib();
        // 找到斐波那契分割数值的下标
        while (high > fib[k] - 1) {
            k++;
        }
        // 因为f[k]值可能大于array的长度，因此需要构建一个新的数组，不足的部分使用0填充。
        int[] temp = Arrays.copyOf(array, fib[k]);
        for (int i = high + 1; i < temp.length; i++) {
            // 把temp后面填充的部分，替换为array[high]
            temp[i] = array[high];
        }
        // 使用while循环处理，找到key对应的位置。
        while (low <= high) {
            mid = low + fib[k - 1] - 1;
            if (key < temp[mid]) {
                // 应该继续向左边查找。
                high = mid - 1;
                /**
                 * 为什么是k--：
                 * 1.全部元素=前面元素 +后面元素
                 * 2.fib[k] = fib[k-1] + fib[k-2]
                 * 因为前面有fib[k-1]个元素。
                 */
                k--;
            } else if (key > temp[mid]) {
                low = mid + 1;
                k -= 2; // 右面有fib[k-2]个元素
            } else {
                // temp后面可能是被填充的元素，所以需要确定返回的是哪个下标。
                if (mid <= high) {
                    return mid;
                } else {
                    return high;
                }
            }
        }
        return -1;


    }

}
