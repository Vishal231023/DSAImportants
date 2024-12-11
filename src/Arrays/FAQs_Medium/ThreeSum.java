package Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};

        List<List<Integer> > ans = getThreeSumOptimalSoln(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> getThreeSumOptimalSoln(int[] arr) {

        // TC: O(NLog(N)) + O(N^2)
        // SC:O(No.of triplets)

        List<List<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        Arrays.sort(arr);

        for(int i=0; i< n ; i++){
            if (i>0 && arr[i] == arr[i-1]) continue;

            int j = i+1;
            int k = n-1;

            while(j<k){

                int sum = arr[i] + arr[j] + arr[k];

                if(sum == 0){
                    List<Integer> elements = new ArrayList<>();
                    elements.add(arr[i]);
                    elements.add(arr[j]);
                    elements.add(arr[k]);

                    ans.add(elements);

                    j++;
                    k--;

                    while(j<k && arr[j] == arr[j-1]) j++;
                    while(j<k && arr[k] == arr[k+1]) k--;
                }

                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
}
