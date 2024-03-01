package iterations;

import java.util.Scanner;

public class widening_casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        double myDouble = input.nextDouble();
        num=(int)myDouble;
        System.out.println(num);
        //System.out.println(myDouble);
    }
}
