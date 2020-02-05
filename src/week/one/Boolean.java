package week.one;

public class Boolean {
    public static void main(String[] args){
        System.out.println((bool(false,false)));
        System.out.println((bool(true,false)));
        System.out.println((bool(true,true)));
    }

    public static String bool(boolean state1, boolean state2){
        String message = String.valueOf(state1) + " == " + String.valueOf(state2) + " is  ";
        boolean value;
        value = state1 == state2;
        return message + String.valueOf(value);
    }
}
