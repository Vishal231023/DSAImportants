package Arrays.LogicBuild;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};

        int ans = getDuplicate(nums);
        System.out.println(ans);
    }

    private static int getDuplicate(int[] nums) {
        cyclicSort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }
return -1;


    }

    private static void cyclicSort(int[] nums) {

        int i =0;

        while(i< nums.length){
            int correctIdx = nums[i] -1;
            if(nums[i]!= nums[correctIdx]){

                swap(nums,correctIdx,i );
            }
            else{
              i++;
            }
        }
    }

    private static void swap(int[] nums, int i, int i1) {

        int temp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = temp;
    }
}
