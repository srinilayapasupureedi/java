package problems;

import java.util.Scanner;

public class week_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the week number");
        int week_num= input.nextInt();
        switch(week_num)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid");




        }

}
}

