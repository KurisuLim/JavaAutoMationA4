package week.one;

public class StringMethod {
    public static void main(String[] args){
        String test = "Test";
        String pro = " Pro";
        String testPro = "Test Pro";

        System.out.println(testPro.toLowerCase());
        System.out.println(testPro.toUpperCase());
        System.out.println(testPro.length());
        System.out.println(testPro.contains("e"));
        System.out.println(test.concat(pro));
        System.out.println(testPro.strip());
        System.out.println(testPro.substring(4));
        System.out.println(testPro.substring(4, 6));
        System.out.println(testPro.repeat(4));
        System.out.println(test == pro);
        System.out.println(test.equals(pro));
    }
}
