package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOccurance {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,5,6,9));

        int target= 3;

        list.removeIf(num ->num==target);
        System.out.println(list);
    }
}
