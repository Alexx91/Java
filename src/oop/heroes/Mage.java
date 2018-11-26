package oop.heroes;

public class Mage extends Hero {

    public Mage(Integer life, Integer energy) {
        super(life, energy);
    }

    @Override
    public void takedamage() {
        life--;
        energy++;
    }

    @Override
    public void attack() {
        energy -= 3;
    }
}