package ss9_set_map.comparable_comparator;

import java.util.Scanner;

public class PhoneOld extends Phone implements Discountable {
    private String tinhTrangPin;
    private String moTa;

    public PhoneOld() {
        super();
    }

    public PhoneOld(String tinhTrangPin, String moTa) {
        this.tinhTrangPin = tinhTrangPin;
        this.moTa = moTa;
    }

    public PhoneOld(String id, String name, double price, int thoiGian, String hang, String tinhTrangPin, String moTa) {
        super(id, name, price, thoiGian, hang);
        this.tinhTrangPin = tinhTrangPin;
        this.moTa = moTa;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input();

        System.out.print("Nhập tình trạng pin: ");
        tinhTrangPin = input.nextLine();

        System.out.print("Nhập mô tả: ");
        moTa = input.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Tình trạng pin: " + tinhTrangPin);
        System.out.println("Mô tả: " + moTa);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice();
    }

    @Override
    public void applyDiscount(double percentDiscount) {
        double discountedPrice = getPrice() * (1 - percentDiscount / 100.0);
        setPrice(discountedPrice);
    }
    public String getTinhTrangPin() {
        return tinhTrangPin;
    }

    public void setTinhTrangPin(String tinhTrangPin) {
        this.tinhTrangPin = tinhTrangPin;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}


