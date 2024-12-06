package Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.List;

public class RearrangeElementsBySignInArray {
    public static void main(String[] args) {
        int arr [] = {3,1,-2,-5,2,-4};

        int ans [] = OptimalSoln(arr);

        int ans1 [] = bruteSoln(arr);

        for(int a: ans){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("****************");

        for(int a: ans1){
            System.out.print(a+" ");
        }
    }

    private static int[] bruteSoln(int[] arr) {

        List<Integer> posInteger = new ArrayList<>();
        List<Integer> negInteger = new ArrayList<>();
        int n = arr.length;

        for(int i=0;i<n;i++){

            if(arr[i]<0){
                negInteger.add(arr[i]);
            }
            else{
                posInteger.add(arr[i]);
            }

        }

        int ans [] = new int[n];

        for(int i=0;i<n/2;i++){
            ans[2*i] = posInteger.get(i);
            ans[i*2+1] = negInteger.get(i);
        }
        return ans;
    }

    private static int[] OptimalSoln(int[] arr) {

        int n = arr.length;

        int ans [] = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[negIndex] = arr[i];
                negIndex = negIndex+2;
            }

            else{
                ans[posIndex] = arr[i];
                posIndex = posIndex+2;
            }
        }

        return ans;
    }
}
