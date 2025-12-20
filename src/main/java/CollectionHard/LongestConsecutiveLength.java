package CollectionHard;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveLength {
    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longestlength=0;
        for(int num :set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longestlength = Math.max(longestlength, count);
            }
        }
        System.out.println("Longest length is = "+longestlength);
    }
}
