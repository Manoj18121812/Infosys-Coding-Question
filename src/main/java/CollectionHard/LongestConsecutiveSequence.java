package CollectionHard;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        Set<Integer> set = new HashSet<>();

        for(int num :nums){
            set.add(num);
        }
        int longestLength=0;
        int sequenceStart=0;

        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentLength=1;

            while(set.contains(currentNum+1)){
                currentNum++;
                currentLength++;
            }
            if(currentLength>longestLength){
                longestLength=currentLength;
                sequenceStart=num;
            }
            }

        }

        System.out.println("Length:"+longestLength);
    System.out.println("Sequence:");
        for (int i = 0; i < longestLength; i++) {
            System.out.print((sequenceStart + i) + " ");
        }
    }
}
