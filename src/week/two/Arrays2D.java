package week.two;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args){
        int [][] studentGrades = new int [3][4];
        // [3] rows
        // [4] column
        /*
        0  1  2  3  index
        [1][2][3][4] 0
        [2][3][4][5] 1
        [3][4][5][6] 3
        */

        System.out.println(Arrays.toString(studentGrades));
        studentGrades[0][1] = 1985;
        System.out.println(Arrays.toString(studentGrades));
    }
}
