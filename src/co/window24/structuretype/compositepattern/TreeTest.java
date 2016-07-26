package co.window24.structuretype.compositepattern;

/**
 * Created by yuanfei on 7/21/16.
 */
public class TreeTest {

    TreeNode root = null;

    public TreeTest(String name) {

        root = new TreeNode(name);
    }

    public static void main(String[] args) {

        TreeTest treeTest = new TreeTest("大哥");
        TreeNode nodeB = new TreeNode("二弟");
        TreeNode nodeC = new TreeNode("三弟");

        nodeB.add(nodeC);
        treeTest.root.add(nodeB);
        System.out.println("Build the tree Finished!!!!!!");
    }
}