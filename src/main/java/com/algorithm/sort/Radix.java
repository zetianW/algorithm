package com.algorithm.sort;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/15
 **/
public class Radix {
    public static void radix(int[] arr){
        //查找数组中的最大值
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //求最大数字是几位数
        int maxlength = (max+"").length();
        //用于临时存储数据的数组
        int[][] temp = new int[10][arr.length];
        //用于记录在temp中相应的数组中存放的数字的数量
        int[] counts = new int[10];
        //根据最大长度的数决定比较的次数，其中n是取数字的个位还是十分位还是百分位
        for (int i = 0,n=1; i <maxlength ; i++,n*=10) {
            //把每一个数字分别计算余数
            for(int j = 0;j<arr.length;j++){
                //计算余数
                int ys = arr[j]/n%10;
                //把当前遍历的数据放入指定的数组中
                temp[ys][counts[ys]] = arr[j];
                //记录数量
                counts[ys]++;
            }
            //记录取的元素需要放置的位置
            int index = 0;
            //把数字取出来
            for(int k = 0;k<counts.length;k++){
                //记录数量的数组中当前余数记录的数量不为0
                if(counts[k] !=0){
                    for(int l = 0;l<counts[k];l++){

                        //取出元素
                        arr[index] = temp[k][l];
                        //记录下一个位置
                        index++;
                    }
                    //把数量置为0
                    counts[k] = 0;
                }
            }
        }
    }
}
