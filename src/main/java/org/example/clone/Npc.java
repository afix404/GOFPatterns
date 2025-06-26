package org.example.clone;

public class Npc implements Pers{

    private String name;

    private Integer health;

    private String inventory;

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", inventory='" + inventory + '\'' +
                '}';
    }

    public Npc(String name, Integer health, String inventory) {
        this.name = name;
        this.health = health;
        this.inventory = inventory;
    }

    @Override
    public Pers clone() {
        return new Npc(this.name, this.health, this.inventory);
    }
}
