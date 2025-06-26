import java.util.*;

class Tree {
    class TreeNode {
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        TreeNode(int data) {
            this.data = data;
        }

    }

    // Inorder Traversal left->root -> right
    public void Inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        Inorder(root.leftChild);
        System.out.print(root.data + " ");
        Inorder(root.rightChild);
    }

    public int height(TreeNode root) {
        if (root == null || (root.leftChild == null && root.rightChild == null))
            return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    // Level order Traversal
    public void LevelOrder(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            System.out.print(curr.data + " ");
            if (curr.leftChild != null) {
                queue.add(curr.leftChild);
            }
            if (curr.rightChild != null) {
                queue.add(curr.rightChild);
            }
        }
    }

    // Diameter of Binary Tree
    public int diamterTree(TreeNode root) {
        if (root == null || root.leftChild == null && root.rightChild == null)
            return 0;
        int leftHeight = height(root.leftChild);
        int rightHeight = height(root.rightChild);
        int leftDia = diamterTree(root.leftChild);
        int rightDia = diamterTree(root.rightChild);
        int currDia = leftHeight + rightHeight;
        return Math.max(currDia, Math.max(leftDia, rightDia));
    }

    // Tree is balanced
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int leftHeight = height(root.leftChild);
        int rightHeight = height(root.rightChild);
        int diff = Math.abs(leftHeight - rightHeight);
        if (diff > 1)
            return false;
        return isBalanced(root.leftChild) && isBalanced(root.rightChild);
    }

    // Tree is Same
    public boolean isSame(TreeNode root, TreeNode root2) {
        if (root == null && root2 == null)
            return true;
        if (root == null || root2 == null)
            return false;
        if (root.data != root2.data)
            return false;
        return isSame(root.leftChild, root2.leftChild) && isSame(root.rightChild, root2.rightChild);
    }

    // Binary Tree Path
    public List<String> binaryTreePath(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root, ans, "");
        return ans;
    }

    public void helper(TreeNode root, List<String> ans, String s) {
        if (root == null)
            return;
        if (root.leftChild == null && root.rightChild == null) {
            ans.add(s);
            return;
        }
        helper(root.leftChild, ans, s + root.data + "->");
        helper(root.rightChild, ans, s + root.data + "->");
    }

    // Lowest Common Ancestor
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root)
            return root;
        TreeNode left = lowestCommonAncestor(root.leftChild, p, q);
        TreeNode right = lowestCommonAncestor(root.rightChild, p, q);
        if (left != null && right != null)
            return root;
        return (left != null) ? left : right;
    }

    // Invert Binary Tree
    public TreeNode invertBinaryTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode left = root.leftChild;
        TreeNode right = root.rightChild;
        root.leftChild = invertBinaryTree(left);
        root.rightChild = invertBinaryTree(right);
        return root;
    }

    // Symmetric Tree
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        root.leftChild = invertBinaryTree(root.leftChild);
        return isSame(root.leftChild, root.rightChild);
    }

    public void printLevel(TreeNode node, int level, boolean leftToRight) {
        if (node == null)
            return;

        if (level == 1) {
            System.out.print(node.data + " ");
        } else {
            if (leftToRight) {
                printLevel(node.leftChild, level - 1, leftToRight);
                printLevel(node.rightChild, level - 1, leftToRight);
            } else {
                printLevel(node.rightChild, level - 1, leftToRight);
                printLevel(node.leftChild, level - 1, leftToRight);
            }
        }
    }

    // Zig Zak Order
    public void ZigZakOrder(TreeNode root) {
        int level = height(root);
        boolean leftToRight = true;
        for (int i = 1; i <= level; i++) {
            printLevel(root, level, leftToRight);
            leftToRight=!leftToRight;

        }
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        TreeNode root = t.new TreeNode(1);
        TreeNode a = t.new TreeNode(2);
        TreeNode b = t.new TreeNode(3);
        TreeNode c = t.new TreeNode(4);
        TreeNode d = t.new TreeNode(5);
        TreeNode e = t.new TreeNode(6);
        TreeNode f = t.new TreeNode(7);

        TreeNode root2 = t.new TreeNode(1);
        TreeNode a1 = t.new TreeNode(2);
        TreeNode b1 = t.new TreeNode(3);
        TreeNode c1 = t.new TreeNode(4);
        TreeNode d1 = t.new TreeNode(5);
        TreeNode e1 = t.new TreeNode(6);

        root.leftChild = a;
        root.rightChild = b;
        a.leftChild = c;
        a.rightChild = d;
        b.rightChild = e;
        b.leftChild = f;

        root2.leftChild = a1;
        root2.rightChild = b1;
        a1.leftChild = c1;
        a1.rightChild = d1;
        d1.rightChild = e1;

        t.Inorder(root);
        System.out.println(" ");
        System.out.println("Height of TreeNode is :- " + t.height(root));
        System.out.println("Diamter of TreeNode :- " + t.diamterTree(root));
        System.out.println(t.isBalanced(root));
        System.out.println("Tree is Same or Not :- " + t.isSame(root, root2));
        System.out.println(t.binaryTreePath(root));
        System.out.println(t.lowestCommonAncestor(root, c, b).data);
        t.invertBinaryTree(root);
        // t.Inorder(root);
        System.out.println(t.isSymmetric(root));
        t.LevelOrder(root);
        t.ZigZakOrder(root);

    }
}