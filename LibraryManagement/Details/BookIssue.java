package Details;


public class BookIssue {
    // define the properties
    private int bookId;
    private int stdId;

    // define the consructor

    public BookIssue() {}

    public BookIssue(int bookId, int stdId) {
        this.bookId = bookId;
        this.stdId = stdId;
    }  
    
    // define the getter and setter

    public int getBookId() {
        return this.bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStdId() {
        return this.stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

        
    
}
