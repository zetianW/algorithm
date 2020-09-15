package com.algorithm.stack;

import java.util.EmptyStackException;

/**
 * Description(类功能描述):栈实现
 *
 * @author Zetian Wang
 * @date 2020/09/08
 **/
@SuppressWarnings("unchecked")
public class MyStack<E> {
    /**
     * 栈的底层使用数组来存储
     */
    Object[] elements;

    public MyStack() {
        elements = new Object[0];
    }

    /**
     * 注入元素
     */
    public void push(E e) {
        //创建一个新的数组
        //3
        Object[] newArr = new Object[elements.length + 1];
        //把原数组中的值复制到新的数组之中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        /**
         * 把添加的元素放入新的数组中
         */
        newArr[elements.length] = e;
        //使用新的数组替换旧数组
        elements = newArr;
    }

    /**
     * 取出栈顶元素
     */
    public E pop() {
        //栈中没有元素
        if (elements.length == 0) {
            throw new EmptyStackException();
        }
        Object element = elements[elements.length - 1];
        //创建新的数组
        Object[] newArr = new Object[elements.length - 1];
        //把原数组中的元素放入新的数组中
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        //替换数组
        elements = newArr;
        //返回栈顶元素
        return (E)element;
    }

    /**
     * 查看栈顶元素
     */
    public E peek() {
        return (E)elements[elements.length - 1];
    }

    public int size(){
        return elements.length;
    }

}
