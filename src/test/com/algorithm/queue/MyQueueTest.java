package com.algorithm.queue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/09
 **/

public class MyQueueTest {
    @Test
    public void testMyQueue(){
        //创建一个新的队列
        MyQueue<Integer> myQueue = new MyQueue<>();
        //给队列中存入元素
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        //出队
        System.out.println(myQueue.poll());
    }
}