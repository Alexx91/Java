package oop.heroes;

public class Warrior extends Hero {

    public Warrior(Integer life, Integer energy) {
        super(life, energy);
    }

    @Override
    void doTakeDamage() {
        life -= 2;
    }

    @Override
    void doAttack() {
        energy--;
    }

    @Override
    public void heal() {

    }
}