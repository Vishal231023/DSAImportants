package Arrays.FAQs_Hard;

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void main(String[] args) {
       int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;


       mergeSortedArrays(nums1, m, nums2,n);

       for(int a: nums1){
           System.out.print(a + " ");
       }


    }

    private static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {

        int left = m-1;
        int right = 0;


        while(left >= 0 && right < n){
            if(nums1[left] > nums2[right]){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;

                left--;
                right++;
            }
            else break;
        }

        Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);

        for(int i = m; i< nums1.length ; i++){
            nums1[i] = nums2[i-m];
        }
    }
}
