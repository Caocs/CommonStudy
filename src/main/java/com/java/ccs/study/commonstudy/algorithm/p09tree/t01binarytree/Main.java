package com.java.ccs.study.commonstudy.algorithm.p09tree.t01binarytree;

/**
 * @author caocs
 * @date 2022/1/8
 */
public class Main {

    public static void main(String[] args) {
        BinaryTreeNode root = createBinaryTree();
        System.out.println("前序：");
        preOrder(root);
        System.out.println("中序：");
        midOrder(root);
        System.out.println("后序：");
        postOrder(root);
        System.out.println("前序查找：");
        BinaryTreeNode node = preOrderSearch(root, 2);
        System.out.println(node.toString());
        System.out.println("删除3后的前序：");
        deleteNode(root,3);
        preOrder(root);
    }

    /**
     * 创建如下二叉树：
     * ###1
     * #/##\
     * 2####3
     * #####\
     * ######4
     *
     * @return 返回根节点
     */
    public static BinaryTreeNode createBinaryTree() {
        BinaryTreeNode root = new BinaryTreeNode(1, "宋江");
        BinaryTreeNode node2 = new BinaryTreeNode(2, "卢俊义");
        BinaryTreeNode node3 = new BinaryTreeNode(3, "吴用");
        BinaryTreeNode node4 = new BinaryTreeNode(4, "公孙胜");
        root.left = node2;
        root.right = node3;
        node3.right = node4;
        return root;
    }

    /**
     * @param key 删除key节点及子树
     */
    public static void deleteNode(BinaryTreeNode root, int key) {
        if (root == null) {
            return;
        }
        // 删除节点
        if (root.left != null && root.left.no == key) {
            root.left = null;
        }
        if (root.right != null && root.right.no == key) {
            root.right = null;
        }
        // 左右子树递归查找删除
        if (root.left != null) {
            deleteNode(root.left, key);
        }
        if (root.right != null) {
            deleteNode(root.right, key);
        }
    }

    /**
     * 前序遍历，递归实现
     * 根左右
     */
    public static void preOrder(BinaryTreeNode root) {
        if (root != null) {
            System.out.println(root.toString());
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    /**
     * 前序遍历，查找key的节点。递归实现
     * 根左右
     */
    public static BinaryTreeNode preOrderSearch(BinaryTreeNode root, int key) {
        if (root == null) {
            return null;
        }
        // 先判断根
        if (root.no == key) {
            return root;
        }
        // 递归查找左子树
        BinaryTreeNode node = preOrderSearch(root.left, key);
        if (node != null) {
            return node;
        }
        // 左子树没找到，递归查找右子树
        return preOrderSearch(root.right, key);
    }

    /**
     * 中序遍历，递归实现
     * 左根右
     */
    public static void midOrder(BinaryTreeNode root) {
        if (root != null) {
            midOrder(root.left);
            System.out.println(root.toString());
            midOrder(root.right);
        }
    }

    /**
     * 后序遍历，递归实现
     * 左右根
     */
    public static void postOrder(BinaryTreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.toString());
        }
    }


}
