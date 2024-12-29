package ss1_java_oop.xy_ly_toa_do;
import java.util.Scanner;

class ToaDo{
    double x;
    double y;

    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tọa độ X: ");
        x = scanner.nextDouble();

        System.out.print("Nhập tọa độ Y: ");
        y = scanner.nextDouble();
    }

    double distanceTo(ToaDo other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }
}

