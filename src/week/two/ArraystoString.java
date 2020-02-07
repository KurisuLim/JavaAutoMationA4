package week.two;

import java.util.Arrays;

public class ArraystoString {
    public static void main(String[] args){
        int[] number = { 1, 2, 3, 4, 5, 6}; //[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(number));

        String [][] multiArray = {{"John","Doe"}, {"Harry", "Potter"}};
        System.out.println(Arrays.deepToString(multiArray)); //[[John, Doe], [Harry, Potter]]
    }
}
