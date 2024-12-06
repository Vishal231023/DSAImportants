package Strings;

import java.util.HashSet;

import java.util.Set;

import java.util.stream.IntStream;

public class problem2 {
    //	Given an integer n, return the number of positive integers in the range [1, n] that have at least one repeated digit.
    //		n=20
    //	output is 1(11)
    //		n=100
    //	output is 10(11,22,33,44,55,66,77,88,99,100)

    public static void main(String[] args) {
        int n = 100;
        System.out.println(findNumber(n));

    }

    public static int findNumber(int n){
         int ans = (int) IntStream.range(1,n)
                .filter(problem2::hasRepeatingDigit)
                .boxed()
                .count();
         return ans;
    }

    private static boolean hasRepeatingDigit(int i) {

        String number = String.valueOf(i);
        Set<Character> set = new HashSet<>();

        for(char digit : number.toCharArray()){
            if(!set.add(digit)){
                return true;
            }
        }

        return false;
    }
}
