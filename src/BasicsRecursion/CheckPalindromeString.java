package BasicsRecursion;

public class CheckPalindromeString {

    public static void main(String[] args) {
        CheckPalindromeString solution = new CheckPalindromeString();

        System.out.println(solution.checkPalin("nitin"));
        System.out.println(solution.checkPalin("vishal"));
        System.out.println(solution.checkPalin("Nitin"));
    }

    private boolean checkPalin(String s) {

        return  isPalindrome(s, 0, s.length()-1);

    }

    private boolean isPalindrome(String s, int left, int right) {

        if(left>=right){
            return true;

        }

        if(s.charAt(left) != s.charAt(right)){
            return false;
        }

        return isPalindrome(s, left+1, right-1);
    }
}
