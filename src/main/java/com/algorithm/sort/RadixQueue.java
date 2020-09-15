package com.algorithm.sort;

import com.algorithm.queue.MyQueue;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/15
 **/
public class RadixQueue {
    public static void radixQueue(int[] arr) {
        //查找数组中的最大值
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //求最大数字是几位数
        int maxlength = (max + "").length();
        //用于临时存储数据的队列
        MyQueue[] temp = new MyQueue[10];
        //为队列数组赋值
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new MyQueue();
        }
        //根据最大长度的数决定比较的次数，其中n是取数字的个位还是十分位还是百分位
        for (int i = 0, n = 1; i < maxlength; i++, n *= 10) {
            //把每一个数字分别计算余数
            for (int j = 0; j < arr.length; j++) {
                //计算余数
                int ys = arr[j] / n % 10;
                //把当前遍历的数据放入指定的队列中
                temp[ys].add(arr[j]);
            }
            //记录取的元素需要放置的位置
            int index = 0;
            //把数字取出来
            for (int k = 0; k < temp.length; k++) {
                //当前遍历的队列不为空
                while (temp[k] != null) {
                    //取出元素
                    arr[index] = (int) temp[k].poll();
                    //记录下一个位置
                    index++;
                }
            }
        }
    }
}

