package Arrays.LogicBuild;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5};
        int arr2 [] = {1,2,7};

        int ans [] = getUnionArrayBrute(arr1, arr2);

        for(int a: ans){
            System.out.println(a + " ");
        }

        ArrayList ans1 = getUnionArrayOptimal(arr1, arr2);
        System.out.println(ans1);
    }

    private static ArrayList getUnionArrayOptimal(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i=0,j=0;

        List<Integer>list = new ArrayList<>();

        while(i<n1 && j < n2){

           if(arr1[i] <= arr2[j]){
               if(list.isEmpty()|| list.get(list.size()-1) != arr1[i]){
                   list.add(arr1[i]);
               }
               i++;
           }
           else{
               if(list.isEmpty()|| list.get(list.size()-1) != arr2[j]){
                   list.add(arr2[j]);
               }
               j++;
           }
        }

        if(i<n1){
            if(list.isEmpty()||list.get(list.size()-1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }

        if(j<n2){
            if(list.isEmpty()||list.get(list.size()-1) != arr1[j]){
                list.add(arr2[j]);
            }
            j++;
        }

        return (ArrayList) list;


    }

    private static int[] getUnionArrayBrute(int[] arr1, int[] arr2) {

        //TC: O(n1Logn) + O(n2Logn) + O(n1+n2);
        //SC: O(n1+n2) + O(n1+n2)

        Set<Integer> set = new HashSet<>();

        for(int i=0;i< arr1.length; i++){
            set.add(arr1[i]);

        }

        for (int i=0;i< arr2.length;i++){
            set.add(arr2[i]);

        }

        int [] union = new int [set.size()];
        int i=0;

        for(int a :set){
            union[i++] = a;
        }

        return union;
    }


}
