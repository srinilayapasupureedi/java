package iterations;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res = 0,rem;
        System.out.println("enter the number");
        int n = input.nextInt();
        while (n !=0) {
            rem= n % 10;
            res = res*10+rem;
            n = n / 10;
        }
        System.out.println(res +"reverse of a number");


        }
    }

