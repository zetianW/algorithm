package com.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/18
 **/
public class HeapTest {

    @Test
    public void maxHeap() {
        int[] arr = new int[]{9,6,8,7,0,1,10,4,2};
        Heap.heap(arr);
        System.out.println(Arrays.toString(arr));
    }
}