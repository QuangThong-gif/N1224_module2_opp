package ss2_java_constructor.thoigian_constructor;

public class KiemTraThoiGian {
    public static void main(String[] args) {
        ThoiGian a = new ThoiGian();
        a.output();

        ThoiGian b = new ThoiGian(12);
        b.output();

        ThoiGian c = new ThoiGian(12,30);
        c.output();

        ThoiGian d = new ThoiGian(12,30,59);
        d.output();

        ThoiGian e = new ThoiGian(d);
        e.output();
    }
}
