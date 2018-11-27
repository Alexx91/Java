package oop.heroes;

public class Thief extends Hero {

    public Thief(Integer life, Integer energy) {
        super(life, energy);
    }

    @Override
    void doTakeDamage() {
        life -= 2;
    }

    @Override
    void doAttack() {
        life += 1;
        energy--;
    }

    @Override
    public void heal() {

    }
}

