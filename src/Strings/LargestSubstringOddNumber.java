package Strings;

public class LargestSubstringOddNumber {

    public static String getHighestOddNo(String s){

        int idx = -1;
        int i;

        for (i = s.length()-1;i >=0 ;i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                idx = i;
                break;
            }

        }
        if(idx == -1){
            return  "";
        }



            i = 0;

            while(i<=idx && s.charAt(i) == '0' ){
                i++;

            }

           return  s.substring(i,idx+1);





    }
    public static void main(String[] args) {
        String s = "0214638";
        String solution = LargestSubstringOddNumber.getHighestOddNo(s);
        System.out.println(solution);


    }
}
