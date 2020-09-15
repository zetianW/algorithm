package com.algorithm.node;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/09
 **/
public class Node {
    /**
     * 节点内容
     */
    int data;
    /**
     * 下一个节点
     */
    Node next;

    public Node(int data) {
        this.data = data;
    }

    /**
     * 给节点追加节点
     */
    public void append(Node node) {
        //当前节点
        Node currentNode = this;
        while (true) {
            //取出下一个节点，赋值给当前节点
            Node nextNode = currentNode.next;
            //如果下一个节点为null,则结束循环
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        //把需要追加的节点追加为当前所找到的节点的下一个节点
        currentNode.next = node;
    }

    public void removeNext() {
        //取出下下一个节点
        Node newNext = next.next;
        //把下下一个节点设置为当前节点的下一个节点
        this.next = newNext;
    }

    /**
     * 插入一个节点，做为当前节点的下一个节点
     */
    public void after(Node node){
        //取出下一个节点，作为下下一个节点
        Node nextNext = next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //把下下一个节点设置为新节点的下一个节点
        node.next = nextNext;

    }

    /**
     * 打印出所有节点
     */
    public void show(){
        Node currentNode = this;
        while (true){
            System.out.println(currentNode.data);
            //取出下一个节点
            currentNode = currentNode.next;
            if(currentNode == null){
                break;
            }
        }
    }

    /**
     * 获取下一个节点
     */
    public Node next() {
        return this.next;
    }

    /**
     * 获取节点中的数据
     *
     * @return
     */
    public int getData() {
        return this.data;
    }

    /**
     * 查看当前节点是否是最后一个节点
     *
     * @return
     */
    public boolean isLast() {
        return next == null;
    }
}
