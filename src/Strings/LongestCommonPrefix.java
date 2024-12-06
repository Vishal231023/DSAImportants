package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {

    public String returnCommonPrefix(String[] s){
        Arrays.sort(s);

        String start = s[0];
        String end = s[s.length-1];

        StringBuilder builder = new StringBuilder();

        for(int i = 0;i<Math.min(start.length(),end.length());i++){
            if(start.charAt(i)!= end.charAt(i)){
                return builder.toString();
            }
            builder.append(start.charAt(i));
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        String[] input =  {"lady" , "lazy" };

        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String answer = prefix.returnCommonPrefix(input);
        System.out.println(answer);
    }
}
