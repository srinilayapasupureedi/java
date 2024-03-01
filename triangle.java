package problems;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum;
        System.out.print("enter the angle1");
        int angle1= input.nextInt();
        System.out.print("enter the angle2:");
        int angle2= input.nextInt();
        System.out.print("enter the angle3:");
        int angle3= input.nextInt();
        sum=angle1+angle2+angle3;

        if(sum==180&&(angle1>0&&angle2>0&&angle3>0))
        {
            System.out.println("valid triangle");
        }
        else {
            System.out.println("invalid triangle");
        }
    }
}
