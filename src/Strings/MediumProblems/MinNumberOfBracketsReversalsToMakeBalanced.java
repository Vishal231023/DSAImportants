package Strings.MediumProblems;

public class MinNumberOfBracketsReversalsToMakeBalanced {
    public static void main(String[] args) {
        String s = ")(())(((";

        int ans = getMinReversals(s);
        System.out.println(ans);
    }

    private static int getMinReversals(String s) {
        int n = s.length();
        if( n % 2 != 0){
            return -1;
        }

        int open =0;
        int close =0;

        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                open++;
            }
            else{
                if(open > 0) open--;
                else close++;
            }
        }

        return (open / 2) + (open % 2) + (close / 2) + (close % 2);
    }
}
