package com.algorithm.binarytree.binarysorttree;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/22
 **/
public class BinarySortTreeTest {
    public static void main(String[] args) {
        //双旋转
        int[] arr= new int[]{8,9,5,4,6,7};
        //定义节点左旋转的数组
        //int[] arr =new int[]{2,1,4,3,5,6};
        //定义节点右旋转的数组
        //int[] arr = new int[]{8,9,6,7,5,4};
        //定义演示节点的删除的数组
        //int[] arr = new int[]{7, 3, 10, 12, 5, 1, 9};
        /**
         *     创建一颗二叉排序树
         */
        BinarySortTree bst = new BinarySortTree();
        //循环添加
        for (int i : arr) {
            bst.add(new Node(i));
        }
//        //查看树中的值
//        bst.midShow();
//        System.out.println("---------");
//        //查找节点
//        Node node = bst.search(10);
//        System.out.println(node.value);
//        Node node1 = bst.search(20);
//        System.out.println(node1);
//        System.out.println("-------------");
//        //测试查找父节点
//        Node p1 = bst.searchParent(1);
//        System.out.println(p1.value);
//        System.out.println("-------------");
        //删除叶子节点
//        bst.delete(5);
//        bst.midShow();
//       System.out.println("----------------");
      // bst.delete(3);
//        bst.midShow();
//        //删除有两个子节点的节点
//        bst.delete(7);
//        bst.midShow();
        //查看二叉树的高度
        System.out.println(bst.root.height());
        //查看根节点的值
        System.out.println(bst.root.value);
  }


}
