package models;

import enums.TreeType;

public abstract class Tree {
    protected double height;
    protected TreeType type;

    public Tree(TreeType type) {
        this.type = type;
        this.height = type.getHeight();
    }

    public abstract void grow();

    public void printInfo() {
        System.out.println("Тип дерева: " + type.getName() + ", высота: " + height + " м.");
    }
}
