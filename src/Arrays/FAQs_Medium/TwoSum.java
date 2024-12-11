package Arrays.FAQs_Medium;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int arr [] = {1,6,2,10,3};
        int target = 7;

        List<Integer> ans = twoSumBruteSoln(arr, target);
        System.out.println(ans);
        System.out.println("*******");

        int [] ans1 = twoSumBetterSoln(arr,target);

        for(int a: ans1){
            System.out.print(a+ " ");
        }

        System.out.println("********");

       int [] ans2 = twoSumOptimalSoln(arr,target);
        for(int a: ans2){
            System.out.print(a+ " ");
        }
    }

    private static int[] twoSumOptimalSoln(int[] arr, int target) {
        int n = arr.length;;

        int ans [] = new  int[2];

        int ele [] [] = new int [n] [2];

        for (int i =0;i<n;i++){
            ele[i][0] = arr[i];
            ele[i][1] = i;
        }



        Arrays.sort(ele, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });

        int left =0;
        int right = n-1;

        while(left<right){

            int sum = ele[left][0] + ele [right] [0];

            if(sum == target){
                ans[0] = ele[left][1];
                ans[1] = ele[right][1];
                return ans;

            }

            else if(sum>target){
                right--;
            }

            else left++;
        }


        return new int []{-1,-1};
    }

    private static int[] twoSumBetterSoln(int[] arr, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< arr.length ; i++){
            if(map.containsKey(target - arr[i])){
                return new int [] {map.get(target-arr[i]),i};
            }

            map.put(arr[i],i);
        }
        return arr;
    }

    private static List<Integer> twoSumBruteSoln(int[] arr, int target) {

        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j = i+1; j< arr.length ; j++){
                if(arr[i] + arr[j] == target){
                  ans.add(i);
                  ans.add(j);

                }
            }
        }

        return ans;
    }
}
