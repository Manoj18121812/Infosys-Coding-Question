package Collection;

import java.util.HashMap;
import java.util.Map;

public class CountWOrdFreq {
    public static void main(String[] args) {

        String str = "Manoj is the king of shrigonda ";
        String[] words= str.split(" ");

        Map<String,Integer> map = new HashMap<>();

        for(String word:words){
         map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map);
    }
}
