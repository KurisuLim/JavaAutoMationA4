package week.three;

public class Student extends User {
    public boolean verified = true;
    public String major;

    @Override

    public void profile(){
        System.out.println( firstName + " " + lastName + "\n" +
                jobTitle + "\n" +
                email + "\n");
    }
}
