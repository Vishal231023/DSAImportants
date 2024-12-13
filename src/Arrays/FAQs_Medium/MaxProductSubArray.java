package Arrays.FAQs_Medium;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int [] arr = {2,3,-2,4};

        int ans = maxProduct(arr);

        System.out.println(ans);
    }

    private static int maxProduct(int[] arr) {

        int n = arr.length;

        int maxProd = arr[0];
        int minProd =arr[0];
        int result = arr[0];

        for(int i=1; i<n ;i++){

            if(arr[i] < 0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }


                maxProd = Math.max(arr[i], maxProd * arr[i]);
                minProd = Math.min(arr[i], minProd * arr[i]);

                result = Math.max(result, maxProd);
        }
    return  result;
    }
}
