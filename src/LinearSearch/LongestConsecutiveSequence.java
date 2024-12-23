package LinearSearch;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        int ans = longestBetterMethod(nums);
        System.out.println(ans);


        int ans1 = longestOptimalMethod(nums);
        System.out.println(ans);
    }

    private static int longestOptimalMethod(int[] nums) {

        if(nums.length == 0){
            return 0;

        }

        HashSet<Integer> set = new HashSet<>();

        int longestSeq = 1;


        for(int i = 0; i< nums.length; i++){
            set.add(nums[i]);
        }

        for(int a: set){
            if(!set.contains(a-1)){
                int currentCount = 1;
                int x = a;

                while(set.contains(x+1)){
                    currentCount++;
                    x = x+1;
                }

                longestSeq = Math.max(longestSeq,currentCount);
            }
        }

        return longestSeq;

    }

    private static int longestBetterMethod(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int longestSeq = 1;
        int currentCount = 1;
        int currentNum = Integer.MIN_VALUE;

        for(int i =0; i< nums.length; i++){
            if(nums[i] - 1 == currentNum){
                currentCount++;
                currentNum= nums[i];
            }

            else if(nums[i] != currentNum){
                currentCount = 1;
                currentNum = nums[i];
            }

            longestSeq = Math.max(longestSeq,currentCount);
        }
        return longestSeq;
    }
}
