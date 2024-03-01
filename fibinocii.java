package iterations;

import java.util.Scanner;

public class fibinocii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        int a = 0, b = 1, c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i < n+1; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }
    }
}

