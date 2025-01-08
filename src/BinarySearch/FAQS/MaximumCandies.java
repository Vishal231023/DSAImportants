package BinarySearch.FAQS;

public class MaximumCandies {
    public static void main(String[] args) {
        int []candies = {5,8,6};
        int k = 3;

        int ans = getMaxCandies(candies,k);
        System.out.println(ans);
    }

    private static int getMaxCandies(int[] candies, int k) {

        int max = Integer.MIN_VALUE;
        int total = 0;

        for(int a:candies){
            max = Math.max(a,max);
            total +=a;
        }

        if(total < k){
            return 0;
        }

        int low = 1;
        int high = max;

        while(low <=high){
            int mid = low + (high - low)/2;

            if(canCandiesDivide(candies,mid,k) == true){
                low = mid + 1;

            }
            else{
                high =  mid -1;
            }
        }
        return high;
    }

    private static boolean canCandiesDivide(int[] candies, int mid, int k) {
        int total = 0;

        for(int i =0;i< candies.length;i++){
            total += candies[i]/mid;
        }

        return total >= k;
    }
}
