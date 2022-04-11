package variables;

public class StringVariables {
    public static void main(String[] args) {
        // dataType variable = data;

        String myFirstString; // Declaration
        myFirstString = "Hello"; // Assignment

        String greetings = "Hello World!"; // Declaration and Assignment
        System.out.println(greetings);
        System.out.println("Hel" + "lo, " + greetings);
        System.out.println(); // Spacing

        // We can do a more tedious process with the char variable

        char w = 'H', x = 'e', y = 'l', z = 'o', e = '!';
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(y);
        System.out.println(z);
        System.out.println(e);
        System.out.println(); // Spacing

        // Putting  assigned Strings together
        String tech = "Tech";
        String global = "Global";

        String schoolName1 = tech + global; // String using + operator
        String schoolName2 = tech.concat(global); // String using concat method
        System.out.println(schoolName1 + "\n" + schoolName2);
    }
}
