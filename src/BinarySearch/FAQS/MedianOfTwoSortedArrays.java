package BinarySearch.FAQS;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int [] nums1 = {2,4,6};
        int [] nums2 = {1,3,5};

        double ans = getMedianUsingBinarySearch(nums1,nums2);
        System.out.println(ans);
    }

    private static double getMedianUsingBinarySearch(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1 > n2){
            getMedianUsingBinarySearch(nums2,nums1);
        }
        int low =0;
        int high = n1;
        int left = (n1 + n2 + 1)/2;
        int total = n1 + n2;

        // we are taking n1 as high, because we are considering range of 0 to n , can be the elements

        while(low <= high){
            int mid1 = low + (high - low)/2;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if(mid1 < n1) r1 = nums1[mid1];
            if(mid2 < n2) r2 = nums2[mid2];
            if(mid1 -1 >= 0) l1 = nums1[mid1 -1];
            if(mid2 -1 >= 0) l2 = nums2[mid2 -1];

            if(l1 <= r2 && l2 <= r1){
                if(total%2 == 1){
                    return Math.max(l1,l2);
                }
                else return (double) ((Math.max(l1,l2) + Math.min(r1,r2)) / 2.0);
            }

            else if(l1 > r2){
               high = mid1 -1;
            }
            else{
                low = mid1 + 1;
            }

        }
        return 0;
    }
}
