package ss10_java_exception.quan_ly_dien_thoai;

import ss10_java_exception.quan_ly_dien_thoai.validation.PhoneValidation;

import java.util.Scanner;

public abstract class Phone implements Comparable<Phone> {
    private String id;
    private String name;
    private double price;
    private int thoiGian;
    private String hang;

    public Phone() {

    }

    public Phone(String id, String name, double price, int thoiGian, String hang) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.thoiGian = thoiGian;
        this.hang = hang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    //thay doi
    public void input() {
        this.name = PhoneValidation.inputName("Tên điện thoại");
        this.price = PhoneValidation.inputPrice("Giá bán");
        this.thoiGian = PhoneValidation.inputWarranty("Thời gian bảo hành");
        this.hang = PhoneValidation.inputManufacturer("Hãng sản xuất");
    }


    public void output(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Thoi Gian: " + thoiGian);
        System.out.println("Hang: " + hang);
    }

    public abstract double calculateTotalPrice();

    @Override
    public int compareTo(Phone o) {
        return Double.compare(this.getPrice(), o.price);
    }
}
