package Strings;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SortCharacter {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(getCharacterSet(s));


    }

    public static List<Character> getCharacterSet(String s){

        Pair [] frequency = new  Pair[26];

        for(int i=0;i<26;i++){
            frequency[i] = new Pair(0,(char) (i + 'a'));
        }

        for(char ch: s.toCharArray()){
            frequency[ch-'a'].freq++;

        }

        Arrays.sort(frequency,(p1,p2)-> {
            if(p1.freq!=p2.freq) return p2.freq - p1.freq;
            return p1.ch - p2.ch;

        });

        List<Character> answer = new ArrayList<>();
        for(Pair p : frequency){
            if(p.freq>0){
                answer.add(p.ch);
            }
        }
return answer;

    }

    static class Pair {
        int freq;
        char ch;

        public Pair(int freq, char ch){
            this.freq = freq;
            this.ch = ch;
        }
    }
}
