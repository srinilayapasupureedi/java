package functions;

public class amstrong_range {

    public static void main(String[] args) {


        System.out.println(amstrongNO(153));
        amstng_rng(100,1000);

    }
    public static boolean amstrongNO(int n){
        int nod=countNo(n);
        int on=n;
        int  res=0;

        while(n>0)
        {
            int rem=n%10;
            res+=Math.pow(rem,nod);
            n=n/10;

        }

        return res==on;
    }
    public static int countNo(int n)
    {
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        return count;
    }

    public static void  amstng_rng(int lo, int high) {
        for (int a = lo; a <= high; a++) {
            boolean re = amstrongNO(a);
            if (re) {
                System.out.println(a);
            }
        }
    }

}

