package Arrays.LogicBuild;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {0,1,3,4,5};

        int ans = findMissingNumberUsingXor(arr);
        int ans1 = findMissingNumberUsingNaturalNumberSum(arr);
        System.out.println(ans);
        System.out.println(ans1);
    }

    private static int findMissingNumberUsingNaturalNumberSum(int[] arr) {
        int n = arr.length;
        int sum = n*(n+1)/2;

        int sum2 = 0;

        for(int a : arr){
            sum2 += a;
        }

        return sum - sum2;


    }

    private static int findMissingNumberUsingXor(int[] arr) {
        int xor1 = 0, xor2 = 0;
        int n = arr.length;;
        for(int i =0;i< arr.length;i++){
            xor1 = xor1 ^ (i+1);
            xor2 = xor2 ^ arr[i];
        }

        // 0^1^2^3^4^5
        //0^2^1^3^4^5
        return xor1 ^ xor2;
    }
}
