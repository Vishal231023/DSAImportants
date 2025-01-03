package BinarySearch.AnswersBasedQuestions;

public class NthRootOfANumber {
    public static void main(String[] args) {
        int N = 3;
        int M = 27;

        int ans = nthRootOfNumber(N,M);
        System.out.println(ans);
    }

    private static int nthRootOfNumber(int n, int m) {

        int low = n;
        int high = m;

        while(low <= high){

            int mid = low + (high - low)/2;
            if( func(mid, m, n) == 1 ){
                return mid;
            }
            else if( func(mid, m, n) == 2 ){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    private static int func(int mid, int m, int n) {
        long ans = 1;
        for(int i=0;i<n;i++){
            ans *=mid;

            if(ans > m){
                return 2;
            }
        }

        if (ans == m){
            return 1;
        }
        return 0;
    }
}
