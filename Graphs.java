import sun.misc.Queue;

class Node {
    public String name;
    public boolean visited;
    // public Node[] children;
}

class Graph {
    public Node[] nodes;
    public Node[] adjacent;
    public boolean marked;
 
    // recursive DFS
    void searchDFS(Node root) {
        if (root == null) {
            return;
        }
        visit(root);
        root.visited = true;
        for (Node n : adjacent) {
            if (n.visited == false) {
                searchDFS(n);
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
            for (Node n : adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.enqueue(n);
                }
            }
        }
    }
}

