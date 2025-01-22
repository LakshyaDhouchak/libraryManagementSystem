package Details;



public class Student_Details {
    // define the properties
        private int studentId =0;
        private String Email =null;
        private String passward;
        private String name =null;
        private int No_of_booked_issued =0;
    
        // define the constructor
        public Student_Details() {
        }
    
        public Student_Details(String Email,String name,String passward) {
            this.studentId++;
            this.Email = Email;
            this.name = name;
            this.passward = passward;
    
        }


    public Student_Details(int studentId, String Email, String passward, String name, int No_of_booked_issued) {
        this.studentId = studentId;
        this.Email = Email;
        this.passward = passward;
        this.name = name;
        this.No_of_booked_issued = No_of_booked_issued;
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



    

    
}    


    


    


    