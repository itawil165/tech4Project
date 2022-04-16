package inheritance;

public class Person {

    // Instance variables
    public String fName;
    public String lName;
    protected int age;
    protected String gender;
    double weight;
    double height;
    private String DOB;
    private String SSN;

    // Default constructor
    public Person() {
    }

    // 4-arg constructor
    public Person (String fName, String lName, int age, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    public void sleep() {
        System.out.println("People sleep");
    }

    public void learn() {
        System.out.println("People learn");
    }

    public void walk() {
        System.out.println("People walk");
    }

    public void eat() {
        System.out.println("People eat");
    }

    // getter and setter for DOB
    public String getDOB() {
        return DOB;
    }
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    // getter and setter for SSN
    public String getSSN() {
        return SSN;
    }
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    // getClass() gets us the specific class
    // getName() gives the full package route while getSimpleName() only gives the class name
    // can also use substring(indexOf('.'))
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
