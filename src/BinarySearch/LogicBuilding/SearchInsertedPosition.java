package BinarySearch.LogicBuilding;

public class SearchInsertedPosition {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int x = 5;

        int ans = findPosition(nums,x);

        System.out.println(ans);
    }

    private static int findPosition(int[] nums, int x) {

        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = nums.length;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid] >= x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

}
