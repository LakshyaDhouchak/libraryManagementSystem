package Details;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class loginSuccess {

    // Define the properties
    private ArrayList<BookIssue> bIssue = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // Method to search for a book
    public void bookSearch() {
        System.out.println("Enter the book name:");
        String bookName = input.next();

        boolean isBookFound = false;
        for (BooksDetails book : BooksDetails.booksList) {
            if (book.getBook_name().equalsIgnoreCase(bookName)) {
                System.out.println("Book is available with " + book.getAvailable_pieces() + " pieces.");
                isBookFound = true;
                break;
            }
        }
        if (!isBookFound) {
            System.out.println("Book is not available in the library.");
        }
    }

    // Method to issue a book
    public void bookIssue() {
        System.out.println("Enter the Book ID:");
        int bookId = input.nextInt();

        for (BooksDetails book : BooksDetails.booksList) {
            if (book.getBooks_id() == bookId) {
                if (book.getAvailable_pieces() > 0) {
                    System.out.println("Enter the Student ID:");
                    int studentId = input.nextInt();

                    boolean alreadyIssued = bIssue.stream()
                            .anyMatch(issue -> issue.getBookId() == bookId && issue.getStdId() == studentId);

                    if (alreadyIssued) {
                        System.out.println("You have already issued this book.");
                    } else {
                        bIssue.add(new BookIssue(bookId, studentId));
                        book.setAvailable_pieces(book.getAvailable_pieces() - 1);
                        System.out.println("Book issued successfully.");
                    }
                } else {
                    System.out.println("No copies of this book are currently available.");
                }
                return;
            }
        }
        System.out.println("Book ID not found.");
    }

    // Method to return a book
    public void returnBook() {
        System.out.println("Enter the Student ID:");
        int studentId = input.nextInt();

        System.out.println("Enter the Book ID:");
        int bookId = input.nextInt();

        Iterator<BookIssue> iterator = bIssue.iterator();
        boolean isBookReturned = false;

        while (iterator.hasNext()) {
            BookIssue issue = iterator.next();
            if (issue.getStdId() == studentId && issue.getBookId() == bookId) {
                iterator.remove();
                for (BooksDetails book : BooksDetails.booksList) {
                    if (book.getBooks_id() == bookId) {
                        book.setAvailable_pieces(book.getAvailable_pieces() + 1);
                        break;
                    }
                }
                System.out.println("Book returned successfully.");
                isBookReturned = true;
                break;
            }
        }

        if (!isBookReturned) {
            System.out.println("Invalid Student ID or Book ID, or no record of this issue exists.");
        }
    }
}

