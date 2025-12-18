package Collection;

import java.util.Arrays;
import java.util.Comparator;

public class SortArraysWord {
    public static void main(String[] args) {

        String arr[] = {"manoj","king","rah","aa","babababa"};

        Arrays.sort(arr, Comparator.comparing(String::length));

        System.out.println(Arrays.toString(arr));
    }
}
