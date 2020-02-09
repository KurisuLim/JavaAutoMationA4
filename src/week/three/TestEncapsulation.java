package week.three;

public class TestEncapsulation {
    public static void main(String[] args){

        users("Chris Lim", 33, true);
        System.out.println("");
        users("Marianne", 34, false);
        System.out.println("");
        customGetter("Cj", 2, false);

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

        System.out.println(object.fullInfo());
    }
}
