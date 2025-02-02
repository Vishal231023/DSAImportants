package Arrays.FAQs_Hard;

public class FirstMissingPositiveInteger {
    public static void main(String[] args) {
        int arr [] = {3,4,-1,1};

        int ans = getFirstMissingPositiveInteger(arr);
        System.out.println(ans);
    }

    private static int getFirstMissingPositiveInteger(int[] arr) {

        cycleSort(arr);
        for (int i =0;i< arr.length;i++){
            if(arr[i]!= i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }

    private static void cycleSort(int[] arr) {

        int i =0;

        while(i < arr.length){

            int correcIdx = arr[i] -1;
            if(arr[i] >0 && arr[i] <= arr.length && arr[i] != arr[correcIdx]){
                swap(arr, correcIdx,i);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int correcIdx, int i) {
        int temp = arr[correcIdx];
        arr[correcIdx] = arr[i];
        arr[i] = temp;
    }
}
