package com.java.ccs.study.commonstudy.algorithm.p06sort;

/**
 * @author caocs
 * @date 2022/1/6
 * 7，基数排序
 * 属于"分配式排序"，又称"桶子法"。
 * 它是通过键值的各个位的值，将要排序的元素分配至某些桶中，达到排序的作用。
 * 注意：
 * 占用内存很大
 */
public class RadixSort {

    public static void main(String[] args) {
        int[] array = {53, 3, 542, 748, 14, 214};
        radixSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 基数排序：
     *
     * @param array 待排序数组
     */
    private static void radixSort(int[] array) {
        int length = array.length;
        /**
         * 定义二维数组，表示10个桶，每个桶就是一个一维数组。
         * 为了防止向桶中放数据溢出，每个桶大小定位length。
         * 基数排序是使用空间换时间的经典算法
         */
        int[][] bucket = new int[10][length];
        /**
         * 为了记录每个桶中，实际存放了多少数据。我们定义一个一维数组来记录各个桶每次放入的数据个数。
         */
        int[] bucketCount = new int[10];

        // 需要经过多少轮放入桶操作，是和最大元素位数有关。
        // 1，达到元素最大的数的位数。
        int max = array[0];
        for (int i = 0; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int maxLength = (max + "").length(); // 得到最大数是几位数。

        for (int round = 0; round < maxLength; round++) {
            int temp = (int) Math.pow(10, round);
            // 针对每个元素的对应的round位进行排序处理
            for (int i = 0; i < length; i++) {
                int digit = array[i] / temp % 10;
                bucket[digit][bucketCount[digit]] = array[i];
                bucketCount[digit]++;
            }
            // 遍历每一个桶，将桶中数据放回原来数组中
            int index = 0;
            for (int j = 0; j < bucketCount.length; j++) {
                if (bucketCount[j] > 0) {
                    // 循环该桶，放入到array数组中
                    for (int k = 0; k < bucketCount[j]; k++) {
                        array[index] = bucket[j][k];
                        index++;
                    }
                }
                // 需要将bucketCount清零。
                bucketCount[j] = 0;
            }
        }

    }

}
