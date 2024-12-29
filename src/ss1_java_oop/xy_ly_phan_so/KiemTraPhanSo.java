package ss1_java_oop.xy_ly_phan_so;

public class KiemTraPhanSo {
    public static void main(String[] args) {
        PhanSo phanSo1 = new PhanSo();
        PhanSo phanSo2 = new PhanSo();

        System.out.println("Nhập phân số thứ nhất:");
        phanSo1.nhap(); // Gọi phương thức nhập để nhập thông tin cho phân số thứ nhất

        System.out.println("Nhập phân số thứ hai:");
        phanSo2.nhap(); // Gọi phương thức nhập để nhập thông tin cho phân số thứ hai

        System.out.println("Phân số thứ nhất: ");
        phanSo1.xuat(); // Gọi phương thức xuất để hiển thị thông tin của phân số thứ nhất

        System.out.println("Phân số thứ hai: ");
        phanSo2.xuat();

        System.out.println("Tổng hai phân số: ");
        PhanSo tong = phanSo1.cong(phanSo2);
        tong.xuat();

        System.out.println("Hiệu hai phân số: ");
        PhanSo hieu = phanSo1.tru(phanSo2);
        hieu.xuat();

        System.out.println("Tích hai phân số: ");
        PhanSo tich = phanSo1.nhan(phanSo2);
        tich.xuat();

        System.out.println("Thương hai phân số: ");
        PhanSo thuong = phanSo1.chia(phanSo2);
        thuong.xuat();

        System.out.println("Phân số thứ nhất là phân số " + (phanSo1.LaPhanSoDuong() ? "dương" : "âm") + ".");

        System.out.println("Phân số thứ hai là phân số " + (phanSo2.LaPhanSoDuong() ? "dương" : "âm") + ".");

        System.out.println("Phân số thứ nhất " + (phanSo1.LaPhanSoKhong() ? "bằng không" : "không bằng không") + ".");

        System.out.println("Phân số thứ hai " + (phanSo2.LaPhanSoKhong() ? "bằng không" : "không bằng không") + ".");
    }
}

