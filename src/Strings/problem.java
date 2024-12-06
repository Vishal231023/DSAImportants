package Strings;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class problem {
    //You are given an integer n and an integer array arr of size n+2.
    //	  All elements of the array are in the range from 1 to n. Also,
    //	  all elements occur once except two numbers which occur twice.
    //	  Find the two repeating numbers.
    //		Note: Return the numbers in their order of appearing twice.
    //		So, if x and y are repeating numbers, and x's second appearance comes
    //		before the second appearance of y, then the order should be (x, y).
    //		Input: n = 4, arr[] = [1, 2, 1, 3, 4, 3]Output: 1 3
    //		Explanation: In the given array, 1 and 3 are repeated two times,
    //		 and as 1's second appearance occurs before 2's second appearance,
    //		 so the output should be 1 3.
    //		Input: n = 2, arr[] = [1, 2, 2, 1]Output: 2 1Explanation: In the given array,
    //		1 and 2 are repeated two times and second occurence of 2 comes before 1. So the output is 2 1
    //has context menu

    public static void main(String[] args) {
        int n = 2;
        int [] arr = {1,2,2,1};


       // i=1 thrn will check for 0 , 11rly if i=2  then will check for 1, 0

//        for(int i = 1;i<arr.length;i++){
//            for(int j = i-1 ;j>=0;j--){
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                }
//            }
//        }


        List<Integer> list = findRepeatingNumber(arr);

        for(int i : list){
            System.out.print(i + " ");
        }
    }

    private static List<Integer> findRepeatingNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        List<Integer> repeatingNumber = new ArrayList<>();

        for(int n : arr){

            if(set.contains(n)){
                repeatingNumber.add(n);
            }
            else{
                set.add(n);
            }
        }
        return repeatingNumber;
    }
}
