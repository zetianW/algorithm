package com.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/14
 **/
public class MergerTest {

    @Test
    public void merger() {
        int[] arr = new int[]{1,0,2,1,3,7,7,5,4,8};
        Merger.merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}