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
    }

}
