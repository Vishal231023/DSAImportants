package BasicsRecursion;

public class AddDigitsToSum {
    public static void main(String[] args) {

        AddDigitsToSum solution = new AddDigitsToSum();

        int n = 529;

        System.out.println(solution.getSum(n));
    }

    private int getSum(int n) {

        if(n<10){
            return n;
        }

        int sum = 0;

        while(n>0){

            sum += n%10;

            n = n/10;

        }

       return getSum(sum);
    }
}
