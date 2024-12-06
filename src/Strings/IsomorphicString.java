package Strings;

public class IsomorphicString {
    public Boolean checkString(String s, String t){
        int [] m1 = new int[256];
        int [] m2 = new int[256];

        int length = s.length();

        for(int i =0;i<length;i++){
            if(m1[s.charAt(i)]!= m2[t.charAt(i)]){
                return false;

            }

            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        IsomorphicString string = new IsomorphicString();

        Boolean answer = string.checkString(s,t);

        System.out.println(answer);
    }
}
