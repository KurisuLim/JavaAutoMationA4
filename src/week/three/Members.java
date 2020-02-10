package week.three;
import java.util.List;
import java.util.Objects;

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

    public static Members findUser(List<Members> users, Members name){
        for(Members element : users){
            if(element.equals(name)){
                return element;
            }
        }
        return null;
    }
    public static String searchList(List<Members> users, Members obj){
        return searchList(users, obj.getFullName());
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

    // overrides the toString method
    @Override
    public String toString(){
        return "User [getFullName()=" + getFullName() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Members)) return false;
        Members members = (Members) o;
        return Objects.equals(firstName, members.firstName) &&
                Objects.equals(lastName, members.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
