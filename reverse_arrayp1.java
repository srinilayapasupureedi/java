package arrays;

public class reverse_arrayp1 {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        /*System.out.println("array before reverseing");
        for(int val:a)
        {
            System.out.println(val);
        }
        System.out.println("array after reversing");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
        System.out.println("original array");
        for(int val:a)
        {
            System.out.println(val);
        }*/
      display(a);
      reverse(a);
      display(a);
    }
    public static void display(int[] a)
    {
        for(int val:a)
        {
            System.out.print(val+ " ");
        }
        System.out.println();
    }
    public static void reverse(int[] a)
    {
        int i=0;
        int j=a.length-1;
        while (i<=j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }

}
