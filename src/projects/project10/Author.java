package projects.project10;

public class Author {

    // Author Constructor
    public Author (String firstName, String lastName, String country, boolean isAliveBool, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAliveBool = isAliveBool;
        this.age = age;
    }

    // Instance Variables
    public String firstName;
    public String lastName;
    public String country;
    public boolean isAliveBool;
    public String age;

    // Author Questions
    public static final String askAuthorFName = "What is your favorite author's first name?";
    public static final String askAuthorLName = "What is their last name?";
    public static final String askAuthorCountry = "Where are they from?";
    public static final String askIfAlive = "Are they alive? Y/N";
    public static final String askAuthorAge = "How old are they?";

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive='" + isAliveBool + '\'' +
                ", age=" + age +
                '}';
    }
}

