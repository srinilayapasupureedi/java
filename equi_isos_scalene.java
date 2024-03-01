package problems;

import java.util.Scanner;

public class equi_isos_scalene {
    public static void main(String[] args) {
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the angle1");
        int angle1 = input.nextInt();
        System.out.print("enter the angle2:");
        int angle2 = input.nextInt();
        System.out.print("enter the angle3:");
        int angle3 = input.nextInt();
        sum=angle1+angle2+angle3;
        if ((angle1==angle2)&&(angle1==angle3)&&(angle2==angle3)&& sum==180 )
        {
            System.out.println("equilateral triangle");
        }
        else if((angle1==angle2)||(angle1==angle3)||(angle2==angle3)&& sum==180 )
        {
            System.out.println("isosceles triangle");
        } else if (sum==180) {
            System.out.println("scalene triangle");

        } else {
            System.out.println("other type triangle");
        }

    }
}
