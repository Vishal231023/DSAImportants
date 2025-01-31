package Strings.MediumProblems;

public class CountAndSayProblem {
    public static void main(String[] args) {
        int n = 4;

        String ans = getTheStringWithFreqAndNumber(n);
        System.out.println(ans);
    }

    private static String getTheStringWithFreqAndNumber(int n) {
        if(n==1){
            return "1";
        }

        String prev = getTheStringWithFreqAndNumber(n-1);
        int length = prev.length();

        String ans = "";

        int count =1;
        int i;
        for( i=1;i<length;i++){
            if(prev.charAt(i) == prev.charAt(i-1)) count++;

            else{
                ans += (char)('0'+count);
                ans += prev.charAt(i-1);
                count=1;
            }
        }
        ans += (char)('0'+count);
        ans += prev.charAt(i-1);

        return ans;
    }
}
