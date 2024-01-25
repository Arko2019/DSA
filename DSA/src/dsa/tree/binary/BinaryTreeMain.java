package dsa.tree.binary;

//Binary tree which divided into two node/max two children
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTreeLL binaryTreeLL = new BinaryTreeLL();
        BinaryNode n1 = new BinaryNode();
        n1.value = "N1";
        BinaryNode n2 = new BinaryNode();
        n2.value = "N2";
        BinaryNode n3 = new BinaryNode();
        n3.value = "N3";
        BinaryNode n4 = new BinaryNode();
        n4.value = "N4";
        BinaryNode n5 = new BinaryNode();
        n5.value = "N5";
        BinaryNode n6 = new BinaryNode();
        n6.value = "N6";
        BinaryNode n7 = new BinaryNode();
        n7.value = "N7";
        BinaryNode n8 = new BinaryNode();
        n8.value = "N8";
        BinaryNode n9 = new BinaryNode();
        n9.value = "N9";
        BinaryNode n10 = new BinaryNode();
        n10.value = "N10";

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.left = n8;
        //n4.right = n9;
        binaryTreeLL.root = n1;
        System.out.println("PreOrder:");
        binaryTreeLL.preOrder(binaryTreeLL.root);
        System.out.println();
        System.out.println("InOrder:");
        binaryTreeLL.inOrder(binaryTreeLL.root);
        System.out.println();
        System.out.println("PostOrder:");
        binaryTreeLL.postOrder(binaryTreeLL.root);
        System.out.println();
        System.out.println("LevelOrder:");
        binaryTreeLL.levelOrder();

        System.out.println();
        binaryTreeLL.search("N11");
        System.out.println("Insert Nodes");
       // binaryTreeLL.insert(n10);
        System.out.println();
        binaryTreeLL.levelOrder();
        System.out.println();
        System.out.println(binaryTreeLL.getDeepestNode().value);
        System.out.println();
        binaryTreeLL.deleteDeepestNode();
        binaryTreeLL.levelOrder();


    }


}
