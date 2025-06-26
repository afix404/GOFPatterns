package org.example.flyWeight;

public class Main {
    public static void main(String[] args) {
        AbstractTree tree1 = TreeFactory.getTree(TreeType.DUB, "Green", TreeSize.SMALL);
        AbstractTree tree2 = TreeFactory.getTree(TreeType.DUB, "Green", TreeSize.SMALL);
        AbstractTree tree3 = TreeFactory.getTree(TreeType.DUB, "Green", TreeSize.SMALL);
        AbstractTree tree4 = TreeFactory.getTree(TreeType.DUB, "Green", TreeSize.SMALL);
        tree1.plant(10, 20);
        tree2.plant(11, 22);
        tree3.plant(15, 25);
        tree4.plant(17, 27);

        System.out.println(tree1 == tree2);
        System.out.println(tree2 == tree3);
        System.out.println(tree4 == tree3);
        System.out.println(tree1 == tree4);

    }
}
