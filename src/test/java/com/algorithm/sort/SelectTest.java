package com.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/13
 **/
public class SelectTest {

    @Test
    public void select() {
        int[] arr = new int[] {1,6,2,4,3,8,0,4};
        Select.select(arr);
        System.out.println(Arrays.toString(arr));
    }
}