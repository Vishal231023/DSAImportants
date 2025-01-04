package BinarySearch.AnswersBasedQuestions;

public class MinimumDaysToMakeMBouquets {
    public static void main(String[] args) {
        int n = 5;
        int [] nums = {1,10,3,10,2};
        int m = 3;
        int k = 2;

        int ans = getMinimumDays(nums,m,k,n);
        System.out.println(ans);
    }

    private static int getMinimumDays(int[] nums, int m, int k,int n) {

       long val = m* k;

       if(val > n){
           return  -1;
       }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< n ;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }

        int low = min;
        int high = max;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(PossibleBouquets(mid,nums,m,k,n) ){
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid + 1;

            }
        }
        return ans;
    }

    private static Boolean PossibleBouquets(int mid, int[] nums, int m, int k, int n) {
        int count = 0;
        int noOfBouquets = 0;

        for(int i =0 ;i < n;i++){
            if(nums[i] <= mid){
                count++;
            }
            else{
                noOfBouquets += count/k;
                count =0;

            }
        }
        noOfBouquets += count/k;
        return noOfBouquets >=m;
    }
}
