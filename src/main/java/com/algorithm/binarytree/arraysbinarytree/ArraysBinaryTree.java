package com.algorithm.binarytree.arraysbinarytree;

/**
 * Description(类功能描述):
 *   二叉树的顺序存储及遍历
 * @author Zetian Wang
 * @date 2020/09/17
 **/
public class ArraysBinaryTree {
    int[] data;
    public ArraysBinaryTree(int[] data){
        this.data = data;
    }
    public void frontShow(){
        frontShow(0);
    }
    /**
     *     前序遍历
     */
    public void frontShow(int index){
        if(data ==null || data.length == 0){
            return;
        }
        //先遍历当前节点的内容
        System.out.println(data[index]);
        //处理左子树：2*index+1
        if(2*index+1<data.length){
            frontShow(2*index+1);
        }
        //处理右子树：2*index+2
        if(2*index+2<data.length){
            frontShow(2*index+2);
        }
    }
}
