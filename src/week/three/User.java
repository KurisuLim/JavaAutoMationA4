package week.three;

public abstract class User {

    public String firstName;
    public String lastName;
    public String jobTitle;
    public String email;
    private int id;
    public boolean verified = false;

    public abstract void profile();

}
