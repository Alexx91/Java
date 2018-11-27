package oop.heroes;

public class Warlock extends Hero {
    public Warlock(Integer life, Integer energy) {
        super(life, energy);
    }

    @Override
    void doTakeDamage() {
        life -= 2;
    }

    @Override
    void doAttack() {
        energy--;
        life--;
    }


    @Override
    public void heal() {

    }
}
