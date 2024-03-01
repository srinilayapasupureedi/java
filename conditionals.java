package introTopics;
import java.util.Scanner;
public class conditionals{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter the age");
        int age= input.nextInt();
        System.out.println("age is"+age);
        if (age>0&&age<18)
        {
            System.out.println("not valid for voting");
        } else if (age>=18) {
            System.out.print("valid for voting");

        }
        else {
            System.out.println("invalid form of input");
        }
    }
}
