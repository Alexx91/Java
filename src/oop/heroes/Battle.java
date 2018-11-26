package oop.heroes;

public class Battle {
    public static void main(String[] args) {

        Warrior paladin = new Warrior(10, 6);
        Mage wizard = new Mage(7, 13);
        battle(paladin, wizard);

    }

    public static void battle(Hero aHero, Hero anotherHero) {
        aHero.attack();
        anotherHero.takedamage();

        System.out.println(aHero);
        System.out.println(anotherHero);

        anotherHero.attack();
        aHero.takedamage();

    }
}
