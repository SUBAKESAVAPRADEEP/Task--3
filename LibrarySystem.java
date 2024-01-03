package Pradeep;

import java.awt.print.Book;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    Book book = new Book(bookID, title, author);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    int removeID = scanner.nextInt();
                    library.removeBook(removeID);
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    int searchID = scanner.nextInt();
                    library.searchBook(searchID);
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");

            }

            System.out.println();
        }}}
