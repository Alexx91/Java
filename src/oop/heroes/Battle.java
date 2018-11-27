package oop.heroes;

public class Battle {
    public static void main(String[] args) {

        Warrior paladin = new Warrior(10, 6);
        Mage wizard = new Mage(7, 13);
        Thief thug = new Thief(8, 11);
        Warlock warlock = new Warlock(12, 12);
        battle(paladin, wizard, thug, warlock);

    }

    public static void battle(Hero paladin, Hero wizard, Hero thug, Hero warlock) {

        System.out.println("Round 1");

        paladin.doAttack();
        wizard.doTakeDamage();

        System.out.println("paladin " + paladin);
        System.out.println("wizard " + wizard);

        System.out.println("Round 2");

        wizard.doAttack();
        paladin.doTakeDamage();


        System.out.println("paladin " + paladin);
        System.out.println("wizard " + wizard);

        System.out.println("Round 3");

        paladin.doAttack();
        wizard.doTakeDamage();


        System.out.println("paladin " + paladin);
        System.out.println("wizard " + wizard);

        System.out.println("Round 4");

        wizard.heal();


        System.out.println("paladin " + paladin);
        System.out.println("wizard " + wizard);

    }
}
