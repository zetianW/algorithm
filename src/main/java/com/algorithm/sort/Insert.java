package com.algorithm.sort;

/**
 * Description(类功能描述):
 *  插入排序（拿后一个元素放到一个临时变量中，用这个变量和前一个元素一一比较，
 *  比前一个元素小就插入替换至前一个元素的位置，
 *  当比前一个元素大时，停止向前继续排序。直至排序完成）
 * @author Zetian Wang
 * @date 2020/09/13
 **/
public class Insert {

    public static void insert(int[] arr) {
        //遍历所有数字
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                //把当前元素赋值给一个零时变量
                int temp = arr[i];
                int j;
                //遍历当前数字的前面所有数字
                for(j = i-1;j>=0&&temp<arr[j];j--){
                    //把前一个数字赋值给后一个数字
                    arr[j+1] = arr[j];
                }
                //把临时变量（外围for循环的当前元素）赋值给不满足条件的后一个元素
                arr[j+1] = temp;
            }
        }
    }
}


