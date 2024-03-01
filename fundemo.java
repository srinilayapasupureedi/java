package functions;

import java.util.Scanner;

public class fundemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the two numbers");
        int num1= input.nextInt();
        int num2= input.nextInt();
        System.out.println("welcome functions intro");
        //add(2,23);
        int res=add(num1,num2);
        int result=add(100,5);
        System.out.println(res);
        System.out.println(result);

    }
    public static int add(int val1,int val2)
    {
        int sum=val1+val2;
        //System.out.println("sum of the two numbers" + " "+sum);
        return sum;
    }
}
