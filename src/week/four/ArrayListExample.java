package week.four;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args){
        String[] names = {"Chris", "Marianne", "CJ", "Arianne"};

        List<String> users = new ArrayList<String>();

        for (int i = 0; i < names.length; i++){
            users.add(names[i]);
        }

        for(String list : users) {
            System.out.println(list);
        }
    }
}
