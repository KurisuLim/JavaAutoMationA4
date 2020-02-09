package week.three;

public class Teacher extends User {

    public Teacher(String fName, String lName, String jTitle){
        firstName = fName;
        lastName = lName;
        jobTitle = jTitle;

        System.out.println("\nCreating a Custom Teacher...");
        System.out.println("Name: " + firstName + " " + lastName + "\n" +
                "Job Title: " + jobTitle);

    }

    public Teacher(){
        firstName = "Default";
        lastName = "Name";
        jobTitle = "Unknown";

        System.out.println("\nCreating a Default Teacher...");
        System.out.println("Name: " + firstName + " " + lastName + "\n" +
                "Job Title: " + jobTitle);
    }

    @Override
    public void profile(){
        System.out.println(firstName + " " + lastName + "\n" +
                "I'm a teacher" + "\n"
        );
    }

}
