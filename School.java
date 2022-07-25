import java.util.ArrayList;

public class School {
    private String name;
    private int yearBuilt;
    //May be unclear, but what I mean by "education level" is primary, secondary, etc
    private String educationLevel;

    School(){
        name = "Default";
        yearBuilt = 0;
        educationLevel = "unknown";
    }
    School(String name, int yearBuilt, String educationLevel){
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.educationLevel = educationLevel;

    }

    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    //adds new teacher with default package
    public void addTeacher(int amount){
        for(int i = 0; i<amount;i++){
            teachers.add(new Teacher());
        }
    }
    //adds new student with default package
    public void addStudent(int amount){
        for(int i =0; i<amount;i++){
            students.add(new Student());
        }
    }
    //deletes teacher at whatever position the user inputs
    public void deleteTeacher(int pos,int amount) {
        for (int i = 0; i < amount; i++) {
            teachers.remove(pos);
        }
    }
    //deletes student at whatever position the user inputs
    public void deleteStudent(int pos,int amount){
        for (int i = 0; i < amount; i++) {
            students.remove(pos);
        }
    }
    //prints out arraylist teachers
    public void showTeachers(){
        System.out.println(teachers);
    }
    //prints out arraylist students
    public void showStudents(){
        System.out.println(students);
    }


    //getters and setters below

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String geteducationLevel() {
        return educationLevel;
    }
}

