package week.one;

public class Binary {
    public static void main(String[] args){
        binaryInt(12345);
    }

    public static void binaryInt(int num){
        System.out.println("Binary is " + Integer.toBinaryString(num));
    }
}
