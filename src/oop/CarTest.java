package oop;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car(30, 7, false);

        bmw.start();
        bmw.drive(250);
        System.out.println("Fuel: " + bmw.getFuel() + " l");
        System.out.println("Range: " + bmw.range() + " km");
    }
}
