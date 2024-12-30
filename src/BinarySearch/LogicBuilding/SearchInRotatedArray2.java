package BinarySearch.LogicBuilding;

public class SearchInRotatedArray2 {
    public static void main(String[] args) {
        int [] nums = {2,5,6,0,0,1,2};
        int target = 3;

        boolean ans = searchBinary(nums,target);
        System.out.println(ans);
    }

    private static boolean searchBinary(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] == target) return true;
            if(nums[mid] == nums[low] && nums[mid] == nums[high]){
                low = low +1;
                high = high -1;
                continue;
            }

            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
            else {
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;

                }
                else{
                    high = mid -1;
                }
            }
        }

        return false;
    }
}
