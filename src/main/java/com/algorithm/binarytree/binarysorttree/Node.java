package com.algorithm.binarytree.binarysorttree;

/**
 * Description(类功能描述):
 *
 * @author Zetian Wang
 * @date 2020/09/22
 **/
public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    /**
     * 返回当前节点的高度
     */
    public int height() {
        //无限递归取下去会出现空指针异常，所以必须判断它到最后是否为空，如果为空的话返回零
        return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height()) + 1;
    }

    /**
     * 获取左子树的高度
     */
    public int leftHeight() {
        if (left == null) {
            return 0;
        }
        return left.height();
    }

    /**
     * 获取右子树的高度
     */
    public int rightHeight() {
        if (right == null) {
            return 0;
        }
        return right.height();
    }

    /**
     * 向子树添加节点
     */
    public void add(Node node) {
        if (node == null) {
            return;
        }
        //判断传入的节点的值比当前子树的根节点的值大还是小
        //添加的节点比当前节点的值更小
        if (node.value < this.value) {
            //判断左节点是否为空
            if (this.left == null) {
                this.left = node;
                //不为空
            } else {
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
        //查询是否平衡
        if (leftHeight() - rightHeight() >= 2) {
            //双旋转
            if(left!=null&&left.leftHeight()<left.rightHeight()){
                //先把左边树进行旋转
                left.leftRotate();
                //把左边树旋转后再把整个树进行右旋转
                rightRotate();
            }
        }
        //进行左旋转
        if (leftHeight() - rightHeight() <= -2) {
            //双旋转
            if(right!=null&&right.leftHeight()<right.rightHeight()){
                //先把右边树进行旋转
                right.leftRotate();
                //把左边树旋转后再把整个树进行右旋转
                leftRotate();
            }
        }
    }
    /**
     * 进行左旋转
     */
    private void leftRotate(){
        //创建一个新的节点等于当前节点的值
        Node newleft = new Node(value);
        //把新节点的右子树设置为当前节点的右子树
        newleft.left = left;
        //把新节点的左子树设置为当前节点的左子树的右子树
        newleft.right = right.left;
        //把当前节点的值换为左子节点的值
        value = right.value;
        //把当前节点的左子树设置为左子树的
        right = right.right;
        //把当前节点的右子树设置为新节点
        left = newleft;
    }

    /**
     * 右旋转
     */
    private void rightRotate() {
        //创建一个新的节点等于当前节点的值
        Node newRight = new Node(value);
        //把新节点的右子树设置为当前节点的右子树
        newRight.right = right;
        //把新节点的左子树设置为当前节点的左子树的右子树
        newRight.left = left.right;
        //把当前节点的值换为左子节点的值
        value = left.value;
        //把当前节点的左子树设置为左子树的
        left = left.left;
        //把当前节点的右子树设置为新节点
        right = newRight;
    }

    /**
     * 中序遍历二叉排序树
     *
     * @param node
     */
    public void midShow(Node node) {
        if (node == null) {
            return;
        }
        midShow(node.left);
        System.out.println(node.value);
        midShow(node.right);
    }

    public Node search(int value) {
        if (this.value == value) {
            return this;
        } else if (value < this.value) {
            if (left == null) {
                return null;
            }
            return left.search(value);
        } else {
            if (right == null) {
                return null;
            }
            return right.search(value);
        }
    }

    /**
     * 搜索父节点
     *
     * @param value
     * @return
     */
    public Node searchParent(int value) {
        if ((this.left != null && this.left.value == value) || (this.right != null && this.right.value == value)) {
            return this;
        } else {
            if (this.value > value && this.left != null) {
                return this.left.searchParent(value);
            } else if (this.value < value && this.right != null) {
                return this.right.searchParent(value);
            }
            return null;
        }
    }
}

