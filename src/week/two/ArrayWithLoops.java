package week.two;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt(); // ask the user hwo big is the element of the array
        int[] num = new int[size]; // add the size into the num array

        for(int i = 0; i <= size; i++){
            int j = input.nextInt(); //if we put size 5 array we can add 5 elements of numbers
            num[i] = j;

        }
        System.out.println(Arrays.toString(num)); // print the 5 element of the array we entered
        input.close(); // closes the scanner to end the loop
    }
}
