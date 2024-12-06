package BasicsRecursion;

public class SortedNumbers {
    public static void main(String[] args) {
        SortedNumbers sortedNumbers = new SortedNumbers();

        int [] nums = {1,2,3,4,5};

        System.out.println(sortedNumbers.checkSorted(nums));

    }

    public boolean checkSorted(int []nums){
        if(nums.length<=1){
            return true;
        }
        return  isSorted(nums, 0, 1);
    }

    private boolean isSorted(int[] nums, int i, int i1) {
        if(i1 >= nums.length){
            return true;
        }


        if(nums[i]>nums[i1]){
            return false;
        }

        return isSorted(nums,i+1, i1+1);
    }
}
