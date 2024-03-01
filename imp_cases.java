package arrays;

public class imp_cases {
    public static void main(String[] args) {
        System.out.println("----case1----");
        int[] a={1,2,3,4,5};
        int[] a1=a;
        a1[4]=1000;
        System.out.println("intial values of array a");
        for(int val:a)
        {
            System.out.println(val);
        }
        System.out.println("values of array a1 ..here we are assign the values of the array a  to a1 array and we try to changing the values the values of a1 array ..lets see those changes reflect or not");

        for(int val:a1)
        {
            System.out.println(val);
        }

        //conclusion :no change in the values due  to the here we dont create new arraay a1 but we create referernce a1 to the  a
        System.out.println("-----case2-----");
        int i=0,j=2;
        System.out.println(a[i]+","+a[j]);
        swap(a[i],a[j]);
        System.out.println(a[i]+","+ a[j]);
        //basically array are point by value
        /*System.out.println("-----case3------");
        System.out.println(a[i]+","+a[j]);
        swap(a,i,j);
        System.out.println(a[i]+","+a[j]);
        //let us print all the values of the ar array...
        for(int val:a)
        {
            System.out.println(val);
        }*/


        //conclusion:: by passing the array name as the parameter we are able to change the  array value
        System.out.println("----case3------");
        int[] other={100,200,300};
        System.out.println(a[i]+","+other[i]);
        swap(a,other);
        System.out.println(a[i]+","+ other[i]);

}
public static void swap(int[] ar,int i,int j)
{
    int temp=ar[i];
    ar[i]=ar[j];
    ar[j]=temp;

}
public static void swap(int one,int two)
{
    int temp=one;
    one=two;
    two=temp;
}
public static void swap(int c[],int b[])
{
    int[] temp=c;
    c=b;
    b=temp;
}

}
