package Strings.MediumProblems;

import java.util.ArrayList;
import java.util.List;

public class ReverseEveryWordInString {
    public static void main(String[] args) {

        String s = "the sky is blue";
        String ans = reverseWordsBruteForce(s);
        System.out.println(ans);

    }

    public  static String reverseWordsBruteForce(String s) {
        //Tc: O(n) + O(n)
        //Sc: O(n)

        List<String> list = new ArrayList<>();

        int i =0;

        int n = s.length();

        while(i <n){

            //task 1
            while(i < n && s.charAt(i) == ' ') i++;

            if(i>= n) break;
            int start = i;

            while(i< n && s.charAt(i) != ' ') i++;

            int end = i-1;

            String word = s.substring(start,end+1);
            list.add(word);



        }


        StringBuilder sb = new StringBuilder();

        for(int j = list.size()-1;j>=0;j--){
            sb.append(list.get(j));
            if(j!=0){
                sb.append(" ");
            }
        }

        return sb.toString();

    }
}
