package week.one;

public class IfElseStatement {
    public static void main(String[] args) {
        System.out.println(myAwesomeName("Chris"));
        System.out.println(myAwesomeName("Marianne"));
        System.out.println(myAwesomeName("CJ"));
    }

    public static String myAwesomeName(String name) {

        if (name == "Chris"){
            return "Hi "+ name + "!" + " You have an awesome name!";
        }
        else if (name == "Marianne"){
            return "Hi "+ name + "!" + " You have a beautiful name!";
        }
        else {
            return name + "..." + "Okey..that is a good name.";
        }

    }
}
