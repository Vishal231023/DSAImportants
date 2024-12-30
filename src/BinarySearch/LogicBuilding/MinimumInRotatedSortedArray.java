package BinarySearch.LogicBuilding;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};

        int ans = findMinimum(nums);
        System.out.println(ans);
    }

    private static int findMinimum(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        int min = Integer.MAX_VALUE;

        while(low <= high){

            int mid = (low + high)/2;

            // search for sorted half in array

            if(nums[low] <= nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid + 1;
            }
            else{
                min = Math.min(min, nums[mid]);
                high = mid -1;
            }
        }
        return min;
    }
}
