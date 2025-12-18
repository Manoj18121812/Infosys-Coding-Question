package Collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,1,2,5,6,3,7,8,9};

        Set<Integer> set = new HashSet<>() ;

        for(int num : arr){
            if(!set.add(num)){
                System.out.println("Duplicates ="+num);
            }
        }
    }
}
