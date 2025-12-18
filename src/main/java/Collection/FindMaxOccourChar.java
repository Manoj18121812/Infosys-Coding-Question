package Collection;

import java.util.HashMap;
import java.util.Map;

public class FindMaxOccourChar {
    public static void main(String[] args) {

        String str = "manojisking";

        Map<Character,Integer> map = new HashMap<>();

        for(char ch :str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        char maxChar = ' ';
        int max=0;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                maxChar=entry.getKey();
            }
        }

        System.out.println(maxChar+"="+max);
    }
}
