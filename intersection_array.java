package arrays;

import java.util.ArrayList;

public class intersection_array {
    public static void main(String[] args) {
        int a1[]={3,5,5,45,56};
        int a2[]={4,5,56,100};
        int i,j;
        System.out.println(insertion2array(a1,a2));
        }

    private static ArrayList<Integer> insertion2array(int[] a1, int[] a2) {
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                i++;
            } else if (a1[i] > a2[j]) {
                j++;

            } else {
                ans.add(a1[i]);
                i++;
                j++;
            }


        }
        return ans;
    }
}