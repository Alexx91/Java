public class Matrice {
    public static void main(String[] args) {
        int i;
        int j;
        int x = 0;
        int y = 0;

        for ( i = 0; i <5; i++) {
            System.out.print("#");
            for ( j = 0; j < 5; j++) {
                System.out.print("0");
            }
            System.out.println("#");
        }
        while (y >= 0 && y<i+2) {
            System.out.print("#");
            y++;
        }
        System.out.println("");
    }
}
