package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordByLength {
    public static void main(String[] args) {

        String[] words = {"java", "is", "cool", "code", "fun"};

        Map<Integer, List<String>> map = new HashMap<>();

        for(String word:words){
            map.computeIfAbsent(word.length(),k->new ArrayList<>())
                    .add(word);
        }
        System.out.println(map);
    }
}
