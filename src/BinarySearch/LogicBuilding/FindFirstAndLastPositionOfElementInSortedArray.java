package BinarySearch.LogicBuilding;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int nums [] = {5,7,7,8,8,10};
        int x = 6;
        int ans [] ;

        int first = findFirst(nums, x);
        int second = findSecond(nums,x);
        if(first == -1){
           ans = new int[]{-1, -1};

        }
        else{
            ans = new int [] {first,second};
        }

        for(int a : ans){
            System.out.println(a + " ");
        }

    }

    private static int findSecond(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <=high){
            int mid = (low+high)/2;
            if(nums[mid] == x){
                ans = mid;
               low = mid+1;
            }

            else if(nums[mid] > x){
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }

    private static int findFirst(int[] nums, int x) {

        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <=high){
            int mid = (low+high)/2;
            if(nums[mid] == x){
                ans = mid;
                high = mid-1;
            }

            else if(nums[mid] > x){
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
}
