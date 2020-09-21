package com.algorithm.node;

import org.junit.Test;

/**
 * Description(类功能描述):
 *  循环的双向链表测试方法体
 * @author Zetian Wang
 * @date 2020/09/10
 **/
public class DoubleNodeTest {

   @Test
    public void DoubleNode(){
       //创建节点
       DoubleNode n1 = new DoubleNode(1);
       DoubleNode n2 = new DoubleNode(2);
       DoubleNode n3 = new DoubleNode(3);
       //追加节点
      n1.after(n2);
      n2.after(n3);
       //查看上，自己，下节点的内容
       System.out.println(n2.pre().getData());
       System.out.println(n2.getData());
       System.out.println(n2.next().getData());
   }
}