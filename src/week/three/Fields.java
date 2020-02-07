package week.three;

public class Fields {
    // Fields Variables
    String firstName = "John";
    String lastName = "Doe";
    String email = "john.doe@testpro.io";
    public static void main(String[] args){
        Fields userOne = new Fields();
        userOne.firstName = "Tom";
        userOne.lastName = "Jones";
        userOne.email = "tom.jones@testpro.io";
        System.out.println(
                userOne.firstName + "\n" +
                userOne.lastName + "\n" +
                        userOne.email
        );


    }
}
