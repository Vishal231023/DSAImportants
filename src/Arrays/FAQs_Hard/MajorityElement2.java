package Arrays.FAQs_Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        int nums[] = {3,2,3};

        List<Integer> ans = majorityElement(nums);

        System.out.println(ans);
    }

    public static List<Integer> majorityElement(int[] nums) {


        // TC: O(N)-> to find el1 and ele2 + O(N)-> to find majority ele

        //SC: O(1)
        int cnt1 =0;
        int cnt2 = 0;

        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;


        for(int i = 0 ;i < nums.length; i++){

            if(cnt1 == 0 && nums[i] != ele2){
                cnt1 =1 ;
                ele1 = nums[i];
            }
            else if( cnt2 == 0 && nums[i] != ele1){
                cnt2 = 1;
                ele2 = nums[i];
            }
            else if(nums[i]== ele1){
                cnt1++;
            }
            else if(nums[i] == ele2){
                cnt2++;
            }

            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for(int i = 0; i < nums.length ; i++){

            if(nums[i] == ele1) cnt1++;
            if(nums[i]== ele2)  cnt2++;

        }

        int min =  nums.length/3 + 1;

        List<Integer> ans = new ArrayList<>();

        if( cnt1 >= min){
            ans.add(ele1);
        }

        if( cnt2 >= min){
            ans.add(ele2);
        }

        Collections.sort(ans);

        return ans;

    }
}
