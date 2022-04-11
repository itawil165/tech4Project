package projects;

public class Project01 {
    public static void main(String[] args) {

// TASK 01

        String myName = "Ismail";
        System.out.println("My name is " + myName);

        System.out.println("\n\t-------TASK 01 END-------\n");

// TASK 02

        char capitalI = 'I';
        char s = 's';
        char m = 'm';
        char a = 'a';
        char i = 'i';
        char l = 'l';

        System.out.println(capitalI + "\n" + s + "\n" + m + "\n" + a + "\n" + i + "\n" + l);

        System.out.println("\n\t-------TASK 02 END-------\n");

// TASK 03

        String myFavMovie = "Star Wars: Revenge of the Sith.";
        String myFavSong = "Qasidah Burdah.";
        String myFavCity = "Kyoto, Japan.";
        String myFavActivity = "playing video games.";
        String activityStatement = "My favorite activity is "; // for String + String method
        String myFavSnack = "Ferroro Rocher.";
        String snackStatement =  "My favorite snack is "; // for String.concat() method

        System.out.println("My favorite movie is " + myFavMovie);
        System.out.println("My favorite song is " + myFavSong);
        System.out.println("My favorite city is " + myFavCity);
        System.out.println(activityStatement + myFavActivity); // String + String method
        System.out.println(snackStatement.concat(myFavSnack)); // String.concat() method

        System.out.println("\n\t-------TASK 03 END-------\n");

// TASK 4

        int myFavNumber = 9;
        int numberOfStatesVisited = 5;
        int numberOfCountriesVisited = 3;

        System.out.println("My favorite number is " + myFavNumber + ".");
        System.out.println("I have visited " + numberOfStatesVisited + " states.");
        System.out.println("I have visited " + numberOfCountriesVisited + " countries.");

        System.out.println("\n\t-------TASK 04 END-------\n");

// TASK 5

        boolean amIAtSchoolToday = false;
        System.out.println("Am I on campus today for class? " + amIAtSchoolToday);

        System.out.println("\n\t-------TASK 05 END-------\n");

// TASK 6

        boolean isTheWeatherNiceToday = false;
        System.out.println("Is the weather nice today? " + isTheWeatherNiceToday);

        System.out.println("\n\t-------TASK 06 END-------\n");


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}



