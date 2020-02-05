package week.one;

public class Numbers {
    public static void main(String[] args){
        System.out.println(multipliedBy(3,3));
        System.out.println(product(3,3,3));
        System.out.println(square(3));
    }

    public static String multipliedBy(int num1, int num2){
        String message;
        int equal;
        equal = num1 * num2;
        message = String.valueOf(num1) + " * " + String.valueOf(num2) + " = ";
        return message + String.valueOf(equal);
    }

    public static String product(int num1, int num2, int num3){
        String message;
        int prod;
        prod = num1 * num2 * 3;
        message = String.valueOf(num1) + " * " + String.valueOf(num2) + " * " + String.valueOf(num3) + " = ";
        return message + String.valueOf(prod);
    }

    public static String square(double num){
        String message;
        int number;
        number = Integer.valueOf((int) (num * num));
        message = "Square of " + String.valueOf((num)) + " is ";
        return message + String.valueOf(number);
    }
}
