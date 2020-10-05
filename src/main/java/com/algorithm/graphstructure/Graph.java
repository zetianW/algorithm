package com.algorithm.graphstructure;

import com.algorithm.stack.MyStack;

/**
 * 图结构
 *
 * @author Ghost
 */
public class Graph {
    private Vertex[] vertex;
    private int currentSize;
    private MyStack<Integer> myStack = new MyStack<Integer>();
    /**
     * 当前遍历的下标
     */
    private int currentIndex;
    /**
     * 添加一个邻接矩阵
     */
    public int[][] adjMat;

    public Graph(int size) {
        vertex = new Vertex[size];
        adjMat = new int[size][size];
    }

    /**
     * 向图中加入顶点
     */
    public void addVertex(Vertex v) {
        vertex[currentSize++] = v;
    }

    /**
     * 具体要增加的边
     * 其中v1和v2是顶点的下标
     */
    public void addEdg(String v1, String v2) {
        //找出对应两个顶点的下标
        int index1 = 0;
        for (int i = 0; i < vertex.length; i++) {
            if (vertex[i].getValue().equals(v1)) {
                index1 = i;
                break;
            }
        }
        int index2 = 0;
        for (int i = 0; i < vertex.length; i++) {
            if (vertex[i].getValue().equals(v2)) {
                index2 = i;
                break;
            }
        }
        adjMat[index1][index2] = 1;
        adjMat[index2][index1] = 1;
    }

    /**
     * 深度优先算法遍历图
     */
    public void dfs() {
        //把第0个顶点标记为以访问状态
        vertex[0].visited = true;
        //把第0个元素顶点的下标放入
        myStack.push(0);
        //打印顶点的值
        System.out.println(vertex[0].getValue());
        //遍历
        while (!myStack.isEmpty()) {
            for (int i = currentIndex + 1; i < vertex.length; i++) {
                //如果和下一个遍历的元素是相通的
                if (adjMat[currentIndex][i] == 1 && vertex[i].visited == false) {
                    //把下一个元素压入栈中
                    myStack.push(i);
                    vertex[i].visited = true;
                    System.out.println(vertex[i].getValue());
                }
            }
            //弹出栈顶元素
            myStack.pop();
            //修改当前位置为栈顶元素的位置
           if (! myStack.isEmpty()){
               currentIndex = myStack.peek();
           }
        }

    }
}
