package oop.heroes;

public class Warrior extends Hero {

    public Warrior(Integer life, Integer energy) {
        super(life, energy);
    }

    @Override
    public void takedamage() {
        life-= 3;
    }

    @Override
    public void attack() {
        energy--;
    }
}