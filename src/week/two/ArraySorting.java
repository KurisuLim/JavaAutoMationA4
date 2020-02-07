package week.two;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args){
        int[] arrayNumbers = {5,4,6,8,7,9,3,0};
        int[] multiNum = {4,5,6,8,99,44,-1,2,-10};

        Arrays.sort(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers)); //[0, 3, 4, 5, 6, 7, 8, 9] for smaller array

        Arrays.parallelSort(multiNum);
        System.out.println(Arrays.toString(multiNum)); // [-10, -1, 2, 4, 5, 6, 8, 44, 99] for big arrays
    }
}
