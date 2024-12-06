package Arrays.FAQs_Medium;

public class PascalTriangleVar1GetElement {
    public static void main(String[] args) {
        int row =3;
        int column = 2;

        int ans = getTheElementAtIndex(row-1,column-1);

        System.out.println(ans);
    }

    private static int getTheElementAtIndex(int n, int r) {

        int res = 1;

        for(int i =0;i<r;i++){
            res = res * (n-i);
            res = res/(i+1);
        }

        return  res;

    }
}
