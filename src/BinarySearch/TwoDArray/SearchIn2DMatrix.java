package BinarySearch.TwoDArray;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int [] [] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int target = 8;

        Boolean ans = searchIn2DArrayBetterApproach(nums,8);
        System.out.println(ans);

        Boolean ans1 = searchIn2DArrayUsingBinarySearchOptimalApproach(nums,target);
        System.out.println(ans1);

    }

    private static Boolean searchIn2DArrayUsingBinarySearchOptimalApproach(int[][] nums, int target) {
        int n = nums.length;;
        int m = nums[0].length;

        int low = 0;
        int high = n*m -1;

        while(low <= high){
            int mid = (low + high)/2;

            int row = mid/m;
            int col = mid%m;

            if(nums[row] [col] == target){
                return  true;
            }
            else if(nums[row] [col] < target){
                low = mid +1 ;
            }
            else {
                high = mid -1;
            }
        }
        return false;
    }


    private  static Boolean searchIn2DArrayBetterApproach(int[][] nums, int target) {

        //TC: O(N + logM)
        //Sc: O(1)
        boolean ans = false;

        for(int i =0;i<nums.length;i++){
            ans = binarySearchTarget(nums[i],target);
            if (ans == true){
                return ans;
            }
        }
        return ans;
    }

    private  static boolean binarySearchTarget(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;

        while(low<= high){
            int mid = (low + high)/2;

            if(nums[mid] == target){
                return true;
            }
            else if(mid < target){
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return false;
    }
}
