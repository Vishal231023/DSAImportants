package BinarySearch.FAQS;

public class FindPeakElement {
    public static void main(String[] args) {
        int nums [] = {1,2,6,4,5,6,7,8,9};

        int ans = getPeakElement(nums);
        System.out.println(ans);
    }

    private static int getPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }

        if(nums[n-1] > nums[n-2]){
            return n-1;
        }

        int low = 1;
        int high = n-2;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid-1] < nums [mid] && nums[mid] > nums [mid +1]){
                return mid;
            }

            else if(nums[mid-1] < nums [mid]){
                low = mid +1;
            }
            else {
                high = mid -1;
            }
        }
        return -1;
    }
}
