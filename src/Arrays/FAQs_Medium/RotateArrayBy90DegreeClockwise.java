package Arrays.FAQs_Medium;

import java.util.Collections;

import static java.util.Collections.swap;

public class RotateArrayBy90DegreeClockwise {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3},{4,5,6},{7,8,9}};

         //arr  = rotateArrayBruteForceSoln(arr);

//        for(int [] ans: arr){
//           for(int a: ans){
//               System.out.print(a+ " ");
//           }
//            System.out.println();


           arr = rotateArrayByOptimalSoln(arr);

            for(int [] ans: arr){
                for(int a: ans){
                    System.out.print(a+ " ");
                }
                System.out.println();


           // 123    741
            //456   852
            //789  963
        }
    }

    private static int[][] rotateArrayByOptimalSoln(int[][] arr) {
        int n = arr.length;

        for(int i =0;i<n;i++){
            for(int j =i+1; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                // Swap the elements of the row
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }



    private static int[][] rotateArrayBruteForceSoln(int[][] arr) {

       // TC: O(N^2) + O(N^2)
        // SC: O(N^2)

        int n = arr.length;
        int [] [] ans = new int [n] [n];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                ans[j] [arr.length-i-1] = arr[i] [j];
            }
        }
       for(int i=0;i<n;i++){
           System.arraycopy(ans[i],0,arr[i],0,n);
       }

       return  arr;

    }

}
