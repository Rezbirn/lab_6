import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentDAO studentDAO = new StudentDAO();

        Student newStudent = new Student("Yevhen", "Hafych", "IPZ-21");
        Student newStudent2 = new Student("Test1", "Test2", "IPZ-21");

        studentDAO.addStudent(newStudent);
        studentDAO.addStudent(newStudent2);

        List<Student> allStudents = studentDAO.getAllStudents();
        System.out.println("All Students: ");
        for (Student student: allStudents){
            System.out.println(student.showInfo());
        }

        int idNewStudent = -1;
        int idNewStudent2 = -1;
        for (Student student: allStudents){
            if(student.getFirstName().equals("Yevhen")){
                idNewStudent = student.getId();
            }
            else {
                idNewStudent2 = student.getId();
            }
        }

        Student updatedStudent = new Student(idNewStudent, "Yevhen", "Hafych", "IPZ-31");
        studentDAO.updateStudent(updatedStudent);

        Student retrievedStudent = studentDAO.getStudentById(idNewStudent);
        System.out.println("Retrieved Student: " + retrievedStudent.showInfo());



        System.in.read();

        studentDAO.deleteStudent(idNewStudent2);

        studentDAO.closeConnection();
    }
}