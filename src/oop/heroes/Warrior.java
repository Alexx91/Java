package oop.heroes;

public class Warrior extends Hero {

    public Warrior(Integer life, Integer energy) {
        super(life, energy);
    }

    @Override
    void doTakeDamage(int damage) {
        life -= damage;
    }

    @Override
    void doAttack(Hero hero) {
        hero.takedamage(3);
        energy--;

    }

    @Override
    public void heal() {

    }
}