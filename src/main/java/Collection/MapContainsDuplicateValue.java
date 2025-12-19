package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapContainsDuplicateValue {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"A");
        map.put(4,"D");

        Set<String> set = new HashSet<>();

        for(String value : map.values()){
            if(!set.add(value)){
                System.out.println(value);
            }
        }
    }
}
