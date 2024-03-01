package patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=input.nextInt();
        int trows=n;
        int stars=1;
        for(int row=1;row<=trows;row++)
        {
            for(int cst=1;cst<=stars;cst++)
            {
                System.out.print(cst);
            }
            System.out.println();
            if(row<=trows/2)
            {
                stars++;
            }
            else{
                stars--;
            }
        }
    }
}
