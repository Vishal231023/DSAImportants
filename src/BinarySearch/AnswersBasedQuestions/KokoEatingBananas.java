package BinarySearch.AnswersBasedQuestions;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int nums [] = {25,12,8,14,19};
        int n = 5;
        int h =5;

        int ans = getMinimumBananasKokoEats(nums,h);
        System.out.println(ans);
    }

    private static int getMinimumBananasKokoEats(int[] nums, int h) {
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int low = 1;
        int high  = max;
        int ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(funcGetPerHourBanana(nums,mid) <= h){
                ans = mid;
                high = mid -1;

            }

            else {
               low = mid +1;
            }
        }
        return ans;
    }

    private static int funcGetPerHourBanana(int[] nums, int mid) {
        int n = nums.length;
        int sum =0;

        for(int i = 0; i < n; i++){
            sum +=  Math.ceil((double) nums[i]/(double) mid);
        }
        return sum;
    }
}
