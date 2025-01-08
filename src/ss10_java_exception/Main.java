package ss10_java_exception;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println(1.0 / 0); // vì kiểu double không chính xác //lõỗi runtime

//        BigDecimal bigDecimal = new BigDecimal(1.0); // số thực
//        BigInteger bigInteger = new BigInteger("1"); // số nguyên

//        System.out.println(" aaaa ");

        //NullPointerException
        String string = null;
        string.length();

        //NumberFormatException
        String string1 = "223a";
        System.out.println(Integer.parseInt(string1));

        //ArrayIndexOutOfBoundsException
        int[] arr = {10, 20, 30};
        System.out.println(arr[-1]);  //0-2
    }
}
