package week.one;

public class Comparison {
    public static void main(String[] args){
        String name = "Chris";
        int num1 = 19;
        int num2 = 4;

        if(name == "Chris" || name == "chris") {
            System.out.println("It's equal!");
        }else if (name != "Chris" && name != "Marianne"){
            System.out.println("It's not equal!");
        }

        if(num1 > num2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
