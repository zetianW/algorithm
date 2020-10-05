package com.algorithm.binarytree.binarysorttree;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/22
 **/
public class BinarySortTree {
    Node root;

    /**
     * 向二叉排序树中添加节点
     *
     * @param node
     */
    public void add(Node node) {
        //如果是一棵空树
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    /**
     * 中序遍历二叉排序树，从小到大的顺序
     */
    public void midShow() {
        if (root != null) {
            root.midShow(root);
        }
    }

    public Node search(int value) {
        if (root == null) {
            return null;
        } else {
            return root.search(value);
        }
    }

    /**
     * 删除子节点
     */
    public void delete(int value) {
        if (root == null) {
            return;
        } else {
            //找到节点
            Node target = search(value);
            //如果没有找到该节点
            if (target == null) {
                return;
            }
            //找到父节点
            Node parent = searchParent(value);
            //要删除的节点是叶子节点
            if (target.left == null && target.right == null) {
                //要删除的节点是父节点的左子节点
                if (parent.left.value == value) {
                    parent.left = null;
                    //要删除的节点是父节点的右子节点
                } else {
                    parent.right = null;
                }
                //要删除的节点有两个子节点
            } else if (target.left != null && target.right != null) {
                //删除右子树中值最小的节点，获取到该节点的值
                int min = deleteMin(target.right);
                //替换目标节点的值
                target.value = min;
                //要删除的节点有一个左子节点或者右子节点
            } else {
                //有左子节点
                if (target.left != null) {
                    if (parent.left.value == value) {
                        parent.left = target.left;
                        //要删除的节点是父节点的右子节点
                    } else {
                        parent.right = target.left;
                    }
                    //有右子节点
                } else {
                    if (parent.left.value == value) {
                        parent.left = target.right;
                        //要删除的节点是父节点的右子节点
                    } else {
                        parent.right = target.right;
                    }
                }
            }
        }
    }

    /**
     * 删除一棵树中最小的节点
     *
     * @param node
     * @return
     */
    private int deleteMin(Node node) {
        Node target = node;
        while (target.left != null) {
            target = target.left;
        }
        delete(target.value);
        return target.value;
    }

    /**
     * 搜索父节点
     *
     * @param value
     * @return
     */
    public Node searchParent(int value) {
        if (root == null) {
            return null;
        } else {
            return root.searchParent(value);
        }
    }
}
