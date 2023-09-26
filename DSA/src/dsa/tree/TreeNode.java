package tree;

public class TreeNode {
    String data;
    ArrayList<TreeNode>children;

    public static TreeNode(String data,ArrayList<TreeNode>children){
        this.children=children;
        this.data=data;
    }
    public void addChild(){}
}
