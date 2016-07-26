package co.window24.structuretype.compositepattern;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by yuanfei on 7/21/16.
 */
public class TreeNode {

    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {

        this.name = name;
    }

    // 添加子节点
    public void add(TreeNode node) {

        children.add(node);
    }

    // 删除子节点
    public void remove(TreeNode node) {

        children.remove(node);
    }

    // 获取子节点
    public Enumeration<TreeNode> getChildren() {

        return children.elements();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}