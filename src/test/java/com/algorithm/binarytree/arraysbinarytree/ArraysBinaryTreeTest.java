package com.algorithm.binarytree.arraysbinarytree;

import org.junit.Test;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/17
 **/
public class ArraysBinaryTreeTest {

    @Test
    public void frontShow() {
        int[] data = new int[]{1,2,3,4,5,6,7};
        ArraysBinaryTree arraysBinaryTree = new ArraysBinaryTree(data);
        //前序遍历
        arraysBinaryTree.frontShow();
    }

}