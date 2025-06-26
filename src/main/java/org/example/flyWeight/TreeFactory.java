package org.example.flyWeight;

import java.util.ArrayList;
import java.util.List;

public class TreeFactory {

    private static List<AbstractTree> treePool = new ArrayList<>();

    public static AbstractTree getTree(TreeType treeType, String color, TreeSize treeSize) {
        Tree requestTree = new Tree(treeType, color, treeSize);

        if (!treePool.contains(requestTree)) {
            treePool.add(requestTree);
            return requestTree;
        }
        else {
            for (AbstractTree tree : treePool) {
                if (requestTree.equals(tree)) {
                    return tree;
                }
            }
        }
        return requestTree;
    }
}
