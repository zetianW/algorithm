package com.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/13
 **/
public class InsertTest {

    @Test
    public void insert() {
        int[] arr = new int[]{1,5,2,8,9,3};
        Insert.insert(arr);
        System.out.println(Arrays.toString(arr));
    }
}