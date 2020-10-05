package com.algorithm.stack;

import org.junit.Test;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/08
 **/

public class MyStackTest {
    @Test
    public void testMyStack() {
        //创建一个新的栈空间
        MyStack<Integer> ms = new MyStack<Integer>();
        //通过调用myStack的push方法注入元素
        ms.push(4);
        ms.push(3);
        ms.push(2);
        //打印出栈顶元素
        System.out.println("integer stack:"+ms.pop());
        System.out.println("integer stack:"+ms.pop());
        System.out.println("integer stack size:"+ms.size());
        //查看栈顶元素
        // System.out.println(ms.one());
        MyStack<String> stringMyStack = new MyStack<>();
        stringMyStack.push("1");
        stringMyStack.push("3");
        stringMyStack.push("61");
        stringMyStack.push("9");
        System.out.println("string stack:"+stringMyStack.peek());
        System.out.println("string stack size:"+stringMyStack.size());
    }
}
