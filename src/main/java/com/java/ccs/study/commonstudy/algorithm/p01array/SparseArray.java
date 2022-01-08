package com.java.ccs.study.commonstudy.algorithm.p01array;

/**
 * @author caocs
 * @date 2021/12/20
 * 稀疏数组
 * （1）二维数组 转 稀疏数组
 * （2）稀疏数组 转 二维数组
 */
public class SparseArray {

    public static void main(String[] args) {
        int rowCount = 11;
        int colCount = 11;
        int chessArray[][] = new int[rowCount][colCount]; // 创建原始二维数组11*11，0表示没有棋子，1表示黑子，2表示白子。
        chessArray[1][2] = 1;
        chessArray[10][4] = 2;

        for (int[] row : chessArray) {
            for (int data : row) {
                System.out.print(data);
            }
            System.out.println();
        }

        // 将二维数组转为稀疏数组（1.先遍历得到非0个数，2.再记录非0数据）
        int sum = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                if (chessArray[i][j] != 0) {
                    sum++;
                }
            }
        }
        int sparseArray[][] = new int[sum + 1][3];
        // 初始化第0行数据
        sparseArray[0][0] = rowCount;
        sparseArray[0][1] = colCount;
        sparseArray[0][2] = sum;
        // 初始化后续数据
        int count = 1;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                if (chessArray[i][j] != 0) {
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArray[i][j];
                    count++;
                }
            }
        }
        for (int[] row : sparseArray) {
            for (int data : row) {
                System.out.print(data + " ");
            }
            System.out.println();
        }

        // 稀疏数组转二维数组
        int chessArrayNew[][] = new int[sparseArray[0][0]][sparseArray[0][1]];
        int total = sparseArray[0][2];
        for (int i = 1; i <= total; i++) { // 从1开始
            int tempRow = sparseArray[i][0];
            int tempCol = sparseArray[i][1];
            int tempNum = sparseArray[i][2];
            chessArrayNew[tempRow][tempCol] = tempNum;
        }
        for (int[] row : chessArrayNew) {
            for (int data : row) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }

}
