package Details;

import java.util.ArrayList;

public class Student_Details {
    // define the properties
        private int studentId =0;
        private String Email =null;
        private String passward;
        private String name =null;
        private int No_of_booked_issued =0;
        private ArrayList<Integer> bookList = null;
    
        // define the constructor
        public Student_Details() {
        }
    
        public Student_Details(String Email,String name,String passward) {
            this.studentId++;
            this.Email = Email;
            this.name = name;
            this.passward = passward;
    
        }
    
        // define the getter and setter methord
    
    public  int getStudentId() {
            return this.studentId;
    }

    public  void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo_of_booked_issued() {
        return this.No_of_booked_issued;
    }
    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassward() {
        return this.passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public void setNo_of_booked_issued(int No_of_booked_issued) {
        this.No_of_booked_issued = No_of_booked_issued;
    }

    public ArrayList<Integer> getBookList() {
        return this.bookList;
    }

    public void setBookList(ArrayList<Integer> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "{" +
            " studentId='" + getStudentId() + "'" +
            ", Email='" + getEmail() + "'" +
            ", name='" + getName() + "'" +
            ", No_of_booked_issued='" + getNo_of_booked_issued() + "'" +
            ", bookList='" + getBookList() + "'" +
            "}";
    }
    

    
}    


    


    


    