package BinarySearch.AnswersBasedQuestions;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int nums[] = {25, 12, 8, 14, 19};
        int n = 5;
        int h = 5;



        int ans = getMinimumBananasKokoEats(nums, h);
        System.out.println(ans);
    }

    private static int getMinimumBananasKokoEats(int[] nums, int h) {

        int low = 1;
        int n = nums.length;
        int high = -1;

        for (int a : nums) {
            high = Math.max(high, a);
        }

        while (low <= high) {
            int mid = (low + high) / 2;

            if (funcGetPerHourBanana(nums, mid) <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }


    private static double funcGetPerHourBanana(int[] nums, int mid) {

        int n = nums.length;

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) nums[i] /(double) mid);
        }
        return sum;

    }
}
