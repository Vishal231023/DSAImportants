package Arrays.LogicBuild;

import java.util.ArrayList;

import java.util.List;


public class IntersetionOfTwoSortedArrays {

    public static void main(String[] args) {
        int arr1 [] = {1,2,2,1};
        int arr2 [] = {2,2};


      ArrayList ans1 = getIntersectionArrayOptimal(arr1, arr2);
       System.out.println(ans1);

        int  [] ans = getIntersectionArrayBruter(arr1,arr2);

        for(int a : ans){
            System.out.print(a+ " ");
        }
    }

    private static int[] getIntersectionArrayBruter(int[] arr1, int[] arr2) {

        //TC: O(M*N)
        //SC:O(N)
        int visited [] = new int[arr2.length];
        List<Integer> arrayList = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j] && visited[j] ==0){
                    arrayList.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }

                if(arr2[j] > arr1[i]){
                    break;
                }
            }
        }

        int intersect [] = new int [arrayList.size()];
        for(int i=0 ; i< arrayList.size();i++){
            intersect[i] = arrayList.get(i);
        }
        return intersect;
    }

    private static ArrayList getIntersectionArrayOptimal(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i=0,j=0;

        List<Integer> list = new ArrayList<>();

        while(i<n1 && j < n2){

            if(arr1[i] == arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }



        return (ArrayList) list;


    }



}
