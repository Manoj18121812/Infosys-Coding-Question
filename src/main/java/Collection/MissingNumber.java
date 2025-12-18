package Collection;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {

        int arr[]= {1,2,3,5,6,9};
        int n=9;

        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                System.out.println("Missing number ="+i);
            }
        }
    }
}
