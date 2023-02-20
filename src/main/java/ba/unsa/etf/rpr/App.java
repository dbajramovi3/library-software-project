package ba.unsa.etf.rpr;

import java.util.Scanner;
/**
 * Hello world!
 * comment by dbajramovi3
 */
public class App  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello, welcome to Library-Management System");
        System.out.println("Please type one of the following options:");
        System.out.println();
        System.out.println("Type 1 to ADD a Book");
        System.out.println("Type 2 to ADD a Member");
        System.out.println("Type 3 to Search for a Book");
        System.out.println("Type 4 to Search for a Member");
        System.out.println("Type 5 to see the list of all Books");
        System.out.println("Type 6 to see the list of all Members");
        System.out.println("Type 7 to REGISTER a Book");
        System.out.println("Type 8 to view the Shopping cart");

        int userInput = 0;
        String title;
        String author;
        int bookCount;
        String[][] books = new String[100][3]; // create a 2D array to store books

        while (userInput != 9) {
            System.out.println("Type 9 to exit");
            userInput = scanner.nextInt();

            if (userInput == 1) {
                // Get input from the user
                System.out.println("Enter the title of the book:");
                scanner.nextLine(); // consume the newline character left by scanner.nextInt()
                title = scanner.nextLine(); // use nextLine() to read the whole line
                System.out.println("Enter the author of the book:");
                author = scanner.nextLine();
                System.out.println("Enter the number of books:");
                bookCount = scanner.nextInt();
                for (int i = 0; i < books.length; i++) {
                    if (books[i][0] == null) { // check for an empty slot in the array
                        books[i][0] = title;
                        books[i][1] = author;
                        books[i][2] = String.valueOf(bookCount);
                        break;
                    }
                }
            }
        }

        // Print the books in the array
        System.out.println("Books in the library:");
        for (int i = 0; i < books.length; i++) {
            if (books[i][0] != null) {
                System.out.println(books[i][0] + " by " + books[i][1] + ", " + books[i][2] + " copies");
            }
        }


    }
}






