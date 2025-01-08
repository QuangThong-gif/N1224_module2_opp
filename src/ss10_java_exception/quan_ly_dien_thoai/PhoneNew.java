package ss10_java_exception.quan_ly_dien_thoai;

import ss10_java_exception.quan_ly_dien_thoai.validation.PhoneValidation;

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

    @Override
    public void input() {
        super.input();
        this.soLuong = PhoneValidation.inputQuantity("Số lượng");
    }

    public void output() {
        super.output();
        System.out.println("Số lượng: " + soLuong);
    }
}
