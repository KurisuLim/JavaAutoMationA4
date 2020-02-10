package week.three;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public static void main(String[] args ){
        Student apprentice = new Student();
        apprentice.major = "QA Automation";
        apprentice.firstName = "Chris";
        apprentice.lastName = "Lim";
        apprentice.jobTitle = "QA Engineer";
        apprentice.email ="lim@testpro.io";


        Teacher instructor = new Teacher();
        instructor.firstName = "Marianne";
        instructor.lastName = "Lim";

        List<User> people = new ArrayList<User>();
        people.add(apprentice);
        people.add(instructor);

        for(User info : people ){
            info.profile();
        }

        Members me = new Members();
        me.setFirstName("Chris");
        me.setLastName("Lim");

        Members you = new Members();
        you.setFirstName("Marianne");
        you.setLastName("Lim");

        List<Members> users = new ArrayList<Members>();
        users.add(me);
        users.add(you);

        System.out.println(Members.searchList(users,"Chris", "Lim"));
        System.out.println(Members.searchList(users,"Marianne", "Lim"));
        System.out.println(Members.searchList(users,"Cj", "Lim"));

        //Override to String
        System.out.println(me.toString());

        // Override equals
        System.out.println(me.equals(you));

        // overload the search to take in a user object
        System.out.println(Members.searchList(users, you));

        //returning custom objects
        Members search = new Members();
        search.setFirstName("Not");
        search.setLastName("Me");

        Members found = Members.findUser(users,search);
        System.out.println(found);

        // invoking parent class methods with super keyword
        Student s = new Student();
        s.sayHello();

    }

}
