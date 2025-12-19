package Collection;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrayele {
    public static void main(String[] args) {

        int arr[]= {1,2,3,4};
        int arr1[]= {2,3,4};

        Set<Integer> set = new HashSet<>();

        for(int num :arr){
            set.add(num);
        }

        for(int num :arr1){
            if(set.contains(num)){
                System.out.println(num);
            }
        }
    }
}
