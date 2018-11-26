import java.util.Scanner;

public class Generation {
    public static void main(String[] args) {

        Scanner age = new Scanner(System.in);
        System.out.print("Your age : ");
         int x = age.nextInt();
        if (x < 6) {
            System.out.println("I am Generation Alpha");
        } else if(x >=6 && x <=20) {
            System.out.println("I am Generation Z");
        } else if(x >=21 && x <=35) {
            System.out.println("I am Generation Y");
        } else if(x >=36 && x <=50) {
            System.out.println("I am Generation X");
        } else if(x >=51 && x <=69) {
            System.out.println("I am Baby Boomer");
        } else if(x >=70) {
            System.out.println("I am Builder");
        }
    }
}
