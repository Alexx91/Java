package oop.heroes;

abstract public class Hero {
    protected Integer life;
    protected Integer energy;
    protected  Boolean isAlive;

    public Hero(Integer life, Integer energy) {
        this.life = life;
        this.energy = energy;
        this.isAlive = true;
    }

     public void takedamage() {
        if(!isAlive) return;
        doTakeDamage();
     }
     abstract void doTakeDamage();

     public void attack() {
        if (!isAlive) return;
        doAttack();
     }
     abstract void doAttack();

    abstract public void heal();

    @Override
    public String toString() {
        return "Hero{" +
                "life=" + life +
                ", energy=" + energy +
                '}';
    }
}

