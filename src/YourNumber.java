import java.util.Scanner;

public class YourNumber {
    public static void main(String[] args) {

        System.out.print("Care e numarul maxim? : ");

        Scanner z = new Scanner(System.in);
        int max = z.nextInt();

        System.out.print("Cate incercari? : ");

        Scanner tries = new Scanner(System.in);
        int c = tries.nextInt();

        int i = 0;
        String again;

        int randomNumber = (int) (Math.random() * max);
        do {
            while (i < c) {
                Scanner number = new Scanner(System.in);

                System.out.print("Care este numarul magic? : ");

                int x = number.nextInt();

                if (x != randomNumber && i == c - 1) {
                    System.out.println("Ai pierdut :(");
                    break;
                } else if (x > randomNumber) {
                    System.out.println("Mai mic");
                } else if (x < randomNumber) {
                    System.out.println("Mai mare");
                } else {
                    System.out.println("Ai castigat!!!");
                    break;
                }
                i++;
            }
            System.out.println("Mai incercam odata? Y/N");
            Scanner answer = new Scanner(System.in);
            again = answer.nextLine();
            i = 0;
        } while (again.equalsIgnoreCase("y"));
        System.out.println("Pe data viitoare!");
    }
}