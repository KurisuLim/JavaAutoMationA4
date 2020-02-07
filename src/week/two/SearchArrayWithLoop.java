package week.two;

public class SearchArrayWithLoop {
    public static void main(String[] args) {
        String[] names = {"John", "Edward", "Kim", "Mike", "Oscar"};

        for(int i = 0; i < names.length; i++){
            if(names[i] != "Kim"){
                System.out.println("Not found! The current position is: " + i);
            } else {
                System.out.println("Yes found! The current position is: " + i);
                break; // ends the loop
            }
        }
    }
}
