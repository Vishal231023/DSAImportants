package BasicsRecursion;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString solution = new ReverseString();
        List<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        System.out.println(solution.reverseString(s));
    }
    public List<Character> reverseString(List<Character> s) {
        int left = 0;
        int right = s.size() - 1;
        reverse(s, left, right);
        return s;
    }

    private void reverse(List<Character> s, int left, int right) {

        if(left>=right){
            return;
        }

        char temp = s.get(left);
        s.set(left,s.get(right));
        s.set(right,temp);
        reverse(s,left+1,right-1);
    }
}
