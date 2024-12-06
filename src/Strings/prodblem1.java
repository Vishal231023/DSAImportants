package Strings;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class prodblem1 {

    //		List<Integer> samplelist = Arrays.asList(1,2,3,4,5,6,7,4,8,9,6);
    //	//	Find the 1st repetitive value's index from the  samplelist

    public static void main(String[] args) {

        List<Integer> samplelist = Arrays.asList(1,2,3,4,5,6,7,4,8,9,6);

        Optional<Integer> ans = findNo(samplelist);
        System.out.println(ans);



    }

    public static Optional<Integer> findNo(List<Integer> list){
        HashSet<Integer> set = new HashSet<>();

        return list.stream().filter(i -> !set.add(i)).findFirst()
                .map(e -> {
                    for(int i=0;i<list.size();i++){
                        if(list.get(i).equals(e)){
                            return i;
                        }
                    }
                    return -1;
                });
    }
}
