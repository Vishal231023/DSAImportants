package Strings;

import java.util.Arrays;

public class AnagramStrings {
    public  boolean checkAnagramStrings(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

      char [] s1 = s.toCharArray();
      char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

       return Arrays.equals(s1,t1);


    }

    public static void main(String[] args) {
        String s = "dog";
        String t = "cat";

        AnagramStrings anagramStrings = new AnagramStrings();
        System.out.println(anagramStrings.checkAnagramStrings(s,t));



    }


}
