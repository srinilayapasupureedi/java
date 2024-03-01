package iterations;

import java.util.Scanner;

public class narrow_casting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int   num= input.nextInt();
        double myDouble=num;
        System.out.println(num);
        System.out.println(myDouble);
    }
}
