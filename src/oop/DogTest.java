package oop;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Dog someDog = new Dog();
        System.out.print("Insert size: ");
        someDog.size = reader.nextInt();
        System.out.print("Insert times: ");
        someDog.Bark(reader.nextInt());


    }
}