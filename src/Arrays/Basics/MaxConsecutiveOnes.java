package Arrays.Basics;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr [] = {1,1,0,1,1,1,0,1,1};

        System.out.println(findMaxConsecutiveOne(arr));
    }

    private static int findMaxConsecutiveOne(int[] arr) {

        int max = 0;
        int count = 0;

        for(int i =0;i<= arr.length-1;i++){
            if(arr[i] == 1){
                count ++;
                max = Math.max(max,count);
            }
            else{
                count = 0;
            }
        }
        return max;
    }
}
