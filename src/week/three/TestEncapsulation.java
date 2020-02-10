package week.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEncapsulation {
    public static void main(String[] args){

        users("Chris Lim", 33, true);
        System.out.println("");
        users("Marianne", 34, false);
        System.out.println("");
        customGetter("Cj", 2, false);
        arrayCustomType();
        System.out.println("");
        customTypeLoop();

        // static method example
        Encapsulate user = new Encapsulate();
        user.setName("Zero Sugar");
        user.setAge(47);
        user.setStudent(false);
        Encapsulate.staticPrintUser(user);

        // creating Default Constructor
        Teacher instructor = new Teacher();

        // Creating a Custom Constructor
        Teacher guru = new Teacher("Aj", "Gonzalez", "Designer");

        // Array list custom type
        userList();

        // working with method overloads
        customGetter("John Cena", false);
        customGetter("Kevin Owen", true);

    }

    public static void users(String name, int age, boolean student) {

        Encapsulate dataObj = new Encapsulate();
        // setting the value of the variables
        dataObj.setName(name);
        dataObj.setAge(age);
        dataObj.setStudent(student);

        // displaying the values of the variables
        System.out.println("Name: " + dataObj.getName());
        System.out.println("Age: " + dataObj.getAge());
        System.out.println("Test Pro Student: " + dataObj.getStudent());

        /* Notes
        * direct access to the private variables from Encapsulation class
        * will not be possible due to encapsulation
        * For example:
        * System.out.printLn("Hi! " + dataObj.name);
        * */
    }

    public static void customGetter(String name, int age, boolean student) {

        Encapsulate object = new Encapsulate();

        object.setName(name);
        object.setAge(age);
        object.setStudent(student);

        System.out.println(object.getFullInfo());
    }
    // method overloads
    public static void customGetter(String name, boolean student) {

        Encapsulate object = new Encapsulate();

        object.setName(name);
        object.setStudent(student);

        // working overload
        System.out.println(object.getFullInfo(student));
    }

    public static void arrayCustomType(){
        Encapsulate person1 = new Encapsulate();
        person1.setName("Person One");
        person1.setAge(21);
        person1.setStudent(true);

        Encapsulate person2 = new Encapsulate();
        person2.setName("Person Two");
        person2.setAge(22);
        person2.setStudent(true);

        Encapsulate person3 = new Encapsulate();
        person3.setName("Person Three");
        person3.setAge(23);
        person3.setStudent(true);

        Encapsulate instructor = new Encapsulate();
        instructor.setName("Instructor");
        instructor.setAge(43);
        instructor.setStudent(false);

        List<Encapsulate> people = new ArrayList<Encapsulate>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(instructor);

        int length = people.size();

        System.out.println("");

        for(int i=0; i < length; i++ ){
            System.out.println(Arrays.toString(people.toArray()));
        }

    }

    public static void customTypeLoop(){
        String[] name = {"Dean", "Sam", "Castiel", "Jack"};
        int[] age = {40,35,1000,1};
        boolean[] student = { false, false, false, true};

        List<Encapsulate> hunters = new ArrayList<Encapsulate>();

        // loop that adds the people in the list
        for(int i = 0; i < name.length; i++){
            Encapsulate winchesters = new Encapsulate();
            winchesters.setName(name[i]);
            winchesters.setAge((age[i]));
            winchesters.setStudent(student[i]);
            hunters.add(winchesters);
        }
        // for each
        for(Encapsulate winchesters : hunters){
            System.out.println(winchesters.getFullInfo());
        }

        // taking custom types as arguments
        TestEncapsulation encapsulate =  new TestEncapsulation();
        encapsulate.printUser(hunters.get(0));

    }

    public void printUser(Encapsulate u){
        System.out.println("\n"+ u.getFullInfo());
    }

    public static void userList(){
        String[] name = {"Goku", "Vegita", "Gohan", "Piccolo"};

        List<Encapsulate> dragonBallZ = new ArrayList<Encapsulate>();

        for(int i = 0; i < name.length; i++){
            Encapsulate zFighters = new Encapsulate();
            zFighters.setName(name[i]);
            dragonBallZ.add(zFighters);
        }

        Encapsulate.printUserList(dragonBallZ);
    }
}
