package BinarySearch.Fundamentals;

public class LowerBound {
    public static void main(String[] args) {
        int nums [] = {1,2,2,3};
        int target = 2;

        int ans = getLowerBoundBruteApproach(nums,target);
        System.out.println(ans);

        System.out.println("**********");

        int ans1 = getLowerBoundOptimalApproach(nums,target);
        System.out.println(ans1);
    }

    private static int getLowerBoundOptimalApproach(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    private static int getLowerBoundBruteApproach(int[] nums, int target) {



        for(int i =0; i< nums.length;i++){
            if(nums[i] >=target){
                return i;
            }
        }
        return nums.length;
    }
}
