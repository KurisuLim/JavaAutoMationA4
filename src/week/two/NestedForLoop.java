package week.two;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            for(int k = i; k <= 10; k++){
                System.out.print(k + "+");
            }
            System.out.println("next line");
        }
    }
}
