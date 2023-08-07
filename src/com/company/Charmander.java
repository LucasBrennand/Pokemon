package com.company;

public class Charmander extends Atributes {

    Charmander (int health, int maxHealth, String type){
        this.setHealth(health);
        this.setMaxHealth(maxHealth);
        this.setType(type);
    }

    public void Scratch(){
        int damage = 40;
        int hitChance = 100;
        String type = "Normal";
        int PP = 15;
    }
    public void Ember(){
        int damage = 40;
        int hitChance = 100;
        String type = "Fire";
        int PP = 12;
    }
    public void Inferno(){
        int damage = 100;
        int hitChance = 50;
        String type = "Fire";
        int PP = 5;
    }
    public void DragonTail(){
        int damage = 60;
        int hitChance = 90;
        String type = "Dragon";
        int PP = 5;
    }

}
