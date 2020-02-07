package week.three;

public class Methods {
    String name = "Zhou";
    public String talk(){
        return "Hi! I'm " + name;
    }
    public static void main(String[] args){
        Methods me = new Methods();
        me.name = "Ed";
        System.out.println(me.talk());
    }
}
