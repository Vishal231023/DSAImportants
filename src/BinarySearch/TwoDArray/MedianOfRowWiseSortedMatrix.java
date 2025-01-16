package BinarySearch.TwoDArray;

public class MedianOfRowWiseSortedMatrix {
    public static void main(String[] args) {
        int [] [] nums = {{1,4,9},{2,5,6},{3,7,8}};

        int ans = getMedianOFMatrix(nums);
        System.out.println(ans);
    }

    private static int getMedianOFMatrix(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            low = Math.min(low,nums[i][0]);
            high = Math.max(high,nums[i][m-1]);

            int median = (n*m) /2;

            while(low <= high){
                int mid = (low + high)/2;
                int countEqual = blackBoxCount(nums,n,m,mid);

                if(countEqual <=median){
                    low = mid + 1;
                }
                else {
                    high = mid -1;
                }

            }
        }
        return low;
    }

    private static int blackBoxCount(int[][] nums, int n, int m, int mid) {

        int count = 0;

        for(int i =0;i<n;i++){
            count += getUpperBound(nums[i],mid,m);
        }
        return count;
    }

    private static int getUpperBound(int[] nums, int x, int m) {
        int low =0;
        int high = m-1;
        int ans = m;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] > x){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
}
