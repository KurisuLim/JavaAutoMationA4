package week.one;

public class SwitchStatement {
    public static void main(String[] args) {
        Month("january");
        Month("March");
        Month("April");
        Month("November");
    }

    public static void Month(String month){
        switch (month){
            case "January":
                System.out.println("Some cool kids birthday!");
                break;
            case "March":
                System.out.println("Ooh Wedding!");
                break;
            case "November":
                System.out.println("A pretty woman's birthday!");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
    }
}
