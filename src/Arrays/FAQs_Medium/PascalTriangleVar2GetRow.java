package Arrays.FAQs_Medium;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleVar2GetRow {
    public static void main(String[] args) {
        int n = 5;

        List<List<Integer> >list = new ArrayList<>();

        for(int i = 1 ;i<=n ;i++){
            List<Integer> ans = getRow(i);

            list.add(ans);

        }
        System.out.println(list);
    }

    private static List<Integer> getRow(int n) {

        List<Integer> ans = new ArrayList<>();

        int elements =1;
        ans.add(elements);

        for(int i=1;i<n;i++){
            elements = elements *(n-i);
            elements = elements/ i ;

            ans.add(elements);
        }

        return ans;

    }
}
