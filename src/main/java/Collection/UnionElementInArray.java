package Collection;

import java.util.HashSet;
import java.util.Set;

public class UnionElementInArray {
    public static void main(String[] args) {

        int arr[]={1,2,1,3,4,5,6};
        int arr1[] = {2,4,3,5,6,9,8};

        Set<Integer> set = new HashSet<>();

        for(int num:arr){
            set.add(num);
        }
        for(int num:arr1){
            set.add(num);
        }

        System.out.println(set);
    }
}
