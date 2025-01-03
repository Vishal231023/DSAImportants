package BinarySearch.AnswersBasedQuestions;

public class SmallestDivisor {
    public static void main(String[] args) {
        int [] nums = {8,4,2,3};
        int limit = 10;

        int ans = getSmallestDivisorUsingBinarySearch(nums,limit);
        System.out.println(ans);
    }

    private static int getSmallestDivisorUsingBinarySearch(int[] nums, int limit) {

        // TC: O(log n) * (N) , where log n id for searching  mid, using binary search and (N) for getting the sum
        //SC: O(1)
        int max = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }

        int low = 1;
        int high = max;
        int ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(getSumOfArrayIntermediateFunc(nums,mid) <= limit){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int getSumOfArrayIntermediateFunc(int[] nums, int mid) {

        int n = nums.length;
        int sum =0;

        for(int i = 0; i < n; i++){
            sum +=  Math.ceil((double) nums[i]/(double) mid);
        }
        return sum;
    }
}
