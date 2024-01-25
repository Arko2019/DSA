package dsa.tree.binary.searchtree;

public class BinaryMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);
        System.out.println("Pre Order Traversal");
        bst.preorder(bst.root);
        System.out.println();
        System.out.println("InOrder Traversal It prints asscending order");
        bst.inorder(bst.root);
        System.out.println();
        System.out.println("Level Order:");
        bst.levelOrder();
        System.out.println();
        System.out.println(bst.search(20));

    }
}
