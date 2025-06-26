package org.example.flyWeight;

public abstract class AbstractTree {

   protected TreeType treeType;
   protected String color;
   protected TreeSize treeSize;

   public abstract void plant(int x, int y);
}
