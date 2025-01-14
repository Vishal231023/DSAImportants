package BinarySearch.TwoDArray;

public class FindRowWithMaximumOnes {
    public static void main(String[] args) {
        int [] [] nums = {{0,1},{1,0}};
//        int n = 3;
//        int m = 3;

        int ans = getTheIndexOfRowWithMAximumOnesUsingLinearSearch(nums);
        System.out.println(ans);

        int ans1 = getTheIndexOfRowWithMAximumOnesUsingBinarySearch(nums, nums.length,nums[0].length);
        System.out.println(ans1);
    }

    private static int getTheIndexOfRowWithMAximumOnesUsingBinarySearch(int[][] nums, int n, int m) {
        int idx = -1;
        int maxOnes = 0;

        for(int i =0;i<n;i++){
            int countOnes = m - getLowerBountOfOne(nums[i],m,1);

            if(countOnes > maxOnes){
                maxOnes = countOnes;
                idx = i;
            }
        }
        return idx;
    }

    private static int getLowerBountOfOne(int[] nums, int m, int x) {
        int low = 0;
        int high = m-1;
        int ans = 0;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] >= x){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }

    private static int getTheIndexOfRowWithMAximumOnesUsingLinearSearch(int[][] nums) {

        int idx = -1;
        int maxCount = -1;

        for(int i =0;i<nums.length;i++){
            int max= 0;
            for(int j= 0;j<nums[i].length;j++){
                max += nums[i][j];
            }

            if(max > maxCount){
                maxCount = max;
                idx = i;
            }
        }
        return idx;
    }
}
