package Strings.MediumProblems;

public class RobinKarpAlogorithm {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int ans = getFirstIndexOfNeedleInHaystakckBruteForce(haystack,needle);
        System.out.println(ans);
    }

    private static int getFirstIndexOfNeedleInHaystakckBruteForce(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        int i;
        int ans = -1;

        for( i =0;i<= m-n;i++){
            boolean flag = true;
            for(int j=0;j<n;j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    flag= false;
                    break;
                }
            }
            if(flag) return ans = i;

        }
        return ans;
    }
}
