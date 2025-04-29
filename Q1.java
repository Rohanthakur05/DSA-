import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class Q1 {
    static List<Integer> inorder = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            inorder.add(root.val);
            inorderTraversal(root.right);
        }
        return inorder;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println("Inorder Traversal: " + inorderTraversal(root)); // Output: [1, 3, 2]
    }
}