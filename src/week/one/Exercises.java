package week.one;

public class Exercises {
    public static void main(String[] args){
        System.out.println(printYourName("Chris"));
        System.out.println(calculate(45,78,87));
        System.out.println(intToString(8));
        System.out.println(oddOrEven(18));
        System.out.println(oddOrEven(27));
        lessThanFive(-1);
    }

    public static String printYourName(String name){
        String text = "Hi! My name is ";

        return text + name + "!";
    }

    public static int calculate(int num1, int num2, int num3){
        return num1 + num2 / num3;
    }

    public static String intToString(int num){
        int A = num;

        return "I am converting the number " + String.valueOf(A) + " to a String!";
    }

    public static String oddOrEven(int num){
        String text = "The number " +  String.valueOf(num) + " is ";
        if(num % 2 == 0 ){
            return text + "Even!";
        }
        else{
            return text + "Odd!";
        }
    }

    public static void lessThanFive(int num){
        for(int i = 5; num < i; num++ ){
            System.out.println("Is " + String.valueOf(num) + " less than " + String.valueOf(i));
        }
    }
}
