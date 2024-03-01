package arrays;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> languages= new ArrayList<>();
        //adding elements to array list
        languages.add("java");
        languages.add("c++");
        languages.add("python");

        for(String ele:languages)
        {
            System.out.println(ele);
        }
        String res=languages.get(0);
        System.out.println(res);
        //enter list will be get by simply printing arraylist name..
        System.out.println(languages);
        //changing
        languages.set(2,"ruby");
        System.out.println(languages);
        //remove
        languages.remove(2);
        System.out.println(languages);
        //length of the list
        System.out.println(languages.size());
        System.out.println(languages.get(1));

    }

}
