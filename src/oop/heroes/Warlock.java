package oop.heroes;

public class Warlock extends Hero {
    public Warlock(Integer life, Integer energy) {
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
        life--;
    }

    @Override
    public void heal() {

    }
}
