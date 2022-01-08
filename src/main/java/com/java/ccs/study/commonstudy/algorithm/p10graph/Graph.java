package com.java.ccs.study.commonstudy.algorithm.p10graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caocs
 * @date 2022/1/8
 * 图：
 * 一般有两种表示方式：
 * 1.二维数组（邻接矩阵）
 * 2.数组+链表（邻接表）
 */
public class Graph {
    /**
     * 存储顶点集合
     */
    private List<String> vertexList;
    /**
     * 存储图对应的邻接矩阵
     */
    private int[][] edges;
    /**
     * 表示边的数目
     */
    private int edgeNum;
    /**
     * 表示顶点的个数
     */
    private int vertexNum;

    public Graph(int n) {
        if (n <= 1) {
            // 我定义的这个图，最少有两个顶点
            throw new IllegalArgumentException("Illegal n");
        }
        vertexNum = n;
        edges = new int[n][n];
        vertexList = new ArrayList<>(n);
        edgeNum = 0;
    }

    /**
     * @param vertex 插入顶点
     */
    public void insertVertex(String vertex) {
        if (vertexList.size() >= vertexNum) {
            throw new IllegalArgumentException("The number of vertices is out of range");
        }
        vertexList.add(vertex);
    }

    /**
     * 添加边
     * 无向图，所以双向都需要添加。
     *
     * @param v1     出发顶点的下标
     * @param v2     达到顶点的下标
     * @param weight 权重
     */
    public void insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        edgeNum++;
    }

    /**
     * @return 得到边的数量
     */
    public int getEdgeNum() {
        return edgeNum;
    }

    /**
     * @return 根据下标得到顶点名称
     */
    public String getVertexByIndex(int index) {
        if (index < 0 || index >= vertexNum) {
            return null;
        }
        return vertexList.get(index);
    }

    /**
     * @return 得到v1-v2之间的边的权值
     */
    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }

    /**
     * 打印该图
     */
    public void showGraph() {
        for (int[] line : edges) {
            System.out.println(Arrays.toString(line));
        }
    }

}
