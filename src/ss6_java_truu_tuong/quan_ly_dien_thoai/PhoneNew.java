package ss6_java_truu_tuong.quan_ly_dien_thoai;

import java.util.Scanner;

public class PhoneNew extends Phone implements Discountable {
    private int soLuong;

    public PhoneNew() {
        super();
    }

    public PhoneNew(int soLuong) {
        this.soLuong = soLuong;
    }

    public PhoneNew(String id, String name, double price, int thoiGian, String hang, int soLuong) {
        super(id, name, price, thoiGian, hang);
        this.soLuong = soLuong;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * soLuong;
    }

    @Override
    public void applyDiscount(double percentDiscount) {
        double discountAmount = getPrice() * (1 - percentDiscount / 100.0);
        setPrice(discountAmount);
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.print("Nhập số lượng: ");
        soLuong = Integer.parseInt(input.nextLine());
    }

    public void output() {
        super.output();
        System.out.println("Số lượng: " + soLuong);
    }
}
