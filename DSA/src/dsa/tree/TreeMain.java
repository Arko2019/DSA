package dsa.tree;

public class TreeMain {
    public static void main(String[] args) {
        TreeNode drink=new TreeNode("Drink");
        TreeNode bear=new TreeNode("Bear");
        TreeNode wisky=new TreeNode("Wisky");
        TreeNode wine=new TreeNode("Wine");

        drink.addChild(bear);
        drink.addChild(wisky);
        drink.addChild(wine);
        System.out.println(drink.print(0));

    }
}
