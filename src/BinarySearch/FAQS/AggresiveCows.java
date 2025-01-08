package BinarySearch.FAQS;

import java.util.Arrays;

public class AggresiveCows {
    public static void main(String[] args) {
        // get the maximum min value

        // in this problem we are taking cases starting from 1 then 2 then 3 so on.. then we are checking
        // what is the min distance between any two  points, and we have to return maximum value of that by checking all th range
        // of possible cases
        // in the cases, 1 , 2, 3 are possible values, 4,5,6,7 ...so on are not possible..so we are returning high as answer.

        // because polarity shifts a
        // at start low was our answer, but as we move low moved to the range of answer that is not possible
        // and high came into the range of solutions that is possible answer
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
