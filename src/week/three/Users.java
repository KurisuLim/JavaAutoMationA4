package week.three;

public class Users {
    public static void main(String[] args ){
        User user = new User();
        user.firstName = "Chris";
        user.lastName = "Lim";
        user.jobTitle = "Lead QA Engineer";
        user.email = "chris.lim@testpro.io";

        String message = user.profile();

        System.out.println(message);
    }
}
