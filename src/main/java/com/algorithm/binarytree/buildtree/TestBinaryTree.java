package com.algorithm.binarytree.buildtree;

/**
 * Description(类功能描述):
 *           错误： 获取5节点的后继节点时，后继节点显示为空指针异常
 *           原因：在删除前序遍历的节点元素时正好删除的是节点5，所以会显示空指针异常
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
        TreeNode fiveNode = new TreeNode(5);
        rootL.setRightNode(fiveNode);
        //为第二层的右节点创建两个子节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        //前序遍历树
       binaryTree.frontShow();
        System.out.println("--------接下来是中序遍历-----------");
        //中序遍历树
        binaryTree.midShow();
        System.out.println("---------接下来是后序遍历----------");
        //后序遍历
        binaryTree.afterShow();
        System.out.println("--------接下来是删除前序遍历的节点-----------");
        //删除前序遍历的节点
       // binaryTree.delete(5);
        //binaryTree.frontShow();
        System.out.println("--------接下来是中序化二叉树-----------");
        //中序线索化二叉树
        binaryTree.threadNodes();
        //获取5节点的后继节点
        //TreeNode afterFive = fiveNode.rightNode;
        //System.out.println(afterFive.value);
        binaryTree.threadIterate();

    }
}
