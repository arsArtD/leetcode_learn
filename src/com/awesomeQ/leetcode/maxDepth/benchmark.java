package com.awesomeQ.leetcode.maxDepth;

class benchmark {
    public static void main(String[] args) {
        // 构造二叉树
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        // 构造二叉树

        solution1 s1 = new solution1();
        int depth = s1.maxDepth(root);
        System.out.println(depth);
    }
}