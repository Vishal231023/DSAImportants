package Strings;

public class RotateString {
    public Boolean rotateString(String s, String goal){

        if(s.length() != goal.length()){
            return false;
        }


        for(int i=0;i<s.length();i++){

            String rotated = s.substring(i) + s.substring(0, i);

            if(rotated.equalsIgnoreCase(goal)){
                return  true;
            }
        }
        return  false;

    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        RotateString rotateString = new RotateString();

        boolean ans = rotateString.rotateString(s,goal);
        System.out.println(ans);
    }
}
