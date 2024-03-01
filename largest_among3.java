package problems;

import java.util.Scanner;

public class largest_among3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum;
        System.out.print("enter the a value");
        int a = input.nextInt();
        System.out.print("enter the b value");
        int b = input.nextInt();
        System.out.print("enter the c value");
        int c = input.nextInt();
        if(a>b)
        {
            if (a>c) {
                System.out.println(a + "is the largest");
            }
            else
            {
                System.out.println(c +"is the largest");
            }
        }
        else{
            if(b>c)
            {
                System.out.println(b + "is the largest");
            }
            else {
                System.out.println(c +" is the largest");
            }


        }
    }

}
