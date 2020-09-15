package com.algorithm.sort;

/**
 * Description(类功能描述):
 *选择排序（依次排序，遍历找到数组中最小的元素，将它放到第一个位置，然后依次找出第二个...）
 * @author Zetian Wang
 * @date 2020/09/13
 **/
public class Select {
    public static void select(int[] arr){
        //遍历所有的元素
        for (int i = 0; i <arr.length ; i++) {
            int min = i;
            //把当前遍历的数和后面的数依次进行比较，并记录最小元素的下标
            //i+1的意思时从第二个元素开始遍历比较
            for(int j = i+1;j<arr.length;j++){
                //如果后面比较的数比记录的最小的数小
                if(arr[min]>arr[j]){
                    //记录下最小数的下标
                    min=j;
                }
            }
            //如果最小的数和当前遍历数的下标不一致时，说明下标为min的数比当前遍历的数更小
            if(i != min ){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
