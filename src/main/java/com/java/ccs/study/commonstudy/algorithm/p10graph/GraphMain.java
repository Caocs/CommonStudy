package com.java.ccs.study.commonstudy.algorithm.p10graph;

/**
 * @author caocs
 * @date 2022/1/8
 */
public class GraphMain {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        String[] vertexArray = {"A","B","C","D","E"};
        for (String vertex:vertexArray){
            graph.insertVertex(vertex);
        }
        // A-B,A-C,B-C,B-D,B-E
        graph.insertEdge(0,1,1);
        graph.insertEdge(0,2,1);
        graph.insertEdge(1,2,1);
        graph.insertEdge(1,3,1);
        graph.insertEdge(1,4,1);

        graph.showGraph();
    }

}
