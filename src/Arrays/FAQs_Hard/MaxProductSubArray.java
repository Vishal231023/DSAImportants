package Arrays.FAQs_Hard;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int arr [] = {2,3,-2,4};

        int ans = maxSumBetterApproach(arr);
        System.out.println(ans);

        System.out.println("*************");

        int ans1 = maxSumOptimalApproach(arr);
        System.out.println(ans1);
    }

    private static int maxSumOptimalApproach(int[] arr) {

        // prefix and suffix approach

        //TC: O(N)
        //Sc: O(1)

        int ans = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = arr.length;
        for(int i =0; i < n; i++){
            if (arr[i] == 0 || arr[n - i - 1] == 0) {
                ans = Math.max(ans, 0);
                prefix = 1;
                suffix = 1;
                continue;
            }

            prefix = prefix * arr[i];

            suffix = suffix * arr[n-i-1];


            ans = Math.max(ans,Math.max(prefix,suffix));

        }

        return ans;
    }

    private static int maxSumBetterApproach(int[] arr) {

        //TC: O(N^2)
        //SC:O(1)

        int max = Integer.MIN_VALUE;

        for(int i=0; i< arr.length ; i++){
            int prod = 1;
            for (int j = i; j< arr.length ; j++){
                prod = prod * arr[j];
                //System.out.println(prod);
                max = Math.max(prod,max);
                //System.out.println(max);

            }



        }
        return max;
    }
}
