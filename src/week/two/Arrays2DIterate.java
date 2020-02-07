package week.two;

public class Arrays2DIterate {
    public static void main(String[] args){
        int[][] grades = {
                {74,75,80},
                {90,91,97,93,92,95},
                {79,70,65}
        };

        for(int row = 0; row < grades.length; row++){
            for(int col = 0; col < grades[row].length; col++){
                System.out.print(grades[row][col] + " ");
            }
            System.out.println();
        }
        /*
        74 75 80
        90 91 97 93 92 95
        79 70 65
        * */

    }
}
