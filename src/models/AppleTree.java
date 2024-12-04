package models;

import enums.TreeType;

public class AppleTree extends Tree {

    public AppleTree() {
        super(TreeType.APPLE_TREE);
    }

    @Override
    public void grow() {
        height += 0.5;
        System.out.println("Яблоня выросла. Новая высота: " + height + " м.");
    }
}
