package oop.heroes;

public class Thief extends Hero{

    public Thief(Integer life, Integer energy) {
        super(life, energy);
    }

    @Override
    public void takedamage() {
        life -= 2;
    }

    @Override
    public void attack() {
        life += 1;
        energy--;
    }

    @Override
    public void heal() {

    }
}
