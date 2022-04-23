package projects.project10;

public class Book {

    // Book constructor
    public Book (String name, String genre, int totalPage) {
        this.name = name;
        this.genre = genre;
        this.totalPage = totalPage;
    }

    // Instance variables
    public String name;
    public String genre;
    public int totalPage;

    // Count number of books - max 3
    public static int numberOfBooks;

    public static void bookNumber() {
        numberOfBooks++;
    }

    // Book questions
    public static final String askInfo = "Would you like to enter information about one of their books? (At least 3 required)";
    public static final String askBookName = "What is the books name?";
    public static final String askBookGenre = "What is the genre of the book?";
    public static final String askBookLength = "How many pages is the book?";

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }
}
