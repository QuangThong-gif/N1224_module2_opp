package ss6_java_truu_tuong.quan_ly_dien_thoai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Phone> phones = new ArrayList<>();

    static {
        phones.add(new PhoneOld("DTC001", "SamSung J7", 200000.0, 6, "SamSung", "95", "Tốt"));
        phones.add(new PhoneOld("DTC002", "Iphone XX", 9000000.0, 3, "Apple", "90", "Tốt"));
        phones.add(new PhoneNew("DTM001", "Iphone XXS", 400000.0, 3, "Apple", 30));
        phones.add(new PhoneNew("DTM002", "Iphone XXX", 2220000.0, 9, "Apple", 50));
    }

    public static void main(String[] args) {
        int choose;
        while (true) {
            do {
                System.out.println("QUẢN LÝ ĐIỆN THOẠI");
                System.out.println("1. Xem danh sách điện thoại");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp theo giá");
                System.out.println("6. Tính tổng tiền");
                System.out.println("7. Giảm giá cho điện thoại cũ");
                System.out.println("8. Thoát");
                System.out.print("Quý khách xin vui lòng lựa chọn: ");

                choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        menuShowList();
                        break;
                    case 2:
                        menuAddNew();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        menuSort();
                        break;
                    case 6:
                        System.out.println("Tổng giá của tất cả điện thoại: " + calculateTotalPriceInStore());
                        break;
                    case 7:
                        System.out.println("Nhập vào phần trăm muốn giảm giá: ");
                        double precentDiscount = Double.parseDouble(sc.nextLine());
                        applyDiscountToOldPhones(precentDiscount);
                        System.out.println("Đã giảm giá thành công !");
                        break;
                    case 8:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }
            }while (choose < 1 || choose > 8);
        }
    }

    private static void menuShowList() {
        int choose;
        while (true) {
            System.out.println("DANH SÁCH ĐIỆN THOẠI:");
            System.out.println("1. Xem tất cả");
            System.out.println("2. Xem điện thoại cũ");
            System.out.println("3. Xem điện thoại mới");
            System.out.println("4. Trở về menu chính");

            System.out.print("Mời bạn lựa chọn: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("==== Danh sách tất cả điện thoại ====");
                    for (int i = 0; i < phones.size(); i++) {
                        System.out.println("Thông tin điện thoại thứ " + (i + 1));
                        phones.get(i).output();
                    }
                    break;
                case 2:
                    System.out.println("==== Danh sách điện thoại cũ ====");
                    for (Phone phone : getOldPhones()) {
                        phone.output();
                    }
                    break;
                case 3:
                    System.out.println("==== Danh sách điện thoại mới ====");
                    for (Phone phone : getNewPhones()) {
                        phone.output();
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
            }
        }
    }

    private static void menuAddNew() {
        int choose;
        while (true) {
            System.out.println("THÊM MỚI ĐIỆN THOẠI:");
            System.out.println("1. Thêm mới điện thoại cũ");
            System.out.println("2. Thêm mới điện thoại mới");
            System.out.println("3. Trở về menu chính");

            System.out.print("Mời bạn lựa chọn: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    PhoneOld oldPhone = new PhoneOld();
                    oldPhone.input();
                    oldPhone.setId(getIdOldPhone());
                    phones.add(oldPhone);
                    System.out.println("Thêm mới thành công");
                    break;
                case 2:
                    PhoneNew newPhone = new PhoneNew();
                    newPhone.input();
                    newPhone.setId(getIdNewPhone());
                    phones.add(newPhone);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
            }
        }
    }

    private static String getIdOldPhone() {
        return "DTC" + (getOldPhones().size() + 1);
    }

    private static String getIdNewPhone() {
        return "DTM" + (getNewPhones().size() + 1);
    }

    private static ArrayList<PhoneOld> getOldPhones() {
        ArrayList<PhoneOld> oldPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof PhoneOld) {
                oldPhones.add((PhoneOld) phone);
            }
        }
        return oldPhones;
    }

    private static ArrayList<PhoneNew> getNewPhones() {
        ArrayList<PhoneNew> newPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof PhoneNew) {
                newPhones.add((PhoneNew) phone);
            }
        }
        return newPhones;
    }

    private static void update() {
        System.out.print("Nhập vào mã muốn cập nhật: ");
        String id = sc.nextLine();

        boolean isExistPhone = false;
        for (Phone phone : phones) {
            if (phone.getId().equals(id)) {
                isExistPhone = true;
                phone.input();
                System.out.println("Cập nhật thành công!");
                break;
            }
        }

        if (!isExistPhone) {
            System.out.println("Không tìm thấy mã muốn cập nhật!");
        }
    }

    private static void delete() {
        System.out.print("Nhập vào mã muốn xóa: ");
        String id = sc.nextLine();

        boolean isExistPhone = false;
        for (Phone phone : phones) {
            if (phone.getId().equals(id)) {
                isExistPhone = true;
                System.out.printf("Bạn có xóa điện thoại có mã %s không? (Yes/No): ", id);
                if ("yes".equalsIgnoreCase(sc.nextLine())) {
                    phones.remove(phone);
                    System.out.println("Xóa thành công!");
                } else {
                    System.out.println("Đã hủy việc xóa!");
                }
                break;
            }
        }

        if (!isExistPhone) {
            System.out.println("Không tìm thấy mã muốn xóa!");
        }
    }

    private static void menuSort() {
        int choose;
        while (true) {
            System.out.println("SắP XẾP ĐIỆN THOẠI THEO GIÁ");
            System.out.println("1. Tăng dần");
            System.out.println("2. Giảm dần");
            System.out.println("3. Trở về menu chính");

            System.out.print("Mời bạn lựa chọn: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    phones.sort(Comparator.comparing(Phone::getPrice));
                    System.out.println("Sắp xếp tăng dần thành công!");
                    break;
                case 2:
                    phones.sort(Comparator.comparing(Phone::getPrice).reversed());
                    System.out.println("Sắp xếp giảm dần thành công!");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
            }
        }
    }

    private static double calculateTotalPriceInStore() {
        double total = 0.0;
        for (Phone phone : phones) {
            total += phone.calculateTotalPrice();
        }
        return total;
    }

    // Áp dụng giảm giá cho các điện thoại cũ
    public static void applyDiscountToOldPhones(double percentDiscount) {
        for (Phone phone : phones) {
            if (phone instanceof PhoneOld) {
                ((PhoneOld) phone).applyDiscount(percentDiscount);
            }
        }
    }
}
