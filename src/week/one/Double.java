package week.one;

public class Double {
    public static void main(String[] args){
        System.out.println(dblToInt(3452.345));
    }

    public static double dblToInt(double num){
        int sum  = (int)num;
        return sum;
    }
}
