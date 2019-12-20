// import java.util.LinkedList;

// class Node {
//     public String name;
//     public Node[] children;
// }

// class Graph {
//     public Node[] nodes;
//     public Node[] adjacent;
//     public boolean marked;
    
// }

// class GraphSearch {
//     enum State { Visited, Unvisited, Visiting}

    
//     boolean search(Graph g, Node start, Node end) {
//     if (start == end) {
//         return true;
//     }
//     // linked list for storing visited adjacents
//     LinkedList<Node> q = new LinkedList<>();
//     // Get all the notes from the graph and mark them as unvisited
//         for (Node u : g.getNodes) {
//             u.state = State.Unvisited;
//         }
//     //set first to be currently visiting
//     start.state = State.Visiting;
//     // add that first node to the linkedlist/q storage
//     q.add(start);
//     // redelcare Node u; ?
//     Node u;
//     while (!q.isEmpty()) {
//         // aka dequeue
//         u = q.removeFirst();
//         // check if not null to continue
//         if (u != null) {
//             // check v's adjacents
//             for (Node v : u.getChildren()) {
//                 // check of those which are unvisited
//                 if (v.state == State.Unvisited) {
//                     // and if it's the node we're looking for
//                     if(v == end) {
//                         return true;
//                     } else {
//                         // otherwise set the nodes state to currently visiting
//                         v.state = State.Visiting;
//                         // add that node to the q
//                         q.add(v);
//                     }
//                 }
//             }
//             // set some final node to visited, don't get this part
//             u.state = State.Visited;
//         }
//     }
// return false;
// }


// }