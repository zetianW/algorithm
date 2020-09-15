package com.algorithm.binarytree.buildtree;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/15
 **/
public class TestBinaryTree {
    public static void main(String[] args) {
        /**
         *     创建一棵树
         */
        BinaryTree binaryTree = new BinaryTree();
        /**
         * 创建一个根节点
         */
        TreeNode root = new TreeNode(1);
        /**
         * 把根节点赋值给树
         */
        binaryTree.setRoot(root);
        //创建两个节点
        TreeNode rootL = new TreeNode(2);
        //把新创建的节点设置为根节点的子节点
        root.setLeftNode(rootL);
        //创建右节点
        TreeNode rootR = new TreeNode(3);
        root.setRightNode(rootR);
        //为第二层的左节点创建两个子节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        //为第二层的右节点创建两个子节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        //前序遍历树
       //binaryTree.frontShow();
        //中序遍历树
        //binaryTree.midShow();
        //后序遍历
        binaryTree.afterShow();
    }
}
