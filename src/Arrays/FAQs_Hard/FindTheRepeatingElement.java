package Arrays.FAQs_Hard;

import java.util.ArrayList;
import java.util.List;

public class FindTheRepeatingElement {
    public static void main(String[] args) {

        int arr [] = {3,5,4,1,1};

        int [] ans = repeatingElement(arr);



        for (int a : ans){
            System.out.println(a + " ");
        }


    }

    private static int [] repeatingElement(int[] arr) {
        long n = arr.length;

        long Sn = (n*(n+1))/2;

        long S2n = (n * (n+1) * (2*n+1))/6;

        long S=0;
        long S2 = 0;

        for(int i=0; i< n ; i++){

            S += arr[i];

            S2 +=  ( (long) arr[i]* (long) arr[i] );
        }

        long val1 = S - Sn;
        long val2 = S2 - S2n;

        val2 = val2/val1;

        long x = ( val1 + val2 )/2;

        long y = x - val1;



        return  new  int [] {(int) x, (int) y};





    }
}
