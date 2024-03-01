package patterns;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
//    Scanner input=new Scanner(System.in);
//    System.out.print("enter the number of rows");
//    int n= input.nextInt();
//
    int n=5;
    int trows=n-1;
    int stars=n-1;
    int  spaces=1;
    for(int  f=1;f<=2*n-1;f++)
        {
            System.out.print("*");
        }
    System.out.println();
    for(int row=1;row<=trows;row++){
        for(int cst=1;cst<=stars;cst++)
        {
            System.out.print("*");
        }
        for(int csp=1;csp<=spaces;csp++)
        {
            System.out.print(" ");
        }
        for(int cst=1;cst<=stars;cst++)
        {
            System.out.print("*");
        }
        //second row
        System.out.println();
        stars--;
        spaces+=2;


        }

        }


}
