package com.algorithm.huffman.datacompre;

/**
 * Description(类功能描述):
 * @author Zetian Wang
 * @date 2020/09/22
 **/
public class Node implements Comparable<Node>{
    byte data;
    int weight;
    Node left;
    Node right;
    public Node(Byte data,int weight){
        this.data = data;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return o.weight-this.weight;
    }
}
