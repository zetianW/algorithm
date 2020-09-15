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
public class ShellTest {

    @Test
    public void shell() {
        int[] arr = new int[]{1,8,3,5,2,0,5,3,6};
        Shell.shell(arr);
        System.out.println(Arrays.toString(arr));
    }
}