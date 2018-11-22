public class ASCII {
    public static void main(String[] args) {
        char i = 0;
        while( i <= 127) {
            System.out.print((int) i + " ");
            System.out.println(i);
            i++;
        }
        System.out.println("-----");
        for (i = 0; i <128; i++) {
            System.out.print((int) i + " ");
            System.out.println(i);
        }

    }
}
