package com.algorithm.node;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/10
 **/
public class LoopNode {
    /**
     * 节点内容
     */
    int data;
    /**
     * 下一个节点
     */
    LoopNode next = this;

    public LoopNode(int data) {
        this.data = data;
    }
    /**
     * 插入一个节点，做为当前节点的下一个节点
     */
    public void after(LoopNode node){
        //取出下一个节点，作为下下一个节点
        LoopNode nextNext = next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //把下下一个节点设置为新节点的下一个节点
        node.next = nextNext;

    }


    public void removeNext() {
        //取出下下一个节点
        LoopNode newNext = next.next;
        //把下下一个节点设置为当前节点的下一个节点
        this.next = newNext;
    }

    /**
     * 获取下一个节点
     * @return
     */
    public LoopNode next() {
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
