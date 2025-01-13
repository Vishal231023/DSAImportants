package BinarySearch.FAQS;

//This problem same as books allocation problem
// where we have minimize the maximum
// also it is called split array largest sum
public class PaintersProblem {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40};
        int k =2;

        int ans = getMaxSplitArraySum(nums,k);
        System.out.println(ans);
    }

    private static int getMaxSplitArraySum(int[] nums, int k) {

        int n = nums.length;
        int low = 0;
        int high = 0;
        for(int a:nums){
            low = Math.max(low, a);
            high += a;
        }

        while(low <= high){


            int mid = (low + high)/2;

            if(canDivideMaxSum(nums, mid, k, n)){

                low = mid +1;


            }
            else{
                high = mid -1;


            }
        }
        return low;
    }

    private static Boolean canDivideMaxSum(int[] nums, int mid, int k, int n) {
        int count = 1;
        int prevSum = nums[0];

        for(int i =1;i<n;i++){
            if(prevSum + nums[i] <= mid){
                prevSum = prevSum + nums[i];
            }
            else{
                count++;
                prevSum = nums[i];
            }
        }
        return count > k;
    }
}
