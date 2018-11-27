package oop.exceptions;

public class ExceptionTest {
    public static void main(String[] args) {
        int y = 10;
        try {
            int x = 1/0;
            y++;
        } catch (ArithmeticException e) {
            System.out.println("imposibil");
        } catch (Exception e) {
            System.out.println("greseala");
        }
        System.out.println(y);
    }
}
