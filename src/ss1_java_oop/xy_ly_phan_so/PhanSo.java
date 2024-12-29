package ss1_java_oop.xy_ly_phan_so;
import java.util.Scanner;

public class PhanSo {
    int tuSo;
    int mauSo;

    void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tử số: ");
        tuSo = scanner.nextInt();

        do {
            System.out.print("Nhập mẫu số (khác 0): ");
            mauSo = scanner.nextInt();
        } while (mauSo == 0);
    }

    void rutGon() {
        int ucln = uocChungLonNhat(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;

        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    int uocChungLonNhat(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        a = Math.abs(a);

        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;
    }

    void xuat() {
        rutGon();
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + " / " + mauSo);
        }
    }

    PhanSo cong(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo + phanSoKhac.tuSo * this.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    PhanSo tru(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo - phanSoKhac.tuSo * this.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    PhanSo nhan(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.tuSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    PhanSo chia(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.tuSo;
        return ketQua;
    }

    boolean LaPhanSoDuong() {
        return tuSo * mauSo > 0 || tuSo == 0;
    }

    boolean LaPhanSoKhong() {
        return tuSo == 0;
    }
}

