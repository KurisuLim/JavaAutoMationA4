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

    public void sayHello(){

        //super keyword to access the user class method
        super.sayHello();
        System.out.println("This is the Student version!");
    }

}
