package Arrays.FAQs_Hard;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {
    public static void main(String[] args) {
        int [] arr = {3,2,1};
        int n = arr.length;;
        
        int ans = mergeSortReversePairs(arr,0,n-1);

        System.out.println(ans);
    }

    private static int mergeSortReversePairs(int[] arr, int low, int high) {
        
        int count =0;
        if(low>=high){
            return count;
        }
        int mid = (low + high-low)/2;
        
        count +=  mergeSortReversePairs(arr,low,mid); //0,1
        count += mergeSortReversePairs(arr, mid+1, high);//2,2
        
        count += countPairs(arr,low,mid,high);
        mergeArray(arr,low,mid,high);

        return count;

        //4,2,1

    }

    private static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;      // (2,4)  (1)
        for(int i = low; i<=mid;i++){
            while(right <= high && arr[i] > 2* arr[right]) right++;

            count += (right- (mid+1));
        }


        return  count;
    }

    private static void mergeArray(int[] arr, int low, int mid,int high) {

        List<Integer> list = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <=high){

            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }

            else{
                list.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            list.add(arr[left]);
            left++;
        }

        while(right<=high){
            list.add(arr[right]);
            right++;
        }

        for (int i = low; i<=high;i++){
            arr[i] = list.get(i-low);
        }
    }
}
