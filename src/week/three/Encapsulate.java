package week.three;

import java.util.List;

public class Encapsulate {
    // private variable declared
    // these can only be accessed by
    // public methods of class
    private String name;
    private int age;
    private boolean student;

    //Custom Getter and Setter
    public String getFullInfo(){
        return "Name: " + getName() + "\n" +
               "Age: " + String.valueOf(getAge()) + "\n" +
               "Student: " + String.valueOf(getStudent());
    }

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
        name = newName.strip();
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

    public static void staticPrintUser(Encapsulate u){
        System.out.println("\n"+ u.getFullInfo());
    }

    public static void printUserList(List<Encapsulate> users){
        for(Encapsulate list : users){
            System.out.println("\n"+ list.getFullInfo());
        }
    }

}
