package ss4_java_kethua.quan_ly_dien_thoai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<PhoneOld> oldPhones = new ArrayList<>();
    static ArrayList<PhoneNew> newPhones = new ArrayList<>();

    static {
        oldPhones.add(new PhoneOld("DTC001", "SamSung j7", 200000.0, 6, "SamSung", "95", "Đã sử dụng"));
        oldPhones.add(new PhoneOld("DTC002", "Iphone XX", 9000000.0, 3, "Apple", "90", "Đã sử dụng"));
        newPhones.add(new PhoneNew("DTM001", "Iphone XXS", 400000.0, 3, "Apple", 30));
        newPhones.add(new PhoneNew("DTM002", "Iphone XXX", 2220000.0, 9, "Apple", 50));
    }

    public static void main(String[] args) {
        int choose;
        while (true) {
            do {
                System.out.println("QUẢN LÝ ĐIỆN THOẠI");
                System.out.println("1. Xem danh sách điện thoại");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xoá");
                System.out.println("5. Sắp xếp theo giá");
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
                    default:
                        System.out.println("Lựa chọn của bạn không hợp lệ!");
                }
            } while (choose < 1 || choose > 5);
        }
    }

    private static void menuShowList() {
        int choose;
        while (true) {
            do {
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
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ " + (i + 1));
                            oldPhones.get(i).output();
                        }
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ " + (i + 1 + oldPhones.size()));
                            newPhones.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("==== Danh sách điện thoại cũ ====");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ " + (i + 1));
                            oldPhones.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("==== Danh sách điện thoại mới ====");
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ " + (i + 1));
                            newPhones.get(i).output();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }
            } while (choose < 0 || choose > 4);
        }
    }

    private static void menuAddNew() {
        int choose;
        while (true) {
            do {
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
                        oldPhones.add(oldPhone);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 2:
                        PhoneNew newPhone = new PhoneNew();
                        newPhone.input();
                        newPhone.setId(getIdNewPhone());
                        newPhones.add(newPhone);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    private static String getIdOldPhone() {
        if (oldPhones.size() == 0) {
            return "DTC001";
        }

        int max = Integer.parseInt(oldPhones.get(0).getId().substring(3));

        for (int i = 1; i < oldPhones.size(); i++) {
            int id = Integer.parseInt(oldPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        return String.format("DTC%03d", max + 1).replace(" ", "0");
    }

    private static String getIdNewPhone() {
        if (newPhones.size() == 0) {
            return "DTM001";
        }

        int max = Integer.parseInt(newPhones.get(0).getId().substring(3));

        for (int i = 1; i < newPhones.size(); i++) {
            int id = Integer.parseInt(newPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }

        return String.format("DTM%03d", max + 1).replace(" ", "0");
    }

    private static void update() {
        System.out.print("Nhập vào mã muốn cập nhật: ");
        String id = sc.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExistPhone = false;
            for (PhoneOld oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExistPhone = true;
                    oldPhone.input();
                    System.out.println("Cập nhật thành công!");
                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("Không tìm thấy mã muốn cập nhật!");
            }
        } else if (id.startsWith("DTM")) {
            boolean isExistPhone = false;
            for (PhoneNew newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    isExistPhone = true;
                    newPhone.input();
                    System.out.println("Cập nhật thành công!");
                    break;
                }
            }

            if (!isExistPhone) {
                System.out.println("Không tìm thấy mã muốn cập nhật!");
            }
        } else {
            System.out.println("Mã không hợp lệ!");
        }
    }

    private static void delete() {
        System.out.print("Nhập vào mã muốn xóa: ");
        String id = sc.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExistPhone = false;
            for (PhoneOld oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExistPhone = true;
                    System.out.printf("Bạn có xóa điện thoại có mã %s không?\n", id);
                    System.out.println("Chọn Yes để xác nhận xóa, No để hủy");
                    if ("yes".equalsIgnoreCase(sc.nextLine())) {
                        oldPhones.remove(oldPhone);
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
        } else if (id.startsWith("DTM")) {
            boolean isExistPhone = false;
            for (PhoneNew newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    isExistPhone = true;
                    System.out.printf("Bạn có xóa điện thoại có mã %s không?\n", id);
                    System.out.println("Chọn Yes để xác nhận xóa, No để hủy");
                    if ("yes".equalsIgnoreCase(sc.nextLine())) {
                        newPhones.remove(newPhone);
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
        } else {
            System.out.println("Mã không hợp lệ!");
        }
    }

    private static void menuSort() {
        int choose;
        while (true) {
            do {
                System.out.println("SẮP XẾP ĐIỆN THOẠI THEO GIÁ");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        Collections.sort(oldPhones, Comparator.comparing(Phone::getPrice));
                        Collections.sort(newPhones, Comparator.comparing(Phone::getPrice));
                        System.out.println("Sắp xếp tăng dần thành công!");
                        break;
                    case 2:
                        Collections.sort(oldPhones, Comparator.comparing(Phone::getPrice).reversed());
                        Collections.sort(newPhones, Comparator.comparing(Phone::getPrice).reversed());
                        System.out.println("Sắp xếp giảm dần thành công!");
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }
            } while (choose < 1 || choose > 3);
        }
    }
}
