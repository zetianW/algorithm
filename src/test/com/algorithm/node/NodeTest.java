package com.algorithm.node;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/09
 **/
public class NodeTest {
@Test
 public void Node(){
    /**
     * 创建节点
     */
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    /**
     * 追加节点
     */
    n1.append(n2);
    n1.append(n3);
    /**
     * 取出下一个节点
     */
   // System.out.println(n1.next().getData());
    //判断节点是否是最后一个节点
    //System.out.println(n1.next().next().isLast());
   //显示所有节点内容
   //n1.show();
   //删除一个节点(删除节点n2)
   //n1.removeNext();
   //n1.show();
   //插入一个新的节点
   Node node = new Node(4);
   //如果想要调整插入节点的位置，可在此处继续添加next()方法
   n1.next().after(node);
   n1.show();

}
}