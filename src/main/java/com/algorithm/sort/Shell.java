package com.algorithm.sort;

/**
 * Description(类功能描述):
 * 希尔排序（比如有九个元素，先按照9/2的量点进行排序，
 * 然后按照4/2的量点进行排序，直至排序为0）
 *
 * @author Zetian Wang
 * @date 2020/09/13
 **/
public class Shell {
    public static void shell(int[] arr) {
        int half = 2;
        //遍历所有步长
        for (int d = arr.length / half; d > 0; d /= half) {
            //遍历所有元素
            for (int i = d; i < arr.length; i++) {
                //遍历本组中所有元素
                for (int j = i - d; j > 0; j -= d) {
                    //如果当前元素大于加上步长后的元素
                    if(arr[j]>arr[j+d]){
                        //交换元素的位置
                        int temp = arr[j];
                        arr[j] = arr[j+d];
                        arr[j+d] = temp;
                    }
                }
            }
        }
    }

}
