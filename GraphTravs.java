import sun.misc.Queue;

class Node {
    public String name;
    public Node [] children;
}

class Graph {
    public Node[] nodes;
    public Node[] adjacent;
    public boolean marked;
 
    // DFS
    void searchDFS(Node root) {
        if (root == null) {
            return;
        }
        visit(root);
        root.visited = true;
        for (Node n : children) {
            if (n.visited == false) {
                search(n);
            }
        }
    }

    // bfs
    void searchBFS(Node root) {
        Queue queue = new Queue<>();
        root.marked = true;
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            Node r = queue.dequeue();
            visit(r);
            for (Node n : children) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.enqueue(n);
                }
            }
        }
    }
}

