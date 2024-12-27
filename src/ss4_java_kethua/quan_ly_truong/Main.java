package ss4_java_kethua.quan_ly_truong;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.input();
        teacher.input();

        student.output();
        teacher.output();
    }
}
