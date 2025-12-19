package Collection;

import java.util.HashMap;
import java.util.Map;

public class MinFrequencyEle {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,2,6,3,2,1,4,5,6,2,4,5,6,3,8};

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int minFreq = Integer.MAX_VALUE;
        int result= -1;

        for(Map.Entry<Integer,Integer>entry :map.entrySet()){
            if(entry.getValue()<minFreq){
                minFreq= entry.getValue();
                result= entry.getKey();
            }
        }
        System.out.println("Min Frequency Element: " + result);
    }
}
