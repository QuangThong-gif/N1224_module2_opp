package ss1_java_oop.xy_ly_toa_do;

public class KiemTraToaDo {
    public static void main(String[] args) {
        ToaDo point1 = new ToaDo();
        ToaDo point2 = new ToaDo();

        System.out.println("Nhập tọa độ của điểm thứ nhất:");
        point1.input();

        System.out.println("Nhập tọa độ của điểm thứ hai:");
        point2.input();

        double distance = point1.distanceTo(point2);

        System.out.println("Khoảng cách giữa hai điểm là: " + distance);
    }
}

