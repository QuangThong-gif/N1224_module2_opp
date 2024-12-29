package ss2_java_constructor.student;

public class StudentManagement {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyễn Văn Hoài", 8.5);

        System.out.println("Thông tin ban đầu:");
        System.out.println("ID: " + student1.getId());
        System.out.println("Tên: " + student1.getName());
        System.out.println("Điểm số: " + student1.getScore());

        student1.setName("Nguyễn Khoa Hoài"); // Tên hợp lệ
        student1.setScore(9.0); // Điểm số hợp lệ

        // Kiểm tra thông tin sau khi cập nhật
        System.out.println("Thông tin sau khi cập nhật:");
        System.out.println("ID: " + student1.getId());
        System.out.println("Tên: " + student1.getName());
        System.out.println("Điểm số: " + student1.getScore());

        student1.setName(""); // Tên không hợp lệ
        student1.setScore(11.5); // Điểm số không hợp lệ
    }
}

