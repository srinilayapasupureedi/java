package iterations;

import java.util.Scanner;

public class terenary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String result;
        System.out.println("enter the number");
        int num= input.nextInt();
        result=(num%2==0)?"even":"odd";
        System.out.println(result);
    }
}
