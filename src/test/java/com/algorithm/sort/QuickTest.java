package com.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/11
 **/
public class QuickTest {

    @Test
    public void quick() {
        int[] arr = new int[]{1,5,2,8,6,0,9};
       Quick.quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}