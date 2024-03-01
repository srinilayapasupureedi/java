package iterations;

import java.util.Scanner;

public class break_pro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number");
        int i=1;
        int n = input.nextInt();
        while (i < n) {
            if (i == 5) {
                break;
            }
            System.out.println("hello"+ i);
            i++;
        }
    }
}
