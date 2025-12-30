import sreaching.BinarySearch;

import java.util.Arrays;

import static sreaching.BinarySearchJava.addIndexNumber;

public class Main {
    public static void main(String[] args) {
        int []a = {2, 5, 8};
        int target = 4;
        int []newArray = addIndexNumber(a, target);
        System.out.println(Arrays.toString(newArray));
    }
}