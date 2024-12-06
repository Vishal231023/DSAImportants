package Arrays.LogicBuild;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr [] = {0,0,3,3,5,6};

        int ans [] = removeDuplicatesBrute(arr);
        int ans1 [] = removeDuplicates(arr);

        for(int a : ans1){
            System.out.print(a + " ");
        }

        System.out.print("------------");

        for(int a : ans){
            System.out.print(a + " ");
        }
    }

    private static int[] removeDuplicatesBrute(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }
       int k = set.size();
        int j =0;

        for(int val : set){
            arr[j++] = val;


        }
        return arr;
    }

    private static int[] removeDuplicates(int[] arr) {

        int j = 0;
        for(int i=1;i< arr.length;i++){
           if(arr[j]!= arr[i]){

              arr[j+1] = arr[i];
              j++;
           }
        }
        return arr;
    }
}
