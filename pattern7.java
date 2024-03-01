package patterns;

public class pattern7 {
    public static void main(String[] args) {
        int n=7;
        int trows=n;
        int stars=1;
        int  spaces=n-2;
        for(int row=1;row<=trows;row++){
            for(int cst=1;cst<=stars;cst++)
            {
                System.out.print("*");
            }
            for(int csp=1;csp<=spaces;csp++)
            {
                System.out.print(" ");
            }
            //second stars;
            int sstar=stars;
            if(row==trows/2+1)
            {
                sstar=stars-1;
            }
            for(int cst=1;cst<=sstar;cst++)
            {
                System.out.print("*");
            }
            //second row
            System.out.println();
            if(row<=trows/2) {
                stars++;
                spaces-= 2;
            }
            else {
                stars--;
                spaces+=2;
            }


        }

    }


}


