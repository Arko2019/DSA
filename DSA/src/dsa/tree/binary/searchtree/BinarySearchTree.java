package dsa.tree.binary.searchtree;


import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;

    BinarySearchTree() {
        root = null;
    }

    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
                BinaryNode node = new BinaryNode();
            node.value = value;
            return node;
        }
        if (currentNode.value > value) {
            currentNode.leftNode = insert(currentNode.leftNode, value);
            return currentNode;
        } else {
            currentNode.rightNode = insert(currentNode.rightNode, value);
            return currentNode;
        }

    }

    void insert(int value) {
       root= insert(root, value);
    }

    //BFS root->left->right
    void preorder(BinaryNode currentNode) {
        if (currentNode == null)
            return;
        System.out.print(currentNode.value+" : ");
        preorder(currentNode.leftNode);
        preorder(currentNode.rightNode);
    }
    //BFS left->root->right
    void inorder(BinaryNode currentNode) {
        if (currentNode == null)
            return;

        inorder(currentNode.leftNode);
        System.out.print(currentNode.value+" : ");
        inorder(currentNode.rightNode);
    }
    //left->right->root
    void postOrder(BinaryNode currentNode) {
        if (currentNode == null)
            return;

        postOrder(currentNode.leftNode);
        postOrder(currentNode.rightNode);
        System.out.print(currentNode.value+" : ");
    }
    void levelOrder(){
        Queue<BinaryNode> queue=new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode current=queue.remove()   ;
            System.out.print(current.value+" : ");
            if(current.leftNode!=null)
            queue.add(current.leftNode);
            if(current.rightNode!=null)
            queue.add(current.rightNode);
        }
    }

    boolean search(int val){
        if(root==null)
            return false;
        BinaryNode temp=root;
        while (temp!=null){
            if(temp.value==val){
                return true;
            }
            if(val<temp.value){
                temp=temp.leftNode;
            }else{
                temp=temp.rightNode;
            }
        }
        return false;
    }
}
