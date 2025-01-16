package BinarySearch.TwoDArray;

public class PeakElementTwo {
    public static void main(String[] args) {
        int [] [] nums = {{10,20,15} ,{21,30,14}, {7,16,32}};

        int [] ans = getPeakElementUsingBinarySearch(nums);
        for(int a: ans){
            System.out.println(a + " ");
        }
    }

    private static int[] getPeakElementUsingBinarySearch(int[][] nums) {

        int n = nums.length;
        int m = nums[0].length;

        int low = 0;
        int high = m-1;

        while (low <= high){
            int mid = (low + high)/2;

            int row = maxRow(nums,mid,n,m);

            int left = (mid - 1 >= 0) ? nums[row][mid - 1] : -1;
            int right = (mid + 1 < m) ? nums[row] [mid + 1] : -1;

            if(nums[row] [mid] > left && nums[row] [mid] > right ){
                return new int [] {row,mid};
            }
            else if(nums[row] [mid] < left){
                high = mid-1;
            }
            else {
                low = mid +1;
            }


        }
        return new int[] {-1,-1};
    }

    private static int maxRow(int[][] nums, int mid, int n, int m) {

        int max = Integer.MIN_VALUE;
        int row = -1;

        for(int i = 0; i<n;i++){
            if(nums[i][mid] > max){
                max = nums[i] [mid];
                row = i;
            }
        }
        return row;
    }
}
