package ss3_java_static;

public class Main2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teacher teacher2 = new Teacher();

        teacher.schoolName = "Su Pham";

        System.out.println(teacher.schoolName);
        System.out.println(teacher2.schoolName);
    }
}
