package me.rainking;

import java.util.LinkedList;

/**
 * @author Rain
 * @date 2018/5/26
 */
public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        MergeTwoBinaryTrees o = new MergeTwoBinaryTrees();

        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(3);
        TreeNode a3 = new TreeNode(2);
        TreeNode a4 = new TreeNode(5);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;

        TreeNode b1 = new TreeNode(2);
        TreeNode b2 = new TreeNode(1);
        TreeNode b3 = new TreeNode(3);
        TreeNode b4 = new TreeNode(4);
        TreeNode b5 = new TreeNode(7);

        b1.left = b2;
        b1.right = b3;
        b2.right = b4;
        b3.right = b5;


        TreeNode t = o.mergeTrees(a1, b1);

        o.levelTree(t);


    }

    /**
     * 先序遍历
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t1.right, t2.right);

        return root;
    }

    /**
     * 按层遍历
     * 使用循环队列存储节点
     *
     */
    static final int MAXLEN = 100;

    void levelTree(TreeNode t) {

        TreeNode p1;
        TreeNode[] q1 = new TreeNode[MAXLEN];
        int head1 = 0, tail1 = 0;

        TreeNode p2;
        TreeNode[] q2 = new TreeNode[MAXLEN];
        int head2 = 0, tail2 = 0;

        if (t != null) {
            tail1 = (tail1 + 1) % MAXLEN;
            q1[tail1] = t;
        }

        while (head1 != tail1) {
            head1 = (head1 + 1) % MAXLEN;
            p1 = q1[head1];

            System.out.println(p1);

            if (p1.left != null) {
                tail1 = (tail1 + 1) % MAXLEN;
                q1[tail1] = p1.left;
            }

            if (p1.right != null) {
                tail1 = (tail1 + 1) % MAXLEN;
                q1[tail1] = p1.right;
            }
        }
    }


}
