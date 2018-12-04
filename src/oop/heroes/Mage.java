package oop.heroes;

public class Mage extends Hero {



    public Mage(Integer life, Integer energy) {
        super(life, energy);
    }

    @Override
    public void heal() {
        life += 2;
        energy -= 1;
    }

    @Override
    void doTakeDamage(int damage) {
        life -= damage;
        energy++;
    }

    @Override
    void doAttack(Hero hero) {
        hero.takedamage(2);
        energy --;
    }
}