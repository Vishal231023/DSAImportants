package BasicsRecursion;

public class Fibbonaci {
    public static void main(String[] args) {
        Fibbonaci fibbonaci = new Fibbonaci();
        int n =5;

        System.out.println(fibbonaci.getValue(n));
    }

    private int  getValue(int n) {

        if(n==0) return 0;
        if(n==1) return 1;

        return getValue(n-1) + getValue(n-2);
    }
}
