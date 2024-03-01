package introTopics;
import java.util.Scanner;
public class switch_stat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=10,b=5;
        System.out.println("enter the operator");
        char op=input.next().charAt(0);

        switch (op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("invalid");
        }


    }
}
