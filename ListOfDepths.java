import java.util.LinkedList;

class Solution {


    void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
        // base case
        if (root == null) {
            return;
        }

        LinkedList <TreeNode> list = null;
        // if the size of lists array is the same as the level we're on, 
        // we need to make a new list for the next leve.
        if (lists.size() == level) {
        list = new LinkedList<TreeNode>();
            /*
             * Levels are always traversed 'in order trav' so if this is the
             * first time we've visted level i, we must have seen levels zero through i-1 for zero indexing.
             * we can there therefor safely add the level at the end
             */ 
            // add the newest created list
        lists.add(list);
        } else {
            // or get the current level - i dont' understand this yet
            list = lists.get(level);
        }
        list.add(root);
        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);
    }

    ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
        createLevelLinkedList(root, lists, 0);
        return lists;
    }

    class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int value) {
            this.value = value;
            left = null;
            fight = null;
        }
    }

    // class BinaryTree {
    //     TreeNode root;

    // }

}

