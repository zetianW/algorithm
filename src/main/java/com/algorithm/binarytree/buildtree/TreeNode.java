package com.algorithm.binarytree.buildtree;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/15
 **/
public class TreeNode {
    /**
     * 节点的权
     */
    int value;
    /**
     * 左节点
     */
    TreeNode leftNode;
    /**
     * 右节点
     */
    TreeNode rightNode;

    /**
     * 标识指针类型
     * @param value
     */
    int leftType;
    int rightType;


    public TreeNode(int value) {
        this.value = value;
    }

    /**
     * 设置左节点
     *
     * @param leftNode
     */
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    /**
     * 设置右节点
     *
     * @param rightNode
     */
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    /**
     * 前序遍历
     */
    public void frontShow() {
        //先遍历当前节点的内容
        System.out.println(value);
        //左节点
        if (leftNode != null) {
            leftNode.frontShow();
        }
        //右节点
        if (rightNode != null) {
            rightNode.frontShow();
        }
    }

    /**
     * 中序遍历
     */
    public void midShow() {
        //左节点
        if (leftNode != null) {
            leftNode.midShow();
        }
        //当前节点
        System.out.println(value);
        //右节点
        if (rightNode != null) {
            rightNode.midShow();
        }
    }

    /**
     * 后序遍历
     */
    public void afterShow() {
        //左节点
        if (leftNode != null) {
            leftNode.afterShow();
        }
        //右节点
        if (rightNode != null) {
            rightNode.afterShow();
        }
        //当前节点
        System.out.println(value);
    }

    /**
     * 删除子树
     *
     * @param i
     */
    public void delete(int i) {
        TreeNode parent = this;
        //判断左节点
        if (parent.leftNode != null && parent.leftNode.value == i) {
            parent.leftNode = null;
            return;
        }
        //判断右节点
        if (parent.rightNode != null&&parent.rightNode.value == i) {
            parent.rightNode = null;
            return;
        }
        //递归检查并删除左节点
        parent = leftNode;
        if (parent != null) {
            parent.delete(i);
        }
        //递归检查并删除右节点
        parent = rightNode;
        if (parent != null) {
            parent.delete(i);
        }
    }
}
