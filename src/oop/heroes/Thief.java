package oop.heroes;

public class Thief extends Hero {

    public Thief(Integer life, Integer energy) {
        super(life, energy);
    }

    @Override
    void doTakeDamage(int damage) {
        life -= damage;
    }

    @Override
    void doAttack(Hero hero) {
        hero.takedamage(2);
        life += life;
        energy--;
    }

    @Override
    public void heal() {

    }
}

