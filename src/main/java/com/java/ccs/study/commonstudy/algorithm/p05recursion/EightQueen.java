package com.java.ccs.study.commonstudy.algorithm.p05recursion;

/**
 * @author caocs
 * @date 2021/12/28
 * 八皇后问题(92)
 * 任意两个皇后不能处于同一行、同一列或者同一斜线上，问共有多少种摆法。
 */
public class EightQueen {

    private int max = 8;
    /**
     * 使用一维数组表示8皇后摆放位置，例如：arr[8]={0,4,7,5,2,6,1,3}
     */
    private int[] array = new int[max];

    private int count = 0;


    private void check(int n) {
        if (n == max) {
            count++;
            show();
            return;
        }
        // 依次把皇后放在不同的位置，并判断是否冲突
        for (int i = 0; i < max; i++) {
            // 先吧当前皇后n，放在该行的第i列
            array[n] = i;
            if (!checkConflict(n)) {
                // 如果不冲突，就可以继续放置n+1个皇后了
                check(n + 1);
            }
            // 如果冲突，就i++,判断该行后面的位置是否可以放置。
        }
    }


    /**
     * @return 判断摆放第n个皇后时，是否和前面皇后的冲突。
     * array[i]==array[n] 表示在同一列
     * Math.abs(n-i)==Math.abs(array[n]-array[i] 表示在同一斜线
     * 没有必要判断是否在同一行，因为n始终在递增。
     */
    private boolean checkConflict(int n) {
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * 打印8皇后摆放结果
     */
    private void show() {
        for (int i = 0; i < max; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private int count() {
        return count;
    }

    // 使用一维数组表示8皇后摆放位置 arr[8]={0,4,7,5,2,6,1,3}
    public static void main(String[] args) {
        EightQueen eightQueen = new EightQueen();
        eightQueen.check(0); // 从第一个皇后开始计算
        System.out.println("解法：" + eightQueen.count());
    }

}
