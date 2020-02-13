package week.four;
import java.lang.reflect.Array;
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
        //add method adds a new element on the list
        users.add("Test Pro");
        System.out.println(users); // [Chris, Marianne, CJ, Arianne, Test Pro]

        //get methods display what index
        System.out.println(users.get(4)); // display Test Pro

        //set methods grabs the element and replace or add new value
        users.set(4,"Test Pro Rocks!");
        System.out.println(users); // [Chris, Marianne, CJ, Arianne, Test Pro Rocks!]

        //size methods returns the size of the array list
        System.out.println(users.size()); // 5

        //remove method removes the element and value
        users.remove(4);
        System.out.println(users); // [Chris, Marianne, CJ, Arianne]

    }

}
