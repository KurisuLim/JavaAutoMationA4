package week.four;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args){

        // HashSet cannot add the same value
        // Have different order
        // HashSet can be referred as Set
        HashSet<String> userRole = new HashSet<>();
        userRole.add("Owner");
        userRole.add("Admin");
        userRole.add("Facilitator");
        userRole.add("Coach");
        userRole.add("Learner");
        userRole.add("Member");
        userRole.add("Member");

        System.out.println("HashSet: " + userRole);
        System.out.println("");
        // custom method
        treeSet();
        System.out.println("");
        unionSet();
    }

    public static void treeSet(){

        Set<String> tester = new HashSet<>();
        tester.add("Test");
        tester.add("Pro");
        tester.add("Test");
        tester.add("Java");
        tester.add("Automation");

        System.out.print("Set output without the  duplicates ");
        System.out.println(tester);

        // Set demonstration using TreeSet
        // Sorts the set list
        System.out.print("Sorted Set after passing into TreeSet ");
        Set<String> qa = new TreeSet<>(tester);
        System.out.println(qa);
    }

    public static void unionSet(){
        Set<String> skills = new HashSet<>();
        skills.addAll(Arrays.asList(new String[] {"Process of Bug Tracking", "Ticketing", "Testing"}));
        Set<String> abilities = new HashSet<>();
        abilities.addAll(Arrays.asList(new String[] {"Process of Bug Tracking", "Ticketing", "Testing", "Analytical", "Logical Thinking", "Superior", "and", "Diverse Communication Skills"}));

        //to combine all or union
        Set<String> union = new HashSet<>(skills);
        union.addAll(abilities);
        System.out.println("\nUnion of the two sets: " + union);

        //to find intersection or the one that have duplicates
        Set<String> intersection = new HashSet<>(skills);
        intersection.retainAll(abilities);
        System.out.println("\nIntersection of the two sets: " + intersection);

        //to find difference or the one that have duplicates
        Set<String> difference = new HashSet<String>(skills);
        difference.removeAll(abilities);
        System.out.println("\nDifference of the two sets: " + difference);
    }

}
