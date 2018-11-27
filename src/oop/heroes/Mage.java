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
    void doTakeDamage() {
        life--;
        energy++;
    }

    @Override
    void doAttack() {
        energy -= 3;
    }
}