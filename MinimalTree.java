class Solution {
    public static void main(String[] args) {
        TreeBuilder testTree = new TreeBuilder();
        result = testTree.createMinimalTree(nodes);
        
        System.out.println(result);
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

class TreeBuilder {

    Node createMinimalTree(Node [] nodes) {
        return createMinimalTree(nodes, 0, nodes.length - 1);
    }
    Node createMinimalTree(Node [] nodes, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = start + end / 2;
        Node n = new Node(arr[mid]);
        n.left = createMinimalTree(arr, start, mid - 1);
        n.right = createMinimalTree(arr, mid+1, end);
        return n;
    }
}
