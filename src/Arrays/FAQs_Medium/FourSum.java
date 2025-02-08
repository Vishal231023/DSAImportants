package Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};
        int target = 7;

        List<List<Integer>> ans = optimal4SumSolution(arr, target);

        System.out.println(ans);
    }

    private static List<List<Integer>> optimal4SumSolution(int[] nums, int target) {

        //TC: O(N^2)
        //SC:O(no of quadreplets)
//        For k-Sum, we iterate up to n - (k - 1) because:
//	•	We need k elements.
//	•	The outermost loop picks the first element.
//	•	The remaining (k-1) elements are found using inner loops or two-pointer techniques.

       Arrays.sort(nums);

       int n = nums.length;
       List<List<Integer>> ans = new ArrayList<>();

       for(int i=0;i<n-3;i++){
           if(i>0 && nums[i] == nums[i-1]) continue;

           for(int j= i+1;j<n-2;j++){
               if(j!=i+1 && nums[j] == nums[j-1]) continue;

               int k = j+1;
               int l = n-1;

               while(k<l){
                   int sum = nums[i] + nums[j] + nums[k] + nums[l];

                   if(sum ==0 ){
                       List<Integer> fourSum = new ArrayList<>();

                       fourSum.add(nums[i]);
                       fourSum.add(nums[j]);
                       fourSum.add(nums[k]);
                       fourSum.add(nums[l]);
                       ans.add(fourSum);
                       k++;
                       l--;

                       while(k<l && nums[k] == nums[k-1]) k++;
                       while(l>k && nums[l] == nums[l+1])l--;

                   }
                   else if(sum <0){
                       k++;
                   }
                   else{
                       l--;
                   }
               }
           }


       }
       return ans;
    }
}
