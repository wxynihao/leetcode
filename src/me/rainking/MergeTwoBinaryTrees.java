package me.rainking;

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

        TreeNode right = t;

        while (right!=null){
            System.out.println(t);


            System.out.println(t.left);


            System.out.println(t.right);
        }






    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        TreeNode h = t1;

        TreeNode right;



        return h;
    }


}
