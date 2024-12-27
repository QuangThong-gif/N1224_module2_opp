package ss4_java_kethua.quan_ly_dien_thoai;

import java.util.Scanner;

public class PhoneOld extends Phone{
    private String tinhTrangPin;
    private String moTa;

    public PhoneOld(){
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

    public void input(){
        Scanner input = new Scanner(System.in);
        super.input();

        System.out.print("Nhập tình trạng pin: ");
        tinhTrangPin = input.nextLine();

        System.out.print("Nhập mô tả: ");
        moTa = input.nextLine();
    }

    public void output(){
        super.output();
        System.out.println("Tình trạng pin: " + tinhTrangPin);
        System.out.println("Mô tả: " + moTa);
    }
}
