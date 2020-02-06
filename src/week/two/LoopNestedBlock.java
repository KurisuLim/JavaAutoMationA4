package week.two;

public class LoopNestedBlock {
    public static void main(String[] args){
        boolean found ;
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
            if( i == 5){
                found = true;
                if( found == true ){
                    System.out.println("You found Five!");
                }
            }
        }
    }
}
