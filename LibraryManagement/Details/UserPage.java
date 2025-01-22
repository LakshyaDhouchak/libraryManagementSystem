package Details;

import java.util.Scanner;

public class UserPage {
    public static void main(String[] args) {
        // calling the Scanner 
        Scanner input = new Scanner(System.in);

        Student_Details sDetails = new Student_Details(1,"lakshya@gmail.com","123","Lakshya",0);
        mainLogic.StudentList.add(sDetails);

        BooksDetails b1 = new BooksDetails(1,"Maths",5,5);
        BooksDetails b2 = new BooksDetails(2,"English",5,5);
        BooksDetails b3 = new BooksDetails(3,"Hindi",5,5);
        BooksDetails.booksList.add(b1);
        BooksDetails.booksList.add(b2);
        BooksDetails.booksList.add(b3);
        
        mainLogic.main12();

        // close the Scanner
        input.close();
        
        
    }
    
}
