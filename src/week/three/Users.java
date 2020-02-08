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
    }
}
