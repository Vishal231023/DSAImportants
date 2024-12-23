package LinearSearch;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubArrayWithSumKPositivesAndNegatives {
    public static void main(String[] args) {
        int arr [] = {1,2,1,2,1};
        int k = 3;

        int ans = longestSubArrayWithSumKBothNegativesAndPositives(arr, k);
        System.out.println(ans);

    }

    private static int longestSubArrayWithSumKBothNegativesAndPositives(int[] arr, int k) {

        if(arr.length == 0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int count =0;
        int sum =0;
        //base case for sum as 0
        map.put(0,1);


        for(int i =0 ; i<n;i++ ){
            sum += arr[i];


            int rem = sum - k;

            if(map.containsKey(rem)){
                count = count + map.get(rem);
            }


              map.put(sum,map.getOrDefault(sum,0)+1);


        }
        return count;
    }
}
