package ss10_java_exception.quan_ly_dien_thoai;

import ss10_java_exception.quan_ly_dien_thoai.validation.PhoneValidation;

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
        super.input();
        this.tinhTrangPin = String.valueOf(PhoneValidation.inputBatteryPercentage("Tình trạng pin (%)"));
        this.moTa = PhoneValidation.inputDescription("Mô tả thêm");
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
