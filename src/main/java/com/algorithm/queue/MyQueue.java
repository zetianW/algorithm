package com.algorithm.queue;

/**
 * Description(类功能描述):
 *   队列
 * @author Zetian Wang
 * @date 2020/09/09
 **/
@SuppressWarnings("unchecked")
public class MyQueue<E> {
    /**
     * 创建一个数组
     */
    Object[] elements;
    public  MyQueue(){
        elements = new Object[0];
    }

    /**注入队列
     *
     */
    public void add(E e){
        /**
         * 创建一个新的数组
         */
        Object[] newArr= new Object[elements.length+1];
        /**
         * 把数组中的元素复制到新的数组中
         */
        for (int i = 0; i <elements.length ; i++) {
            newArr[i] = elements[i];
        }
        /**
         * 把添加的元素放入新的数组中
         */
        newArr[elements.length] = e;
        //新旧数组替换
        elements = newArr;
    }
    /**
     * 出队列
     */
     public E poll(){
         //把数组的第0个元素取出来
         Object element = elements[0];
         /**
          * 创建一个新数组
          */
         Object[] newArr = new Object[elements.length-1];
         //复制原有的数组到新的数组中
         for (int i = 0; i <newArr.length ; i++) {
             //因为已经提前把零个元素取出来了，所以复制后面的元素要向后取1个元素的位置
             newArr[i]=elements[i+1];
         }
         //替换新旧数组
         elements = newArr;
         return (E)element;
     }
    /**
     *   判断队列是否为空
     */
    public boolean isEmpty(){
         return elements.length==0;
    }
}
