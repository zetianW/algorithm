package com.algorithm.huffman;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/19
 **/
public class Node implements Comparable<Node>{
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
    }

    @Override
    public int compareTo(Node o) {
        return this.value-o.value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
