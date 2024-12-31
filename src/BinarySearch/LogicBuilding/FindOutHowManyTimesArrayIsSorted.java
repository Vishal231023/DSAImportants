package BinarySearch.LogicBuilding;

public class FindOutHowManyTimesArrayIsSorted {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2,3};

        int ans = getIndex(nums);
        System.out.println(ans);
    }

    private static int getIndex(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int min = Integer.MAX_VALUE;
        int index = -1;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[low] <= nums[high]){
                if(nums[low] < min){
                    index = low;
                    min = Math.min(min,nums[low]);
                    break;
                }
            }

            // check for sorted half

            if(nums[low] <= nums[mid]){
                if(nums[low] < min){
                    index = low;
                    min = Math.min(min,nums[low]);

                }
                low = mid +1 ;
            }
            else {
                if(nums[mid] < min){
                    index = low;
                    min = Math.min(min,nums[mid]);

                }
                high = mid - 1 ;

            }
        }
        return index;
    }
}
