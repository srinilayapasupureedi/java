package iterations;

import java.util.Scanner;

public class prime {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int flag = 0;
            System.out.println("enter the number ");
            int n = input.nextInt();
            System.out.println("entered number is " + n);
            int div = 2;
            while (div <= n - 1) {
                if (n % div == 0) {
                    flag = 1;
                    break;
                }

                div += 1;

            }
            if (flag == 1) {
                System.out.println("not a prime");
            } else {
                System.out.println("prime");
            }


        }

    }

