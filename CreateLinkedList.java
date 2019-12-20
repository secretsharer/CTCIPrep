import java.io.*;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class LLNode {

        int data;
        LLNode next;

        // Constructor
        LLNode(int d) {
            data = d;
            next = null;
        }
    }
    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        LLNode new_node = new LLNode(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    public static LLNode delete(Node head, int d) {
        // create a node and set it to the given head
        Node n = head;
        // check if node n set to head is equal to the node we're trying to remove
        if (n.data == d) {
            return head.next; /* skip over head to delete it cuz what we're looking for*/
        }
        while (n.next != null) {
            if(n.next.data == d) {
                // if you find node to remove, break link and set it to next.next
                n.next = n.next.next;
            return head; /* head didn't change */
            }
            // if we don't find it, we just get rid of n by setting it equal to n.next
            n = n.next;
        }
        // return head, no dice
        return head;
    }

    void appendToTail(int d) {
        
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);
    }
}
