package BinarySearch.Fundamentals;

public class UpperBound {
    public static void main(String[] args) {
        int nums [] = {3,5,8,15,19};
        int target = 9;

        int ans = getUpperrBoundBruteApproach(nums,target);
        System.out.println(ans);

        System.out.println("**********");

        int ans1 = getUpperrBoundOptimalApproach(nums,target);
        System.out.println(ans1);
    }

    private static int getUpperrBoundOptimalApproach(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]> target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    private static int getUpperrBoundBruteApproach(int[] nums, int target) {



        for(int i =0; i< nums.length;i++){
            if(nums[i] >target){
                return i;
            }
        }
        return nums.length;
    }
}
