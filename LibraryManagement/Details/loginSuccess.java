package Details;
import java.util.ArrayList;
import java.util.Scanner;
public class loginSuccess {

    // define the properties
    ArrayList<BookIssue> bIssue = new ArrayList<>();

    // define the Scanner
    Scanner input =  new Scanner(System.in);
    
    // define the bookSearch() methord
    public void bookSearch(){
        int flag =0;
        System.out.println("Enter the book name:");
        String book = input.next();

        for(BooksDetails books : BooksDetails.booksList){
            if(books.getBook_name().equals(book)){
                System.out.println("Book is present with "+books.getAvailable_pieces()+" Available piece");
                flag =1;
            }
        }
        if(flag ==0){
            System.out.println("Book id not available in library");
        }
    }

    // define the book issue() methord
    public void bookissue(){
        // define the properties
        int flag =0;
        System.out.println("Enter the BookId:");
        int bookId = input.nextInt();
        for(BooksDetails books : BooksDetails.booksList){
            if(books.getBooks_id() == bookId){
                if(books.getAvailable_pieces()>=1){
                    System.out.println("Enter the studentId:");
                    int studentId = input.nextInt();
                    for(BookIssue issue: bIssue){
                        if(issue.getBookId() == bookId && issue.getStdId() == studentId ){
                            flag =1;
                            System.out.println("you have already issue the book");
                            break;
                        }
                    }
                    if(flag ==0){
                        // calling the issue class Object
                        BookIssue BookIssue = new BookIssue(bookId,studentId);
                        bIssue.add(BookIssue);
                        int currentPiece = books.getAvailable_pieces();
                        books.setAvailable_pieces(currentPiece--);
                    }    

                }
            }
        }
        
    }

    // define the return book() methord
    public void returnBook(){
        // define the properties
        int flag1 =0;
        int flag =0;
        System.out.println("Enter the studentId:");
        int stdId = input.nextInt();
        for(BookIssue issue: bIssue){
            if(issue.getStdId() == stdId){
                System.out.println("Enter the book id");
                int bookId = input.nextInt();
                if(issue.getBookId()== bookId){
                    flag1 =1;
                    bIssue.remove(issue);
                }
                else{
                    for(BookIssue issue2 : bIssue){
                        if(issue2.getBookId() == bookId){
                                bIssue.remove(issue2);
                                flag1 =1;
                        }
                    }
                    if(flag1 ==0){
                        System.out.println("Inavlid bookId");
                    }
                }
                flag =1;

            }
        }
        if(flag == 0){
            System.out.println("You have not issued any book or your StdId is wrong");
        }

    }
    
}
