package BasicsRecursion;

public class CheckPrime {
    public static void main(String[] args) {
        CheckPrime solution = new CheckPrime();

        System.out.println(solution.checkPrime(41));
    }

    public  Boolean checkPrime(int n){
        if(n<=1){
            return  false;
        }
        return isPrime(n, 2);

    }

    public Boolean isPrime(int n, int x){

        if(x>Math.sqrt(n)){
            return true;
        }

        if(n%x==0){
            return false;
        }

        return isPrime(n,x+1);

    }
}
