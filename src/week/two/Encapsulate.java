package week.two;

public class Encapsulate {
    // private variable declared
    // these can only be accessed by
    // public methods of class
    private String name;
    private int age;
    private boolean student;

    // get method for name to access
    // private variable name
    public String getName(){
        return name;
    }

    // get method for age to access
    // private variable age
    public int getAge(){
        return  age;
    }

    // get method for student to access
    // private variable student
    public boolean getStudent(){
        return student;
    }

    // set method for name to access
    // private variable name
    public void setName(String newName){
        name = newName;
    }

    // set method for age to access
    // private variable age
    public void setAge(int newAge){
        age = newAge;
    }

    // set method for student to access
    // private variable student
    public void setStudent(boolean newStudent){
         student = newStudent;
    }

}
