package problems;


import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int num= input.nextInt();
        System.out.println("entered number is "+ num);
        if(num%2==0)
        {
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
