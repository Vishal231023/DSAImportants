package BinarySearch.Fundamentals;

public class SearchXInSortedArray {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;

        int ans = getIndexOfTarget(nums,target);
        System.out.println(ans);
    }

    private static int getIndexOfTarget(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;



        while(start <= end){

            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            }

            else if( target > nums[mid]){
               start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
