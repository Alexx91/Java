package oop.vet;

public class Girafa implements WildAnimalPet {
    public void makeNoise() {
        System.out.println("gif!gif!");

    }

    public void sleep() {
        System.out.println("zzzzz");
    }

    @Override
    public void play() {
        System.out.println("head down");
    }
}