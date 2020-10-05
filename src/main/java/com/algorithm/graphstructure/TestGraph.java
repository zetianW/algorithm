package com.algorithm.graphstructure;

import java.util.Arrays;

/**
 * @author Ghost
 */
public class TestGraph {
    public static void main(String[] args) {
        //添加节点
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        Graph graph = new Graph(5);
        //添加矩阵
       graph.addVertex(v1);
       graph.addVertex(v2);
       graph.addVertex(v3);
       graph.addVertex(v4);
       graph.addVertex(v5);
       //添加边相邻节点的边
        graph.addEdg("A","C");
        graph.addEdg("B","C");
        graph.addEdg("A","B");
        graph.addEdg("B","D");
        graph.addEdg("B","E");
        for (int[] a: graph.adjMat){
            System.out.println(Arrays.toString(a));
        }
        //深度优先遍历
        graph.dfs();
    }
}
