import java.util.Scanner;

/**
 * Basic Arithmetic in Java.
 */

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 10;
        int y = 4;
        int z;

        //z = x + y;
        //z = x - y;
        //z = x / y;
        //z = x % y;
        y++;
        x += 1;
        x--;

        z = x * y;

        System.out.println(z);

        // ORDER OF OPERATIONS [P-E-M-D-A-S]

        double result = 4 + 2 * (7 - 5) / 2.0;

        System.out.println(result);
    }
}