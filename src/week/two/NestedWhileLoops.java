package week.two;

public class NestedWhileLoops {
    public static void main(String[] args){
        int i = 1;

        while(i <= 10){
            int k = i;
            while(k <=10 ){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
