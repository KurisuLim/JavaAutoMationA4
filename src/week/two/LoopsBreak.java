package week.two;

public class LoopsBreak {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            for(int k = i; k <=10; k++){
                if(k == 4){
                    break;
                }
                System.out.print(k);
            }
            System.out.println((""));
        }
    }
}


 /*
 * // It skips the number 4 row
123
23
3

5678910
678910
78910
8910
910
10
 * */