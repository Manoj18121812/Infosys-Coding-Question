package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommandElementBetTwoList {
    public static void main(String[] args) {

        List<Integer> list=  Arrays.asList(1,2,2,3,5);
        List<Integer> list2 = Arrays.asList(1,2,3,5);

        Set<Integer> set = new HashSet<>(list);
        set.retainAll(list2);

        System.out.println(set);
    }
}
