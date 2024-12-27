package ss3_java_static.mathutil_static;

public class MathUtilManagement {
    public static void main(String[] args) {
        int n = 6;
        int n2 = 10;

        int tong = MathUtil.sum(n,n2);
        int hieu = MathUtil.difference(n,n2);
        int tich = MathUtil.product(n,n2);
        int thuong = MathUtil.quotient(n,n2);

        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);
        System.out.println("Thương = " + thuong);
    }
}
