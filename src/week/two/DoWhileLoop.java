package week.two;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        String name = "Chris";
        Scanner scanner = new Scanner(System.in);
        String guess;
        do {
            System.out.println("Guess my name: ");
            guess = scanner.nextLine();

        } while(!guess.equalsIgnoreCase(name));

        System.out.println("You are magic!");
        scanner.close();
    }

}
