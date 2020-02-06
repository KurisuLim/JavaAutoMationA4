package week.two;

import java.util.Random;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        /*
         * ICU
         *
         * initialization comparison condition(Expression) update
         */

        guessMyNumber();
    }

    public static void guessMyNumber() {
        Random rand = new Random();
        int n = rand.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        System.out.println(" ");
        while (!guess.equals(Integer.toString(n))) {
            System.out.println("Give me a number from 0-10");
            guess = scanner.nextLine();
        }

        System.out.println("Congrats You did it!");
        scanner.close();
    }

}