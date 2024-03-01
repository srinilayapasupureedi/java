package arrays;

public class array_demo {
    public static void main(String[] args) {
        //intilization at the time of declaration
        System.out.println("--method1----");
                int[] arr={1,2,3,40,5};
                for(int i=0;i< arr.length;i++)
                {
                    System.out.println(arr[i]);
                }
              //delclaration and allocatiing memoery in the same line
                int[] ar=new int[5];//alocating memory for  the 5 elements
                ar[1]=12;
                ar[2]=33;
             System.out.println("--another case----");
                System.out.println(ar[1]);
              System.out.println("--method2----");
              //declaration
              int[] a=null;
              //allocating memory to defining number thre of thr number of three elements
              a=new int[5];
              //intialization through indexing
              a[0]=10;
              a[3]=90;
            for(int i=0;i< a.length;i++)
           {
            System.out.println(a[i]);
           }
        System.out.println("--enhanced for loop----");
            for(int val:a)
            {
                System.out.println(val);
            }



    }

}