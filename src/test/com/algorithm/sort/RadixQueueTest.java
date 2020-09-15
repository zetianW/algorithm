package com.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/15
 **/
public class RadixQueueTest {

    @Test
    public void radixQueue() {
        int[] arr = new int[]{345,54,21,890,671,657,1000};
        RadixQueue.radixQueue(arr);
        System.out.println(Arrays.toString(arr));
    }
}