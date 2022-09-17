package leetcode.recursion;

import dataStructure.TreeNode;
import util.Array2Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Leetcode 145: 二叉树后序遍历
 * 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
 *
 * 输入：root = [1,null,2,3]
 * 输出：[3,2,1]
 */
public class LC145 {
    /**
     * 后续遍历
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

    /**
     * 递归
     */
    public void postorder(TreeNode root, List<Integer> res) {
        // 一直递归到空的时候结束
        if (root == null) {
            return;
        }
        // 后序遍历顺序：左子节点->右子节点->父结点
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入节点数: ");
        int num = in.nextInt();
        int[] nodes = new int[num];
        System.out.println("输入节点值（-1为null）: ");
        for (int i = 0; i < num; i++) {
            nodes[i] = in.nextInt();
        }
        // 数组转二叉树
        Array2Tree array2Tree = new Array2Tree();
        TreeNode treeNode = array2Tree.constructBinaryTree(nodes);
        // 检查输入
        System.out.println("输入的二叉树为：" + treeNode);
        LC145 lc145 = new LC145();
        List<Integer> integers = lc145.postorderTraversal(treeNode);
        // 输出结果
        System.out.println(Arrays.toString(integers.toArray()));
    }
}
