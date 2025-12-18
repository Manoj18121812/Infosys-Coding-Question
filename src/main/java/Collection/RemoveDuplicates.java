package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7);

        Set<Integer> set = new HashSet<>();

        for(int num : list){
            set.add(num);
        }
        System.out.println(set);
    }
}
