package ss2_java_constructor.thoigian_constructor;

public class ThoiGian {
    private int gio;
    private int phut;
    private int giay;

    public ThoiGian() {
        this.gio = 0;
        this.phut = 0;
        this.giay = 0;
    }

    public ThoiGian(int gio){
        this.gio = gio;
        this.phut = 0;
        this.giay = 0;
    }

    public ThoiGian(int gio, int phut){
        this.gio = gio;
        this.phut = phut;
        this.giay = 0;
    }

    public ThoiGian(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public ThoiGian(ThoiGian thoiGian){
        this.gio = thoiGian.gio;
        this.phut = thoiGian.phut;
        this.giay = thoiGian.giay;
    }

    public void output(){
        System.out.printf("%02d : %02d : %02d\n",gio,phut,giay);
    }
}
