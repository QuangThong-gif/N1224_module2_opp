package ss5_java_dahinh.quan_ly_dien_thoai;

import java.util.Collection;
import java.util.Scanner;

public class Phone {
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

    public void input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập ID: ");
        id = input.nextLine();

        System.out.print("Nhập tên: ");
        name = input.nextLine();

        System.out.print("Nhập giá bán: ");
        price = Double.parseDouble(input.nextLine());

        System.out.print("Nhập thời gian bảo hành: ");
        thoiGian = Integer.parseInt(input.nextLine());

        System.out.print("Nhập hãng sản xuất: ");
        hang = input.nextLine();
    }

    public void output(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Thoi Gian: " + thoiGian);
        System.out.println("Hang: " + hang);
    }
}

