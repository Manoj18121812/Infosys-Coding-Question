package Collection;

import java.util.*;

public class CountFrequencyOfElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Integer,Integer> map = new HashMap<>();

        for(int num :list){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println(map);
    }
}
