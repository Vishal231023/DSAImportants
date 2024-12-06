package BasicsRecursion;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray solution = new ReverseArray();
        int [] arr = {1,2,3,4,5};

        ;
       int [] ans = new int [arr.length];
       ans = solution.reverseArraySolution(arr);
        for(int i :ans){
            System.out.print(i + " ");
        }
    }

    public int [] reverseArraySolution(int [] arr){
        if(arr.length==0){
            return new int [arr.length] ;
        }

        return reverse(arr, 0, arr.length-1);

    }

    public int [] reverse(int [] arr, int left, int right){
        if(left>=right){
            return arr;
        }

        int temp = arr[left];
        arr [left] = arr[right];
        arr[right] = temp;

        return reverse(arr,left+1, right-1);


    }
}
