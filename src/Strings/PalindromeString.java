package Strings;

public class PalindromeString {
    public static void main(String[] args) {

        Boolean ans = true;

        String s = "Nitin";

        s= s.toLowerCase();


        int left = 0;
        int right = s.length()-1;

        while(left < right){

            if(s.charAt(left)!= s.charAt(right)){

                  ans = false;
                  break;
            }

            else{
                left++;
                right--;
            }
        }

        System.out.println(ans);
    }
}
