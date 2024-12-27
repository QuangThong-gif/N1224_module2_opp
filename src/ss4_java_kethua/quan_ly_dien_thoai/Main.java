package ss4_java_kethua.quan_ly_dien_thoai;

public class Main {
    public static void main(String[] args) {
        PhoneNew pn = new PhoneNew();
        PhoneOld po = new PhoneOld();

        System.out.println("Điện thoại new");
        pn.input();
        pn.output();

        System.out.println("Điện thoại old");
        po.input();
        po.output();
    }
}
