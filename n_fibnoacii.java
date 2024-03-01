package iterations;

import java.util.Scanner;

public class n_fibnoacii {
    public static void main(String[] args) {


            Scanner input=new Scanner(System.in);
            System.out.println("enter the number");
            int n= input.nextInt();
            int a=0,b=1,c,temp;
            for(int i=0;i<n;i++)
            {
                System.out.println(a);
                c=a+b;
                a=b;
                b=c;

            }
        }
 }