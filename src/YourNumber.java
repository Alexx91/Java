import java.util.Scanner;

public class YourNumber {
    public static void main(String[] args) {

        System.out.print("Care e numarul maxim? : ");
        Scanner max = new Scanner(System.in);
        int z = max.nextInt();

        System.out.print("Cate incercari? : ");

        Scanner tries = new Scanner(System.in);
        int y = tries.nextInt();
        int i = y;

        int randomNumber = (int) (Math.random() * z);

        for (y = 0; y < i; y++) {
            Scanner number = new Scanner(System.in);

            System.out.print("Care este numarul? : ");

            int x = number.nextInt();

            if (x > randomNumber ) {
                System.out.println("mai mic");

            } else if (x < randomNumber){
                System.out.println("mai mare");
            } else if (x == randomNumber){
                System.out.println("ai castigat");
                break;
            } else {
                System.out.println("ai pierdut");
            }

        }



    }
}
