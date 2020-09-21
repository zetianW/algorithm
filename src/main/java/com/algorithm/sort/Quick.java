package com.algorithm.sort;

/**
 * Description(类功能描述):
 *  快速排序（找一个作为基准的数字，只要比这个基准小的数字就往左边移动，比这个基准大的数字就往右边移动）
 * @author Zetian Wang
 * @date 2020/09/11
 **/
public class Quick {
    public static void quick(int[] arr, int start, int end) {
        if (start < end) {
            //把数组中第0个元素作为标准数
            int stand = arr[start];
            //记录需要排序的下标
            int low = start;
            int high = end;
            //循环找比标准数大的数和比标准数小的数
            while (low < high) {
                //右边的数字比标准数大
                while (low < high && stand <= arr[high]) {
                    high--;
                }
                //使用右边的数字替换左边的数
                arr[low] = arr[high];
                //如果左边的数字比标准数小
                while (low < high && arr[low] <= stand) {
                    low++;
                }
                arr[high] = arr[low];
            }
            //把标准数赋值给低所在的位置的元素
            arr[low] = stand;
            //处理所有的小的数字
            quick(arr, start, low);
            //处理所有大的数字
            quick(arr, low + 1, end);
        }
    }
}
