package week.three;

public class User {

    public String firstName;
    public String lastName;
    public String jobTitle;
    public String email;
    private int id;

    public String profile(){
        return firstName + " " + lastName + "\n" +
                        jobTitle + "\n" +
                        email;
    }

}
