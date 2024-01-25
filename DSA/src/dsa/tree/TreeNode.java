package dsa.tree;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.children = new ArrayList<>();
        this.data = data;
    }

    public void addChild(TreeNode node) {
        this.children.add(node);
    }

    public String print(int level) {
        String s = "*".repeat(level) + data + "\n";
        for (TreeNode child : children) {
            s += child.print(level + 1);
        }
        return s;
    }
}
