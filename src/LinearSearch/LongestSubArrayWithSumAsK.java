package LinearSearch;

import java.util.HashMap;

public class LongestSubArrayWithSumAsK {
    public static void main(String[] args) {
        int arr [] = {10,5,2,7,1,9};
        int k = 15;

        int ans = longestSubArray(arr,k);
        System.out.println(ans);
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
