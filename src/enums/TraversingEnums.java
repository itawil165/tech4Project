package enums;

public class TraversingEnums {
    public static void main(String[] args) {

        System.out.println("-----Days-----");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // Traverse months
        System.out.println("-----Months-----");
        for (Constants.Month month : Constants.Month.values()) {
            System.out.println(month);
        }

    }
}
