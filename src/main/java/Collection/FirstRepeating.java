package Collection;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeating {
    public static void main(String[] args){

        int arr[] = {1,2,3,5,2,6,4,3,8};

        Set<Integer> set = new HashSet<>();

        for(int num :arr){
            if(!set.add(num)){
                System.out.println("Repeating ele= "+num);
                break;
            }
        }
    }
}
