package week.four;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertListToArray {
    public static void main(String[] args){
        List<String> users = Arrays.asList("Account Owner", "Account Admin", "Facilitator", "Coach");
        String[] role = new String[users.size()];

        for(int i = 0; i < users.size();i++){
            role[i] = users.get(i);
        }

        System.out.println(Arrays.toString(role)); //[Account Owner, Account Admin, Facilitator, Coach]

        //Sorting the list
        Collections.sort(users);
        System.out.println(users); // [Account Admin, Account Owner, Coach, Facilitator]

        //reversing the list
        Collections.reverse(users);
        System.out.println(users); //[Facilitator, Coach, Account Owner, Account Admin]

    }
}
