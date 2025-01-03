package BinarySearch.AnswersBasedQuestions;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        int n = 496;

        int ans = getSquarerootUsingBinarySearch(n);
        System.out.println(ans);
    }

    private static int getSquarerootUsingBinarySearch(int n) {

        int low = 1;
        int high = n;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(mid == n/mid){
                return mid;
            }

            else if( mid < n/mid){
                low = mid +1 ;

            }

            else {
                high = mid -1;
            }
        }
        return high;
    }
}
