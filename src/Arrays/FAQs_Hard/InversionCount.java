package Arrays.FAQs_Hard;

import java.util.ArrayList;
import java.util.List;

public class InversionCount {
    public static void main(String[] args) {
        int arr [] = {2,3,7,1,3,5};

        int ans = getMergeSort(arr, 0, arr.length-1);
        System.out.println(ans);
    }

    private static int getMergeSort(int[] arr, int low, int high) {

        if(low>=high){
           return 0;
        }

        int mid = (low + high) / 2;
        int count =0;

        count += getMergeSort(arr, low, mid);
        count += getMergeSort(arr, mid+1, high);


        count += merge(arr, low, mid, high);

return count;
    }

    private static int merge(int[] arr, int low, int mid, int high) {

        List<Integer> list = new ArrayList<>();

        int count =0;

        int left = low;
        int right = mid+1;

        while(left <= right && right <= high){

            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);

                count += mid - left +1;

                right++;
            }
        }

        while(left <=mid){
            list.add(arr[left]);
            left++;
        }

        while (right <=high){
            list.add(arr[right]);
            right++;
        }

//        for(int i = low; i <= high; i++){
//            arr[i] = list.get(arr[i-low]);
//        }

        return count;
    }
}
