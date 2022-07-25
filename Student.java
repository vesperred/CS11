public class Student {


    private int idNumber;
    Student(){
        firstName = "unknown";
        lastName = "unknown";
        grade = 0;
        idNumber = 1;
    }
    Student(String firstName, String lastName,int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.idNumber = studentNumber;
        //Makes student number of each student unique
        studentNumber++;

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private String firstName;
    private  String lastName;
    private  int grade;
    static int studentNumber;

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + " " + "Grade: " + this.grade;
    }
}
