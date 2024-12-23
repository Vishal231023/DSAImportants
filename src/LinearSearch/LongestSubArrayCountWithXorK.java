package LinearSearch;

import java.util.HashMap;

public class LongestSubArrayCountWithXorK {
    public static void main(String[] args) {
        int arr [] = {4,2,2,6,4};
        int k = 6;

        int ans = subArrayWithKCount(arr,k);
        System.out.println(ans);
    }

    private static int subArrayWithKCount(int[] arr, int k) {

        if(arr.length == 0){
            return 0;
        }

        int count =0;
        int xor =0;

        HashMap<Integer,Integer> map = new HashMap<>();

        //Base case, when there is no element
        map.put(0,1);

        for(int i =0; i< arr.length;i++){
            xor = xor^arr[i];

            int x = xor^k;

            if(map.containsKey(x)){
                count += map.get(x);
            }

            map.put(xor,map.getOrDefault(0,1)+1);
        }

        return count;
    }
}
