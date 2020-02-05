package week.one;

public class TempConversion {
    public static void main(String[] args){
        System.out.println(convertFtoC(85));
    }

    public static Integer convertFtoC(int numF){
        int c;
        c = (numF -32) * 5/9;
        return c;
    }
}
