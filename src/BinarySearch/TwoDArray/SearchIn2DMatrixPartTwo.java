package BinarySearch.TwoDArray;

public class SearchIn2DMatrixPartTwo {
    public static void main(String[] args) {
        int matrix[] [] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        int target = 5;
        System.out.println(searchIn2DMatrixPartTwoBetterApproach(matrix,target));
        System.out.println(searchIn2DMatrixPartTwoOptimalApproach(matrix,target));
    }

    private static boolean searchIn2DMatrixPartTwoOptimalApproach(int[][] matrix, int target) {
        //TC:O(n+m)
        //Sc:O(1)

        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m -1;

        while(row < n && col >=0){

            int ans = matrix[row][col];

            if(ans == target){
                return  true;
            }
            else if(ans > target){
                col --;
            }
            else{
                row ++;
            }
        }
        return false;
    }

    private static boolean searchIn2DMatrixPartTwoBetterApproach(int[][] matrix, int target) {
        // TC: O(log m+ n)
        // SC: O(1)

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i =0;i<n;i++){
            boolean ans = binarySearchTarget(matrix[i],target);
            if (ans == true){
                return true;
            }
        }
        return false;
    }
    private  static boolean binarySearchTarget(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;

        while(low<= high){
            int mid = (low + high)/2;

            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return false;
    }
}
