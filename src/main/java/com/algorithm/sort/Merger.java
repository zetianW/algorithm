package com.algorithm.sort;

/**
 * Description(类功能描述):
 * 归并排序(将需要排序的数组划分为大小大致相同的两个子集合，
 * 分别对两个子集合进行排序，
 * 最终将排好序的子集合并成为所需求的排好序的结合)
 *
 * @author Zetian Wang
 * @date 2020/09/14
 **/
public class Merger {
    public static void merge(int[] arr,int low,int high){
        int middle = (high+low)/2;
        if(low <high){
            //处理分割后左边的数字
            merge(arr,low,middle);
            //处理分割后右边的数字
            merge(arr,middle+1,high);
            //归并
            merger(arr,low,middle,high);
        }
    }
    /**
     * @param arr    数组
     * @param low    开始位置
     * @param middle 分割的位置
     * @param high   结束位置
     */
    public static void merger(int[] arr, int low, int middle, int high) {
        //创建一个临时数组(用于存储归并后的临时数组)
        int[] temp = new int[high - low + 1];
        //记录第一个数组中需要遍历的下标
        int i = low;
        //记录第二个数组中需要遍历的下标
        int j = middle + 1;
        //记录临时数组中存放的下标
        int index = 0;
        //遍历两个数组取出最小的数字，放入临时数组中
        while (i <= middle && j<=high) {
            //第一个数组的数据更小
          if(arr[i]<=arr[j]){
              temp[index] = arr[i];
              //让下标向后移动一位
              i++;
          }else{
              temp[index] = arr[j];
              j++;
          }
          index++;
        }
      //处理多余的数据
        while (j<=high){
            temp[index] = arr[j];
            j++;
            index++;
        }
        while(i<=middle){
            temp[index] = arr[i];
            i++;
            index++;
        }
        //把临时数组中的数据重新存入原数组中
        for (int k = 0; k<temp.length; k++ ){
            arr[k+low] = temp[k];
        }
    }
}
