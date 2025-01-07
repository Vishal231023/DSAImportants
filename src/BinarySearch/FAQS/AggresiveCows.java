package BinarySearch.FAQS;

import java.util.Arrays;

public class AggresiveCows {
    public static void main(String[] args) {
        // get the maximum min value

        int nums [] = {79,74,57,22};
        int n = 4;
        int k =4;

        int ans = aggresiveCowsSolutionUsingBinarySearch(nums,n,k);
        System.out.println(ans);

    }

    private static int aggresiveCowsSolutionUsingBinarySearch(int[] nums, int n, int k) {
        Arrays.sort(nums);

        int low = 1;
        int high = nums[n-1] - nums[0];

        while(low <= high){
            int mid = low + (high - low)/2;

            if(canWeApplyCows(mid,k,nums) == true){
                low = mid +1;


            }
            else{
                high = mid -1;
            }
        }
        return high;
    }

    private static boolean canWeApplyCows(int mid, int k, int[] nums) {
        int NumberOfCows = 1;
        int prev = nums[0];

        for(int i = 1;i<nums.length;i++){
            if(nums[i] - prev >= mid){
                NumberOfCows ++;
                prev = nums[i];
            }


        }

        return NumberOfCows>= k;

    }
}
