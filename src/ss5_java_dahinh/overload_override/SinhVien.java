package ss5_java_dahinh.overload_override;

public class SinhVien extends HocVien {
    //overriding
    public void a() {
        System.out.println("a con");
    }
    //overriding
    public void b() {
        System.out.println("b con");
    }
    //khong co
    public void c() {
        System.out.println("c con");
    }
    //overrding
//    protected void d() {
//        System.out.println("d con");
//    }
    //khong co
//    public int e() {
//        System.out.println("c con");
//        return 1;
//    }
    //overriding
//    public Dog f(){
//        System.out.println("f con");
//        return null;
//    }
    //overloading
    public void g(int i) {
    }
    //khong co
    public static void h(){
    }
    //overloading
    public void i(double c, int b) {
        System.out.println(c + " " + b);
    }
    //khong co
    public void j(double d, int c) {
        System.out.println(d + "" + c);
    }
}
