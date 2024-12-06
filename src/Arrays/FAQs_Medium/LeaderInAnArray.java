package Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.List;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,5,3,1,2};

        int ans [] = leaderBrute(arr);

        for (int a: ans){
            System.out.print(a+ " ");
        }

        System.out.println("**************");

        int [] ans1 = leaderOptimal(arr);
        for (int a: ans1){
            System.out.print(a+ " ");
        }
    }

    private static int[] leaderOptimal(int[] arr) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[arr.length-1]);

        //last element is always the leader from right, so add it in the list and
        // then compare it with other element starting from length-2
        // store last element as max

        int max = arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] > max){
                max = arr[i];
                arrayList.add(arr[i]);
            }
        }

        int []leaderArray = new int [arrayList.size()];
        int idx=0;

        for(int i=leaderArray.length-1;i>=0;i--){
            leaderArray[idx++] = arrayList.get(i);
        }
        return leaderArray;
    }

    private static int[] leaderBrute(int[] arr) {

        boolean isLeader ;
        List<Integer> ans = new ArrayList<>();


        for(int i = 0;i< arr.length;i++){
            isLeader = true;
            for(int j = i+1; j< arr.length;j++){
                if(arr[j]> arr[i]){
                    isLeader= false;
                    break;
                }

            }
            if (isLeader){
                ans.add(arr[i]);
            }

        }

        int []leaderArray = new int [ans.size()];

        for(int i=0;i<leaderArray.length;i++){
            leaderArray[i] = ans.get(i);
        }
        return leaderArray;

    }
}
