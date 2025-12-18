package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertHashmapKeytoArraysLsit {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"one");
        map.put(2,"two");

        List<Integer> keys = new ArrayList<>(map.keySet());
        System.out.println(keys);
    }
}
