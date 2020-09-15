package com.algorithm.sort;

/**
 * Description(类功能描述):
 *  冒泡排序（给无序数组进行排序，拿前一个元素和后一个元素进行比较，当大于后一个元素时向后移动。
 *  直至按照从小到大的顺序排列，将无序数组变为有序数组）
 *    一共需要比较   数组长度-1次  （arr.length-1）
 * @author Zetian Wang
 * @date 2020/09/11
 **/
public class Bubble {
    public static void bubble(int[] arr){
        //控制比较的轮数
        for (int i = 0; i <arr.length-1 ; i++) {
            //数组长度-1后再-i的原因是前面已经比较过第i个元素，后面就不需要进行比较
            //控制比较的次数
            for (int j = 0; j < arr.length-1-i; j++) {
                //比较，当数组中的前一个元素大于后一个元素时，调换两个元素的位置。
                if(arr[j]>arr[j+1]){
                    //新建一个空的变量，使它等于数组arr中的第j个元素
                    int temp = arr[j];
                    //将第j个元素位置调至第j+1个位置
                    arr[j] = arr[j+1];
                    //使得j+1个元素等于第j个元素
                    arr[j+1] = temp;
                }
            }
        }
    }
}
