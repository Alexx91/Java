package oop.heroes;

abstract public class Hero {
    protected Integer life;
    protected Integer energy;

    public Hero(Integer life, Integer energy) {
        this.life = life;
        this.energy = energy;
    }

    abstract public void takedamage() ;

    abstract public void attack();

    @Override
    public String toString() {
        return "Hero{" +
                "life=" + life +
                ", energy=" + energy +
                '}';
    }
}

