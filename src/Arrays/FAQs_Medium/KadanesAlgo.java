package Arrays.FAQs_Medium;

public class KadanesAlgo {

    public static void main(String[] args) {
        int [] arr = {2,3,-2,4};

        int maxSum = Integer.MIN_VALUE;

        int currSum =0;

        for(int i=0 ; i< arr.length;i++){

            currSum += arr[i];

            maxSum = Math.max(currSum,maxSum);

            if(currSum<0){
                currSum=0;
            }
        }

        System.out.println(maxSum);
    }
}
