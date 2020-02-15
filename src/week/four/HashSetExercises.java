package week.four;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExercises {
    public static void main(String[] args) {

        // Initialize a HashSet<Integer>. Using for loop add integers from 1 to 10.
        exerciseOne();

        // Remove all odd numbers from the HashSet
        exerciseTwo();

        //Try to create a set with duplicate values
        exerciseThree();

        //Create a HashSet<integer> . Add some integers and print out the HashSet.
        //Are the printed integers always in the order they were added?
        // Which Set collection would maintain the order?
        exerciseFour();
    }

    public static void exerciseOne(){
        Set<Integer> hash_set = new HashSet<>();

        for(int i = 1; i <=10; i++){
            hash_set.add(i);
        }
        System.out.println("\n"+ hash_set);
    }

    public static void exerciseTwo(){
        Set<Integer> hash_set = new HashSet<>();
        hash_set.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10}));

        Set<Integer> new_set = new HashSet<>();

        for (int i : hash_set){
            if (i % 2 == 0) {
                new_set.add(i);
            }
        }
        System.out.println("Even numbers: " + new_set);
    }

    public static void exerciseThree(){
        Set<Integer> hash_set = new HashSet<>();
        hash_set.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10}));

        Set<Integer> new_set = new HashSet<>();
        new_set.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));

        hash_set.retainAll(new_set);
        System.out.println("Duplicate Values: " + hash_set);
    }

    public  static void exerciseFour(){
        Set<Integer> hash_set = new HashSet<>();
        hash_set.add(100);
        hash_set.add(9);
        hash_set.add(8);
        hash_set.add(10);
        hash_set.add(-10);
        hash_set.add(7);
        hash_set.add(0);

        System.out.print("\nNot in Order: ");
        System.out.println(hash_set);

        Set<Integer> order_set = new TreeSet<>(hash_set);
        System.out.print("\nIn Order: ");
        System.out.println(order_set);

    }
}
