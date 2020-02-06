package week.one;

public class StringExercises {
    public static void main(String[] args) {
        // Concatenate two strings and print the result.
        String firstName = "Chris ";
        String lastName = "Lim";
        System.out.println(firstName + lastName);

        // Check if one string is contained in another string.
        // (Hint: use the contains() method.)
        String raceCar = "Race Car";
        String car = "Car";
        System.out.println(raceCar.contains(car)); //true

        // Compare 2 strings with different cases.
        String toyota = "Toyota";
        String honda = "Honda";
        System.out.println(toyota.compareTo(honda)); //12

        // Count how many characters are in the String “I am a string”
        String str1 = "I am a string";
        System.out.println(str1.length()); // 13

        // Compare strings “Cat” and “CAT” ignoring case.
        String cat1 = "Cat";
        String cat2 = "CAT";
        System.out.println(cat1.equalsIgnoreCase(cat2));

        // Create a method that has two String parameters
        // and returns the concatenation of the two strings.
        System.out.println(twoStrCat("Hello", "World"));

        // Create a method that has one String parameter.
        // Return true if the String contains “cat” and “dog”, false otherwise.
        System.out.println(catOrDog("cat")); //true
        System.out.println(catOrDog("dog")); //true
        System.out.println(catOrDog("bird")); //false
    }

    public static String twoStrCat(String str1, String str2){
        return str1 + " " + str2;
    }

    public static boolean catOrDog(String pet){
        String cat = "cat";
        String dog = "dog";
        if(cat.equalsIgnoreCase(pet)){
            return true;
        }
        else if(dog.equalsIgnoreCase(pet)){
            return true;
        }
        else {
            return false;
        }
    }
}
