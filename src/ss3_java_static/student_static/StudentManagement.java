package ss3_java_static.student_static;

public class StudentManagement {
    public static void main(String[] args) {
        Student student = new Student(1,"Nguyễn Văn A",9.0);
        Student student2 = new Student(2,"Nguyễn Văn B",6.0);
        Student student3 = new Student(3,"Nguyễn Văn C",7.0);

        System.out.println("Số lượng sinh viên: " + Student.getStudentCount());
    }
}
