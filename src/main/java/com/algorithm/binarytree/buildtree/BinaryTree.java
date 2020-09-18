package com.algorithm.binarytree.buildtree;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/15
 **/
public class BinaryTree {
    TreeNode root;
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * 获取根节点
     * @return
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * 前序遍历
     */
    public void frontShow(){
        root.frontShow();
    }
    /**
     * 中序遍历
     */

    public void midShow(){
        root.midShow();
    }
    /**
     *   后序遍历
     */
    public void afterShow(){
        root.afterShow();
    }

    /**
     * 删除子树
     * @param i
     */
    public void delete(int i) {
        if(root.value == i){
            root = null;
        }else {
            root.delete(i);
        }
    }
}
