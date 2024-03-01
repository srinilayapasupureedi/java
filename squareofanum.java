package functions;

public class squareofanum {
    public static void main(String[] args) {
        for(int i=1;i<5;i++) {
            int res = getSquare(i);
            System.out.println(res);
        }

    }
    public static int getSquare(int a)
    {
        return a*a;
    }
}
