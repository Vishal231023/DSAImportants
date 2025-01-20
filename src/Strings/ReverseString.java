package Strings;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
       String s = "hello";

        String reversedS = optimalSolution(s);
        System.out.println(reversedS);


    }

    private static String optimalSolution(String s) {

        char [] ch = s.toCharArray();
int start =0;
int end =s.length() -1;

while(start < end){
    char temp = ch[start];
    ch[start] = ch[end];
    ch[end] = temp;
    start++;
    end--;
}

return new String(ch);


    }
}
