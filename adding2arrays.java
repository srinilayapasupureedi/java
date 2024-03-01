package arrays;

import java.util.ArrayList;

public class adding2arrays {
    public static void main(String[] args) {
        int[] a={9,9,9};
        int[] b={9,9};
        System.out.println( add2arrays(a,b));
    }
    public static ArrayList<Integer> add2arrays(int[] a,int[] b)
    {
        int i=a.length-1;
        int j=b.length-1;
        int carry=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i>=0||j>=0)
        {
            int sum=0;
            if(i>=0)
            {
                sum+=a[i];
            }
            if(j>=0)
            {
              sum+=b[j];
            }
            sum+=carry;
            int rem=sum%10;
            carry=sum/10;
            ans.add(0,rem);
            i--;
            j--;
        }
        if(carry!=0)
        {
            ans.add(0,carry);
        }
        return ans;
    }
}
