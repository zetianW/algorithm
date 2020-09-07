package com.algorithm.binarysearch;

/**
 * Description(类功能描述):
 *    二分查找（有序数组）
 * @author Zetian Wang
 * @date 2020/09/07
 **/
public class BinarySearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        //目标元素
        int target = 5;
        //记录开始位置
        int begin = 0;
        //记录结束位置
        int end = arr.length-1;
        //记录中间位置
        int between = (begin+end)/2;
        //记录目标位置
        int index = -1;
        //循环查找
        while (true) {
            //判断中间元素是否为需要查找的元素
            if(arr[between] == target){
                index = between;
                break;
                //中间的元素不是要查找的元素
            }else{
                //判断中间这个元素是否比需要的元素大
                if(arr[between]>target){
                    //把结束位置调整到中间元素之前
                    end = between-1;
                    //中间元素比目标元素小
                }else{
                    //把开始位置调整到中间位置的后一个元素
                    begin = between+1;
                }
                //取出新的中间位置
                between = (begin+end)/2;
            }
        }
        System.out.println("index:"+index);
    }
}
