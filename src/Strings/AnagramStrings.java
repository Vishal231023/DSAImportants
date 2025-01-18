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

    public  boolean checkAnagramStringsOptimalMethod(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        int [] count = new int [26];

        for(char c: s.toCharArray() ){
            count[c - 'a']++;
        }

        for(char c: t.toCharArray() ){
            count[c - 'a']--;
        }

        for(int i : count){
            if(i != 0){
                return  false;
            }
        }
 return true;

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        AnagramStrings anagramStrings = new AnagramStrings();
        System.out.println(anagramStrings.checkAnagramStrings(s,t));
        System.out.println(anagramStrings.checkAnagramStringsOptimalMethod(s,t));



    }


}
