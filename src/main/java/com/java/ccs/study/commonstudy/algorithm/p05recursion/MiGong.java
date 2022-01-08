package com.java.ccs.study.commonstudy.algorithm.p05recursion;

/**
 * @author caocs
 * @date 2021/12/28
 * 迷宫问题
 */
public class MiGong {

    public static void main(String[] args) {
        int[][] map = initMap();
        boolean isFound = findWay(map, 1, 1);
        System.out.println(isFound);
        System.out.println("遍历后的地图");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * 使用递归找路
     * 小球从(1,1)开始出发，到达(6,5)结束。
     * 约定：
     * 1、map[i][j]中：0表示该点没有走过，1表示墙，2表示该点可以走，3表示该点已经走过，但是走不通。
     * 2、在走迷宫时，需要确定一个策略：下->右->上->左，如果该点走不通，再回溯。
     *
     * @param map 地图
     * @param i   从哪个位置开始找(行)
     * @param j   从哪个位置开始找(列)
     * @return 如果找到通路则返回true，否则返回false
     */
    public static boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            // 递归终止条件
            return true;
        }
        if (map[i][j] == 0) { // 如果当前这个点没有走过
            // 按照策略(下->右->上->左)，尝试是否可以走通
            map[i][j] = 2; // 首先假定该点可以走通
            if (findWay(map, i + 1, j)) {
                return true;
            } else if (findWay(map, i, j + 1)) {
                return true;
            } else if (findWay(map, i - 1, j)) {
                return true;
            } else if (findWay(map, i, j - 1)) {
                return true;
            } else {
                // 上下左右都尝试后，都没有走通。则认为是走不通的。
                map[i][j] = 3;
                return false;
            }
        } else {
            // 如果map[i][j]!=0，则可能为1,2,3。都认为是没办法走通的。
            // 哪怕map[i][j]==2，说明回溯到这个点了，说明上一条路是没有通过策略找到路。
            return false;
        }
    }


    /**
     * @return 初始化一个8行7列的迷宫。数字1表示墙。
     * 1 1 1 1 1 1 1
     * 1 0 0 0 0 0 1
     * 1 0 0 0 0 0 1
     * 1 1 1 0 0 0 1
     * 1 0 0 0 0 0 1
     * 1 0 0 0 0 0 1
     * 1 0 0 0 0 0 1
     * 1 1 1 1 1 1 1
     */
    public static int[][] initMap() {
        int[][] map = new int[8][7];
        // 上下全部置位1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        // 左右全部置位1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
//        map[1][2] = 1;
//        map[2][2] = 1;
        return map;
    }
}
