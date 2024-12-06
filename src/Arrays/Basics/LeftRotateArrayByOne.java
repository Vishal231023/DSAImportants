package Arrays.Basics;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};


        int [] arr1 = {-1,0,3,6};

        int ans [] = shiftArrayLeftOne(arr1);

        for(int a : ans){
            System.out.print(a + " ");
        }
    }

    private static int[] shiftArrayLeftOne(int[] arr) {

        int temp = arr[0];

        for(int i = 1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;
        return arr;
    }
}
