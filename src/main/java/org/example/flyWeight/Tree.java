package org.example.flyWeight;

public class Tree extends AbstractTree {

    private int x;
    private int y;

    public Tree(TreeType treeType, String color, TreeSize treeSize) {
        this.treeType = treeType;
        this.treeSize = treeSize;
        this.color = color;
    }

    @Override
    public void plant(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Сажаем дерево " + treeType + " " + color + " " + treeSize +
        " на координаты " + x + ":" + y);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Tree)) {
            return false;
        }

        Tree tree = (Tree) object;
        if (this.color.equals(tree.color) && this.treeSize.equals(tree.treeSize) && this.treeType.equals(tree.treeType)) {
            return true;
        }
        return false;
    }
}
