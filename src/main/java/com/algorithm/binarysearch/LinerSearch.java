package com.algorithm.binarysearch;

/**
 * Description(类功能描述):
 *        线性查找（无序）
 * @author Zetian Wang
 * @date 2020/09/07
 **/
public class LinerSearch {
    public static void main(String[] args) {
        //定义目标数组
        int[] arr = new int[]{1,4,5,8,2,9,6};
        //定义目标元素
        int target = 9;
        //定义数组下标
        int index = -1;
        for (int i = 0; i <arr.length ; i++) {
          if(arr[i] == target){
              index=i;
              break;
          }
        }
        System.out.println("index:"+index);
    }
}