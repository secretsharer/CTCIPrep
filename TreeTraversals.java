// inorder traversal

class Main {
    public static void main(String[] args) {
        
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

void visit(Node node) {
    System.out.println(node.data);
}
// in order visits the left branch, then current, then right
void inOrderTraversal(Node node) {
    if (node != null) {
        inOrderTraversal(node.left);
        visit(node);
        inOrderTraversal(node.right);
    }
}
// pre order: visits the current before the child nodes
void preOrderTraversal(Node node) {
    if(node != null) {
        visit(node);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}
// post order: the current node is visited after its child nodes
void postOrderTraversal(Node node) {
    if(node != null) {
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        visit(node);
    }
}
// public add method
public void add(int value) {
    root = addRecursive(root, value);
}
// public find method
public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
}

// building in sorted order
private Node addRecursive(Node current, int value) {
    if(current == null) {
        return new Node(value);
    }
    if(value < current.value) {
        current.left = addRecursive(current.left, value);
    }
    if(value > current.value) {
        current.right = addRecursive(current.right, value);
    } 
    // else value already exists
    return current;
}

private BinaryTree createBinaryTree() {
    BinaryTree bt = new BinaryTree();

    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);

    return bt;
 }

 private boolean containsNodeRecursive(Node current, int value) {
    if(current == null) {
        return false;
    }
    if(value == current.value) {
        return true;
    }
    return value < current.value 
    ? (containsNodeRecursive(current.left, value))
    : containsNodeRecursive(current.right, value);
 }


}

