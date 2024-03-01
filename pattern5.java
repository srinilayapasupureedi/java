package patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=input.nextInt();
        int trows=n;
        int stars=1;
        int spaces=n/2;
        for(int row=1;row<=trows;row++)
        {
            for(int csp=1;csp<=spaces;csp++)
            {
                System.out.print(" ");
            }
            for(int cst=1;cst<=stars;cst++)
            {
                System.out.print("*");
            }


            System.out.println();
            if(row<=trows/2)
            {
                stars+=2;
                spaces--;
            }
            else{
                stars-=2;
                spaces++;
            }
        }
    }
}

