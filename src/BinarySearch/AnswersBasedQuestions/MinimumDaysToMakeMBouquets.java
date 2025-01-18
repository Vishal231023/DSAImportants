package BinarySearch.AnswersBasedQuestions;

public class MinimumDaysToMakeMBouquets {
    public static void main(String[] args) {
        int n = 8;
        int [] nums = {7,7,7,7,13,11,12,7};
        int m = 3;
        int k = 2;

        int ans = getMinimumDays(nums,m,k,n);
        System.out.println(ans);
    }

    private static int getMinimumDays(int[] nums, int m, int k,int n) {

        long val = k * m;

        if(val > n){
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            low = Math.min(low,nums[i]);
            high = Math.max(high,nums[i]);
        }

        while(low <= high){
            int mid = (low + high)/2;

            if(possibleBouquets(mid,nums,m,k,n)){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return low;

    }

    private static Boolean possibleBouquets(int mid, int[] nums, int m, int k, int n) {

        int count = 0;
        int numberOfBouquets = 0;

        for(int i =0;i<n;i++){
            if(nums[i] <= mid){
                count++;
            }
            else{
                numberOfBouquets += count/k;
                count=0;
            }
        }
        numberOfBouquets += count/k;
        return numberOfBouquets >= m;
    }
}
