package projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Project10 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Create collection for Author Info
        ArrayList<Author> author = new ArrayList<>();

        // Gather Author Information
        System.out.println(Author.askAuthorFName);
        String firstName = userInput.nextLine();

        System.out.println(Author.askAuthorLName);
        String lastName = userInput.nextLine();

        System.out.println(Author.askAuthorCountry);
        String country = userInput.nextLine();

        System.out.println(Author.askIfAlive);
        String isAlive = userInput.nextLine();

        String age = "N/A";
        boolean isAliveBool = false;


        if (isAlive.toLowerCase().startsWith("y")) {
            isAliveBool = true;
            System.out.println(Author.askAuthorAge);
            age = String.valueOf(userInput.nextInt());
        }

        // Update Author Info
        Author authorInfo = new Author(firstName, lastName, country, isAliveBool, age);


        // Create collection for books
        ArrayList<Book> books = new ArrayList<>();


        do {
            Book.numberOfBooks++;

            // Gather Book Information
            System.out.println(Book.askInfo);
            String infoConfirm = userInput.nextLine();

            System.out.println(Book.askBookName);
            String name = userInput.nextLine();

            System.out.println(Book.askBookGenre);
            String genre = userInput.nextLine();

            System.out.println(Book.askBookLength);
            int totalPage = userInput.nextInt();

            userInput.nextLine(); // reset input spacing

            // Update book collection
            Book book = new Book(name, genre, totalPage);
            books.add(book);

        } while (Book.numberOfBooks < 3);

        System.out.println(authorInfo);
        System.out.println(books);


        System.out.println("\n\t//-----END PROGRAM-----//\n");
    }
}
