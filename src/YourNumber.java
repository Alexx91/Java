import java.util.Scanner;

public class YourNumber {
    public static void main(String[] args) {

        System.out.print("Care e numarul maxim? : ");

        Scanner z = new Scanner(System.in);
        int max = z.nextInt();

        System.out.print("Cate incercari? : ");

        Scanner tries = new Scanner(System.in);
        int y = tries.nextInt();

        int i = 0;
        String again;

        int randomNumber = (int) (Math.random() * max);
        do {
            while (i < y) {
                Scanner number = new Scanner(System.in);

                System.out.print("Care este numarul magic? : ");

                int x = number.nextInt();

                if (x != randomNumber && i == y - 1) {
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
            do {
                System.out.println("Mai incercam odata? Y/N");
                Scanner answer = new Scanner(System.in);
                again = answer.next();
            } while (!(again.equalsIgnoreCase("n") || again.equalsIgnoreCase("y")));
            if (again.equalsIgnoreCase("n")) {

                System.out.println("Pe data viitoare!");
                return;
            }
                i = 0;
            }
            while (again.equalsIgnoreCase("y")) ;

        }
    }
