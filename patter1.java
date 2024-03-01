package patterns;
import java.util.Scanner;
public class patter1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=input.nextInt();
        int trows=n;
        for(int row=1;row<=trows;row++)
        {
            for(int cst=1;cst<=row;cst++)
            {
                System.out.print("*");
            }
            System.out.println();
        }





    }
}
