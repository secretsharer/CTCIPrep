import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {

        Tree tree = new Tree();
        /*
         * Constructs the following binary tree 1 / \ 2 3 / \ 4 5 / 7
         */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);

        tree.countDescendants(tree.root);
        System.out.print(tree.countDescendants(tree.root.left));
    }
}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

}

class Tree {
    Node root;
    int nodeCount = 0;

    public int countDescendants(Node root) { 
        Queue<Node> q = new LinkedList<Node>();
		if (root == null) { return -1; }
        q.add(root);
        nodeCount++;
		while (!q.isEmpty()) {
			Node n = (Node) q.remove();
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
        }
        return nodeCount;
    }
}

