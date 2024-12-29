package ss2_java_constructor.student;

public class Student {
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().equals("")) {
            System.out.println("Lỗi: Tên bắt buộc nhập.");
        } else {
            this.name = name;
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        // Kiểm tra xem điểm số nằm trong khoảng từ 0 đến 10
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Lỗi: Điểm số phải nằm trong khoảng từ 0 đến 10.");
        }
    }
}

