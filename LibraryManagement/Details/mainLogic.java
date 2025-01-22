package Details;

import java.util.ArrayList;
import java.util.Scanner;

public class mainLogic {


    static ArrayList<Student_Details> StudentList;
        
        public static void main12() {
    
            // define the ArrayList()
            StudentList = new ArrayList<>();
    
            // calling the Scanner
            Scanner input =  new Scanner(System.in);
            // define the properties
            int choice;
            do{
                System.out.println("************CHOICE***********\n"+
                                   "   Case 1: login in\n"+
                                   "   case 2: sign up\n"+
                                   "*****************************");
                System.out.println("Enter the choice:");
                choice = input.nextInt(); 
                
                if(choice ==1){
                    int flag =0;
                    System.out.println("Enter the student Email/id:");
                    String id = input.next();
                    System.out.println("Enter the password:");
                    String password = input.next();
                    for(Student_Details stud: StudentList){
                        if(stud.getEmail().equals(id) ||stud.getStudentId() == Integer.parseInt(id) && stud.getPassward().equals(password)){
                            flag =1;
                            loginSuccess lSuccess = new loginSuccess();

                            // define the do while statement
                            do{
                                System.out.println("**********CHOICE**********\n"+
                                                   "    Case 1: SearchBook\n"+
                                                   "    Case 2: ReturnBook\n"+
                                                   "    Case 3: BookIssue\n"+
                                                   "*************************");
                                System.out.println("Enter the choice:");
                                choice = input.nextInt();

                                // define the switch statement
                                switch(choice){
                                    case 1:
                                        lSuccess.bookSearch();
                                        break;
                                    case 2:
                                        lSuccess.returnBook();
                                        break;
                                    case 3:
                                        lSuccess.bookissue();
                                        break;
                                    default:
                                        System.out.println("Invalid choice");            
                                }
                            }
                            while(choice>0 && choice<4);
                        }
                    }
                    if(flag ==0){
                        System.out.println("Invalid Student password or Id/Email");
                    }
    
    
                }
                else{
    
                    System.out.println("Enter the name of student:");
                    String name = input.next();
                    System.out.println("Enter the Email:");
                    String Email = input.next();
                    System.out.println("Enter the Password:");
                    String password = input.next();
    
                    // calling the student_detail Object
                    Student_Details student_Details = new Student_Details(Email,name,password);
                    StudentList.add(student_Details);
                    System.out.println("************WELCOME*************\n"+
                                       " You have enrolled Sucessfully\n"+
                                       "********************************");                

            }
        }
        while(choice!=3 && choice>0);

        // close the Scanner
        input.close();
    }
}
