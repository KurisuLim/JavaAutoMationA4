package week.three;

public class Teacher extends User {
    @Override

    public void profile(){
        System.out.println(firstName + " " + lastName + "\n" +
                "I'm a teacher" + "\n"
        );
    }

}
