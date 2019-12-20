class TreeBuilder {
    
    public static void main(String args[]) {
        Tree tree = new Tree();

        /*
         * Construct the following binary tree 1 / \ 2 3 / \ 4 5 / 7
         */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);

        tree.countDescendants(tree.root);

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

    public int countDescendants(Node root) {
        if (root != null) {
            countDescendants(root.left);
            count(nodeCount);
            countDescendants(root.right);
        }
        return nodeCount - 1;
    }

    public int count(int nodeCount) {
        return nodeCount++;
    }
}
