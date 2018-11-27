package oop.heroes;

public class Warlock extends Hero {
    public Warlock(Integer life, Integer energy) {
        super(life, energy);
    }

    @Override
    public void takedamage() {
        life -= 2;
    }

    @Override
    public void attack() {
        energy--;
        life--;
    }

    @Override
    public void heal() {

    }
}
