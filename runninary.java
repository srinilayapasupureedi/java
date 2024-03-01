package arrays;

public class runninary {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] res=runingary(a);
        for(int out:res)
            System.out.print(out + " ");
        
            System.out.println();

    }
    /*public static ArrayList<Integer> runingary(int[] a)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            int sum=0;
          for(int j=0;j<=i;j++)
          {
              sum+=a[j];
          }
          ans.add(sum);
        }
        return ans;
    }
     */
    //approch 2
    public static int [] runingary(int[] a)
    {
        int[] res=new int[a.length];
        res[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            res[i]=res[i-1]+a[i];
        }
        return res;
    }

}
