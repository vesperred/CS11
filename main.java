public class main {
    public static void main(String[] args) {
     School Uhill = new School("Uhill",2013,"Secondary");
     Uhill.addStudent(10);
     Uhill.addTeacher(3);
     Uhill.showTeachers();
     Uhill.showStudents();
     Uhill.deleteStudent(1,2);
     Uhill.deleteTeacher(1,1);
     Uhill.showTeachers();
     Uhill.showStudents();
    }
}
