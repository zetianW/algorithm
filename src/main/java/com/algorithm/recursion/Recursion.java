package com.algorithm.recursion;

/**
 * Description(类功能描述):
 * 使用递归方法实现斐波那契数列(斐波那契数列是：1  1  2  3  5  8...)
 *
 * @author Zetian Wang
 * @date 2020/09/10
 **/
public class Recursion {
    public static int recursion(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return recursion(i - 1) + recursion(i - 2);
        }
    }
}

