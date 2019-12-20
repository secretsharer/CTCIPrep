

class Node {
    int value;
    int nodeCount;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
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


