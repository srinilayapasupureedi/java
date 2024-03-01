package iterations;

import java.util.Scanner;

public class sum_natural_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum= 0;
        System.out.println("enter the number ");
        int n = input.nextInt();
        System.out.println("entered number is " + n);
        int div = 2;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of the natural numbers"+sum );


    }

}
