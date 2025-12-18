package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListWord {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("java","is","kingg","a","babababa"));

        list.sort(Comparator.comparing(String::length));
        System.out.println(list);
    }
}
