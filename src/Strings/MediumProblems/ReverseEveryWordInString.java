package Strings.MediumProblems;

import java.util.ArrayList;
import java.util.List;

public class ReverseEveryWordInString {
    public static void main(String[] args) {

        String s = " hello world ";
        String ans = reverseWordsBruteForce(s);
        System.out.println(ans);

        String ans1 = reverseStringOptimalApproach(s);
        System.out.println(ans1);


    }

    private static String reverseStringOptimalApproach(String s) {

        char [] ch = s.toCharArray();
        int n = ch.length;

        reverseArray(ch,0,n-1);

        int i =0;
        int j=0;

        int start = 0;
        int end =0;

        while(j<n){
            while(j<n && ch[j] == ' ')j++;
             start = i;

             while( j< n && ch[j] != ' '){
                 ch[i] = ch[j];
                 i++;
                 j++;
             }
             end = i-1;

             reverseArray(ch,start,end);
             if(i < n){
                 ch[i++] = ' ';
             }


        }
        while (i > 0 && ch[i - 1] == ' ') {
            i--;
        }

        return new String(ch).substring(0,i);

    }

    private static void reverseArray(char[] ch, int start, int end) {

        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
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
