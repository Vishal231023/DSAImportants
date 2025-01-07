package BinarySearch.FAQS;

public class KthElementOf2SortedArrays {
    public static void main(String[] args) {
        int nums1 [] = {2,3,6,7,9};
        int nums2[] = {1,4,8,10};
        int k = 5;

        int ans = getKthElementUsingBinarySearch(nums1, nums2,k);
        System.out.println(ans);
    }

    private static int getKthElementUsingBinarySearch(int[] nums1, int[] nums2,int k) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n2<n1){
            return getKthElementUsingBinarySearch(nums2,nums1,k);
        }

        int low = Math.max(0,(int) k-n2);
        int high = Math.min((int) k,n1);
        int left = k;


        while(low <= high){
            int mid1 = low + (high - low)/2;
            int mid2 = left-mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if(mid1 < n1) r1 = nums1[mid1];
            if(mid2 < n2) r2 = nums2[mid2];
            if(mid1 -1 >= 0) l1 = nums1[mid1-1];
            if(mid2 -1 >= 0) l2 = nums2[mid2 -1];

            if(l1 <= r2 && l2 <= r1){
                return  Math.max(l1,l2);
            }
            else if(l1 > r2){
                high = mid1 -1;
            }
            else {
                low = mid1 + 1;
            }


        }
        return 0;
    }
}
