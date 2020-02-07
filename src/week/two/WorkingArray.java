package week.two;

public class WorkingArray {
    public static void main(String[] args){
//        int[] grades = new int[10];
//        grades[0] = 10;
//        System.out.println(grades[0]);

        // another way to use an array
        int[] lottoNumbers = {4,11,19,8,5,7,1};

        for(int i = 0; i < lottoNumbers.length; i++){
            System.out.print(lottoNumbers[i] + ",");
        }
    }
}
