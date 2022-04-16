package inheritance;

public class Tester extends Person { // inheriting methods and objects from Person Class

    // Default constructor
    public Tester() {
    }
    int nothing;

    // 4-arg constructors

    // call each parameter by name
    public Tester (String fName, String lName, int age, String gender, int nothing) {
        super.fName = fName;
        super.lName = lName;
        super.age = age;
        super.gender = gender;
    }

    // ------ OR ------

    // call each parameter by method
    public Tester (String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }
}
