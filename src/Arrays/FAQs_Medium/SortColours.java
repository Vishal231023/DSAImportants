package Arrays.FAQs_Medium;

public class SortColours {
    public static void main(String[] args) {
        int [] arr = {1,0,1,2,2,0};

        int ans [] = sortColoursBetterSoln(arr);

        for(int a:ans){
            System.out.print(a+" ");
        }

        int ans1 [] = sortColorsOptimalSoln(arr);

        System.out.println();
        for(int a:ans1){
            System.out.print(a+" ");
        }
    }

    private static int [] sortColoursBetterSoln(int[] arr) {

        int n = arr.length;

        int count0 =0;
        int count1 =0;
        int count2 =0;

        for(int i=0; i< n ;i++){

            if(arr[i] == 0) count0++;
            else if(arr[i] ==1) count1++;
            else count2++;
        }

        for(int i=0;i<count0;i++){
            arr[i] =0;
        }
        for(int i=count0 ; i<count0+count1;i++){
            arr[i] = 1;

        }

        for (int i = count0+count1; i<n; i++){
            arr[i] = 2;
        }

        return arr;
    }

    public static int [] sortColorsOptimalSoln(int[] nums) {

        // TC: O(N)

        //SC: O(1), as no extra space is used

        int n = nums.length;
        int low =0; int mid =0; int high = n-1;

        while(mid<=high){
            if(nums[mid] ==0 ){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }

            else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }

        }

        return nums;
    }
}
