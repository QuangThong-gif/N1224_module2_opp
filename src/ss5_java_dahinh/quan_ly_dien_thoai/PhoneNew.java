package ss5_java_dahinh.quan_ly_dien_thoai;

import java.util.Scanner;

public class PhoneNew extends Phone {
    private int soLuong;

    public PhoneNew(){
        super();
    }

    public PhoneNew(int soLuong) {
        this.soLuong = soLuong;
    }

    public PhoneNew(String id, String name, double price, int thoiGian, String hang, int soLuong) {
        super(id, name, price, thoiGian, hang);
        this.soLuong = soLuong;
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        super.input();

        System.out.print("Nhập số lượng: " + soLuong);
        soLuong = Integer.parseInt(input.nextLine());
    }

    public void output(){
        super.output();
        System.out.println("Số lượng: " + soLuong);
    }
}

