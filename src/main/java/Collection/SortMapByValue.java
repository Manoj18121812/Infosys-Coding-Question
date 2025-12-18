package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValue {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("A",3);
        map.put("B",1);
        map.put("C",2);
        map.put("D",4);

        List<Map.Entry<String,Integer>> list= new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        for(Map.Entry<String,Integer>entry:list){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
