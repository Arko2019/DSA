package dsa.tree.binary;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    BinaryTreeLL() {
        this.root = null;
    }

    // PreOrder Traversal rootNode ->left subtree->right Subtree:  All left->right
    void preOrder(BinaryNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " : ");
        preOrder(node.left);
        preOrder(node.right);

    }

    // InOrder Traversal leftSubtree->root Node->rightSubTree
    void inOrder(BinaryNode node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.value + " : ");
        inOrder(node.right);
    }

    // PostOrder Traversal leftSubtree->rightSubTree->rootNode
    void postOrder(BinaryNode node) {
        if (node == null)
            return;

        postOrder(node.left);

        postOrder(node.right);
        System.out.print(node.value + " : ");
    }

    // level order traversal
    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode bN = queue.remove();
            System.out.print(bN.value + " : ");
            if (bN.left != null) {
                queue.add(bN.left);
            }
            if (bN.right != null) {
                queue.add(bN.right);
            }
        }
    }

    // search
    void search(String val) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {


            BinaryNode node = queue.poll();
            if (node.value == val) {
                System.out.println("Matched");
                return;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

        }
        System.out.println("Not found");
    }

    //Insert new Node
    void insert(BinaryNode newNode) {
        if (root == null) {
            root = newNode;
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode node = queue.poll();
            if (node.left == null) {
                node.left = newNode;
                break;
            } else {
                queue.add(node.left);
            }
            if (node.right == null) {
                node.right = newNode;
                break;
            } else {
                queue.add(node.right);
            }

        }

    }

    void delete() {

    }

    BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode node = root;
        while (!queue.isEmpty()) {
            node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return node;
    }

    void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null, previousNode = null;

        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                previousNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);

        }
    }
}


