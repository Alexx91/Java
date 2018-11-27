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

     public void takedamage(int damage) {
        if(!isAlive) return;
        doTakeDamage(damage);
     }
     abstract void doTakeDamage(int damage);

     public void attack(Hero hero) {
        if (!isAlive) return;
        doAttack(hero);
     }
     abstract void doAttack(Hero hero);

    abstract public void heal();

    @Override
    public String toString() {
        return "Hero{" +
                "life=" + life +
                ", energy=" + energy +
                '}';
    }
}

