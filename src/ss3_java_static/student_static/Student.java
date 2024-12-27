package ss3_java_static.student_static;

public class Student {
    private int id;
    private String name;
    private double score;
    private static int studentCount = 0;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        studentCount++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if(score < 0 || score > 10){
            this.score = score;
        }else {
            System.out.println("Điểm trong khoảng từ 0 - 10");
        }
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }
}
