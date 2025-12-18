package Collection;

import java.security.PublicKey;
import java.util.HashSet;
import java.util.Set;

public class CheckArrayContainsUniqueEle {

    public static void main(String[] args) {

        int arr[] = {1,2,3,1,5,2,6,4};

        boolean isUnique = true;
        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            if(!set.add(num)){
                isUnique = false;
                break;
            }
        }
        System.out.println(isUnique ? "Unique" : "Not Unique");
    }
}
