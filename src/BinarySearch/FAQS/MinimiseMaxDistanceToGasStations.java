package BinarySearch.FAQS;

public class MinimiseMaxDistanceToGasStations {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int k = 4;

        double ans = getMinimizeMaxDistanceToGasStationsBruteForce(nums,k);
        System.out.println(ans);

        double ans1 = getMinimizeMaxDistanceToGasStationsOptimalApproach(nums,k);
        System.out.println(ans1);
    }

    private static double getMinimizeMaxDistanceToGasStationsOptimalApproach(int[] nums, int k) {
        int n = nums.length;

        double low = 0;
        double high = 0;

        for(int i = 1;i<n-1;i++){
            high = Math.max(high,nums[i+1]-nums[i]);
        }

        double diff = 1e-6;

        while(high - low > diff){
            double mid = (low + high)/2.0;

            if(countOfstations(nums,mid) > k){
                low = mid;
            }
            else{
                high = mid;
            }
        }
        return high;
    }

    private static int countOfstations(int[] nums, double mid) {

        int count = 0;
        int n = nums.length;

        for(int i = 1; i<n-1;i++){
            double diff = nums[i+1] - nums[i];
            int countOfStations = (int) (diff / mid);
            if(nums[i+1] - nums[i] == countOfStations * mid){
                countOfStations--;
            }
            count += countOfStations;

        }
        return count;
    }

    private static double getMinimizeMaxDistanceToGasStationsBruteForce(int[] nums, int k) {

        int n = nums.length;
        int [] howManyWays = new int [n-1];

        for(int gasStations =1; gasStations<=k;gasStations++){
            double maxLength = -1;
            int maxIndx = -1;

            for(int j =0; j<n-1;j++){
                int diff = nums[j+1] - nums[j];
                double sectionLength = (double) diff / howManyWays[j]+1;

                if(sectionLength >maxLength){
                    maxLength = sectionLength;
                    maxIndx = j;
                }
            }
            howManyWays[maxIndx]++;
        }

        double maxAns = -1;

        for(int i =0;i<n-1;i++){
            double diff = nums[i+1] - nums[i];
            double sectionLength = (double) diff/(howManyWays[i]+1);
            maxAns = Math.max(maxAns,sectionLength);
        }

 return maxAns;

    }
}
