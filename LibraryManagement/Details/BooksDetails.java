package Details;

import java.util.ArrayList;
import java.util.Scanner;

public class BooksDetails {
    // define the properties
    static ArrayList<BooksDetails> booksList = new ArrayList<>();
    private static final int passward1 = 123;
    private int books_id ;
    private String book_name;
    private int Total_pieces;
    private int Available_pieces;

    //define the constructor

    public BooksDetails() {
    }

    public BooksDetails(int bookId,String book_name, int Total_pieces) {
        this.books_id = bookId;
        this.book_name = book_name;
        this.Total_pieces = Total_pieces;
        this.Available_pieces = Total_pieces;
    }

    public BooksDetails(int books_id, String book_name, int Total_pieces, int Available_pieces) {
        this.books_id = books_id;
        this.book_name = book_name;
        this.Total_pieces = Total_pieces;
        this.Available_pieces = Available_pieces;
    }
    

    // define the getter and setter methord

    public int getBooks_id() {
        return this.books_id;
    }

    public void setBooks_id(int books_id) {
        this.books_id = books_id;
    }

    public String getBook_name() {
        return this.book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getTotal_pieces() {
        return this.Total_pieces;
    }

    public void setTotal_pieces(int Total_pieces) {
        this.Total_pieces = Total_pieces;
    }

    public int getAvailable_pieces() {
        return this.Available_pieces;
    }

    public void setAvailable_pieces(int Available_pieces) {
        this.Available_pieces = Available_pieces;
    }

    @Override
    public String toString() {
        System.out.println(getBooks_id() + ",  " +getBook_name() + ",  " +getTotal_pieces() + ",  " +getAvailable_pieces()) ;
        return null;
    }

    

    // define the psvm() methord
    public static void add() {
        // define the properties
        int choice =0;
        int flag;
        // calling the Scanner 
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the password:");
        int passward = input.nextInt();
        
        if(passward  == passward1){
            do{
                flag =0;
                System.out.println("Enter the id:");
                int id = input.nextInt();
                System.out.println("Enter the book name:");
                String book = input.next();
                System.out.println("Enter the no of pieces");
                int peice = input.nextInt();
                // calling the class Object
                BooksDetails bDetails = new BooksDetails(id,book,peice);

                if(booksList.isEmpty()){
                    booksList.add(bDetails);
                }
                else{
                    for(BooksDetails copy: booksList){
                        if(copy.getBook_name().equals(book)){
                            flag =1;
                            int OldPeice = copy.getTotal_pieces();
                            int TotalPeice = OldPeice+peice;
                            copy.setTotal_pieces(TotalPeice);
                            int old = copy.getAvailable_pieces();
                            int total = old+peice;
                            copy.setAvailable_pieces(total);

                            break;
                        }
                    }
                    if(flag ==0){
                        booksList.add(bDetails);
                    }    
                }
                System.out.println("***********CHOICE**********\n"+
                                   "  Case 1: Add book\n"+
                                   "  Case 2: Don't add book\n"+
                                   "***************************");
                System.out.println("Enter the choice:");
                choice = input.nextInt();                    
            }
            while(choice ==1); 
            
            System.out.println("The list of books is:");
            booksList.toString();

        }
        else{
            System.out.println("Can't add book. You are not valid user");
        }

        // close the Scanner
        input.close();
        
    }

    

}
