package NON_LINEAR_DATA_STRUCTURE.TREE;

import java.util.*;

public class TREE_STRUCTURE {
    public static void main(String[] args) {
        Tree tree = new Tree(1);

        TreeNode root = tree.root;

        tree.addChild(root, 2);
        tree.addChild(root, 3);
        tree.addChild(root, 4);

        tree.addChild(root.children.get(0), 5);
        tree.addChild(root.children.get(0), 6);

        tree.addChild(root.children.get(1), 7);

        System.out.println("Before Deletion:");
        tree.display(tree.root);
        System.out.println("\n Deleting node 2...");
        tree.dis

        }
}
class TreeNode{
    int data;
    List<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

class Tree {

    TreeNode root;

    Tree(int data) {
        root = new TreeNode(data);
    }

    void addChild(TreeNode parent, int data) {
        TreeNode newNode = new TreeNode(data);
        parent.children.add(newNode);
    }

    // Display tree
    void display(TreeNode node) { // 5
        if (node == null)
            return;

        System.out.print(node.data + " -> ");
        for (TreeNode child : node.children) {
            System.out.print(child.data + " ");
        }
        System.out.println();

        for (TreeNode child : node.children) {
            display(child);
        }
    }
    boolean delete(int key){
        if(node==null){
            System.out.println("Tree is empty");
            return false;
        }
        for(int i =0;i<node.children.size();i++){
            TreeNode child = node.children.get(i);
            if(chid.data==key){
                node.children=key;
                return true;
            }
        }

        for (TreeNode child : node.children) {
            delete(child.data)
        }

    }

}
