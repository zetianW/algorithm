package com.algorithm.node;

/**
 * Description(类功能描述):
 *     循环的双向链表
 * @author Zetian Wang
 * @date 2020/09/10
 **/
public class DoubleNode {
     //创建节点
    /**
     * 节点的上一个节点
     */
    DoubleNode pre = this;
    /**
     * 节点的下一个节点
     */
    DoubleNode next = this;
    /**
     * 创造一个节点数据
     */
    int data;
    /**
     * 创建构造方法
     */
    public  DoubleNode(int data){
        this.data = data;
    }

    /**
     * 增加节点
     * @param node
     */
    public void after(DoubleNode node){
        //原来的下一个节点
        DoubleNode nextNext = next;
        //把新节点做为当前节点的下一个节点
        this.next = node;
        //把当前节点作为新节点的前一个节点
        node.pre = this;
        //让原来的下一个节点作为新节点的下一个节点
        node.next = nextNext;
        //让原来节点的上一个节点为新的节点
        nextNext.pre = node;
    }
    /**
     * 获取下一个节点的方法
     */
    public DoubleNode next(){
        return this.next;
    }
    /**
     * 上一个节点
     */
    public DoubleNode pre(){
        return this.pre;
    }
    public int getData(){
        return this.data;
    }
}
