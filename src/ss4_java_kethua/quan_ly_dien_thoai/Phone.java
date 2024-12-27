package ss4_java_kethua.quan_ly_dien_thoai;

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
