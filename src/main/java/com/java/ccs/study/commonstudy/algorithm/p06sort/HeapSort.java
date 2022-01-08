package com.java.ccs.study.commonstudy.algorithm.p06sort;

import java.util.Arrays;

/**
 * @author caocs
 * @date 2022/1/8
 * 8.堆排序
 * 堆是一棵顺序存储的完全二叉树。设当前元素在数组中以R[i]表示，那么，
 * (1) 它的左孩子结点是：R[2*i+1];
 * (2) 它的右孩子结点是：R[2*i+2];
 * (3) 它的父结点是：R[(i-1)/2];
 * (4) R[i] <= R[2*i+1] 且 R[i] <= R[2i+2]。
 * <p>
 * 注：
 * 当想得到一个序列中第k个最小的元素之前的部分排序序列，最好采用堆排序。
 * 参考：https://www.cnblogs.com/jingmoxukong/p/4303826.html
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 8, 1, 6, 9};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 堆排序过程：
     * 1，从最后一个非叶子结点开始，作为根节点，局部调整为大顶堆。
     * （这样到最后i=0时，整个数组就是大顶堆结构了）
     * 2，将堆顶元素与末尾元素交换，将最大元素"沉"到数组末端。
     * 3，重新调整结构，使其满足堆定义。
     * 不断重复2,3过程，直到全部排序完成。
     *
     * @param array 待排序数组
     */
    public static void heapSort(int[] array) {
        int length = array.length;
        // 1,从右向左，从下往上。从最后一个非叶子结点开始逐渐调整
        for (int i = length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, length);
        }

        for (int j = length - 1; j > 0; j--) {
            // array[0]为当前大顶堆的堆顶(最大值)。
            // 2,堆顶和堆尾进行交换。
            int temp = array[j];
            array[j] = array[0];
            array[0] = temp;
            // 3,从新调整j长度的堆，调整成大顶堆。
            adjustHeap(array, 0, j);
        }
    }


    /**
     * 大顶堆->从小到大排序。
     * 把以parent下标为根的子树，调整成大顶堆。
     *
     * @param array  待排序数组
     * @param parent 非叶子结点作为根的子树，下标位置
     * @param length 待排序的长度
     */
    public static void adjustHeap(int[] array, int parent, int length) {
        int temp = array[parent]; // temp保存当前父节点
        int child = 2 * parent + 1; // 先找到左孩子位置

        while (child < length) {
            // 找到左右孩子中，较大的那个
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++; // 指向右子树
            }
            // 左后孩子较大的那个，和根节点比较。
            if (temp > array[child]) {
                /**
                 * 如果根节点更大，则直接break。
                 * 因为我们在第一次建堆的时候从后往前调整。这样就保证后续的树，都是大的节点在上面。
                 */
                break;
            } else {
                // 把孩子结点的值赋给父结点
                array[parent] = array[child];
                // 选取孩子结点的左孩子结点,继续向下筛选
                parent = child;
                child = 2 * child + 1; // 移动到左孩子节点
            }

        }
        // 上述while循环结束后，parent会指向比temp大的最下层的节点。
        array[parent] = temp; // 把temp放在该位置。
    }


}
