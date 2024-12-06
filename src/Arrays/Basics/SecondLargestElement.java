package Arrays.Basics;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr [] = {8,8,7,6,5};

        System.out.println(secondLargestElement(arr));
        System.out.println(secondLargestElementWithOptimalApproach(arr));
        System.out.println(secondSmallestElementWithOptimalApproach(arr));

    }

    private static int secondLargestElementWithOptimalApproach(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;

        for(int i = 1 ; i<arr.length-1;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    private static int secondSmallestElementWithOptimalApproach(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 1 ; i<=arr.length-1;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if ( arr[i] > smallest && arr[i] < secondSmallest ){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    //BetterApproach
    private static int secondLargestElement(int[] arr) {

        int largest = arr[0];
        int secondLargest = -1;

        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>largest){
                largest = arr[i];

            }
        }

        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

}
