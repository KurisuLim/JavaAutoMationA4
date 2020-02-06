package week.two;

public class LoopsContinue {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            for(int k = i; k <=10; k++){
                if(k == 4){
                    continue;
                }
                System.out.print(k + " ");
            }
            System.out.println((""));
        }
    }
}

/*
*  Only skips the number 4
1 2 3 5 6 7 8 9 10
2 3 5 6 7 8 9 10
3 5 6 7 8 9 10
5 6 7 8 9 10
5 6 7 8 9 10
6 7 8 9 10
7 8 9 10
8 9 10
9 10
10
*
* */