package week.three;
import java.util.*;

public class People {

    public void work(){
        System.out.println("I work as something.");
    }

    public static void main(String[] args){
        List<People> peoples = new LinkedList<People>();

        peoples.add(new People());
        peoples.add(new QAEngineer());
        peoples.add(new Developer());
        peoples.add(new CEO());

        for(People job : peoples){
            job.work();
        }
    }

    public static class QAEngineer extends People{
        @Override
        public void work(){
            System.out.println("I work as QA Engineer.");
        }
    }

    public static class Developer extends People{
        @Override
        public void work(){
            System.out.println("I work as Developer.");
        }
    }

    public static class CEO extends People{
        @Override
        public void work(){
            System.out.println("I work as CEO.");
        }
    }
}
