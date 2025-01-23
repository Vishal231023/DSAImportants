package LinearSearch;

import java.util.HashMap;

public class LongestSubArrayWithSumAsK {
    public static void main(String[] args) {
        int arr [] = {10,5,2,7,1,9};
        int k = 15;

        int ans = longestSubArray(arr,k);
        System.out.println(ans);

        int ans1 = longestSubArrayTwoPointerApproach(arr,k);
        System.out.println(ans1);
    }

    private static int longestSubArrayTwoPointerApproach(int[] arr, int k) {
        int left =0;
        int right =0;
        int sum=0;
        int maxLen = 0;

        int n = arr.length;

        while(right < n){
            if(right < n){
                sum += arr[right];
            }

            if(sum == k){
                int len = right - left +1 ;
                maxLen = Math.max(maxLen,len);
            }

            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }


            right++;



        }
        return maxLen;
    }

    private static int longestSubArray(int[] arr, int k) {
        if(arr.length == 0){
            return 0;
        }

        int n = arr.length;
        int sum = 0;
        int maxLen = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i< n;i++){
            sum += arr[i];

            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }

            int rem = sum - k;

            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen,len);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        return maxLen;
    }
}
