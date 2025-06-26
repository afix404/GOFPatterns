package org.example.clone;

public class Prototype {

    private static Npc npcPrototype = new Npc("Name", 100, "Apple");

    public static void main(String[] args) {

        Npc npc = (Npc) npcPrototype.clone();
        npc.setHealth(10);
        npc.setName("Name2");
        npc.setInventory("Wood");
        System.out.println(npc.toString());
    }
}
