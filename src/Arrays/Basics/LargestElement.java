package Arrays.Basics;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 3};

        System.out.println(largestElement(arr));
    }

    private static int largestElement(int[] arr) {

        int ans = -1 ;

        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
