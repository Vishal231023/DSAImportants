package BinarySearch.FAQS;

public class BooksAllocationProblem {
    public static void main(String[] args) {
        int [] nums = {25,46,28,49,24};
        int m = 4;

        int ans = getMinimumMaxPages(nums,m);
        System.out.println(ans);
    }

    private static int getMinimumMaxPages(int[] nums, int m) {
        int low = Integer.MIN_VALUE;
        int high = 0;

        for(int i = 0;i<nums.length;i++){
            low = Math.max(low,nums[i]);
            high += nums[i];
        }

        while(low <= high){
            int mid = low + (high - low)/2;

            if(countStudentPages(mid,nums,m) > m){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return low;

    }

    private static int countStudentPages(int mid, int[] nums, int m) {

        int countOfStudents = 1;
        int prevPage = nums[0];

        for(int i =1;i<nums.length;i++){
            if(prevPage +nums[i] <= mid){
                prevPage += nums[i];
            }
            else{
                countOfStudents++;
                prevPage = nums[i];
            }
        }
        return countOfStudents;
    }
}
