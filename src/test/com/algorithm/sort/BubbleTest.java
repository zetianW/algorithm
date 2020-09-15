package com.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/11
 **/
public class BubbleTest {

    @Test
    public void bubble() {
        int[] arr = new int[]{1,2,8,3,5,4,6};
        Bubble.bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}