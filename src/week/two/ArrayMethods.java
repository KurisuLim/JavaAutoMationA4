package week.two;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args){
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {1,2,3,4,5};
        System.out.println(num1 + " " + num2); // two different array address
                                                // [I@3e3abc88 [I@6ce253f1
        if(Arrays.equals(num1, num2)) { // simple array to compare values
            System.out.println("Equals");
        }

        int [] a = {11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 999);
        System.out.println(Arrays.toString(a)); // fills the array with 999 in each element

    }
}
