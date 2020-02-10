package week.three;
import java.util.List;

public class Members {

    public String firstName;
    public String lastName;


    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }

    public String getFirstName(){
        return firstName;
    }

    public void  setFirstName(String fName){
        firstName = fName.strip();
    }

    public String getLastName(){
        return lastName;
    }

    public void  setLastName(String lName){
        lastName = lName.strip();
    }

    public static String searchList(List<Members> users, String firstName, String lastName){
        return searchList(users, firstName + " "+ lastName);
    }

    public static String searchList(List<Members> users, String fullName){
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getFullName().equals(fullName)){
                return fullName + " is found!";
            }
        }
        return "User does not exist!";
    }
}
