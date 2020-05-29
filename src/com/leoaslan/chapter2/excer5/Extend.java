package com.leoaslan.chapter2.excer5;

class Champion {
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private int health;


    public Champion(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }

    public Champion() {
        this.damage = 0;
        this.health = 0;
    }

    public void attack(Champion other){
        other.setHealth(other.getHealth() - damage);
    }

    public void show(){
        System.out.println(damage + " " + health);
    }
}

class JungleChampion extends Champion{
    public int getMonsterDamage() {
        return monsterDamage;
    }

    public void setMonsterDamage(int monsterDamage) {
        this.monsterDamage = monsterDamage;
    }

    public JungleChampion( int damage, int health, int monsterDamage) {
        super(damage, health);
        this.monsterDamage = monsterDamage;
    }

    public JungleChampion(int monsterDamage) {
        super();
        this.monsterDamage = monsterDamage;
    }

    private int monsterDamage;

    public void show(){
        System.out.println(monsterDamage + " " + super.getDamage() + " " + super.getHealth());
    }
}

public class Extend {
    public static void main(String[] args){
        Champion tristana = new Champion(70, 865);
        JungleChampion leesin = new JungleChampion(75, 900, 200);
        tristana.attack(leesin);

        tristana.show();
        leesin.show();
    }
}
