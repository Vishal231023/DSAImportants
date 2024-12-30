package BinarySearch.LogicBuilding;

public class FindFloorAndCeilInSortedArray {
    public static void main(String[] args) {
        int nums [] = {3,4,4,7,8,10};
        int x =5;

        int floor = findFloor(nums,x);
        int ceil = findCeil(nums,x);
        System.out.println("floor:" + floor);
        System.out.println("ceil:" + ceil);
    }

    private static int findCeil(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high =n-1;
        int ans = -1;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]>=x){
                ans = nums[mid];
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }

    private static int findFloor(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high =n-1;
        int ans = -1;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]<=x){
                ans = nums[mid];
                low = mid +1;
            }
            else{
               high = mid-1;
            }
        }
        return ans;
    }
}
