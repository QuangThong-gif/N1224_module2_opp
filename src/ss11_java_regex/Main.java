package ss11_java_regex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dấu ngoặc vuông [...]

        //Dấu ngơac (..)
        System.out.println("d".matches("[a-zA-Z0-9]"));

        //Sử dụng * : 0 hoặc nhiều lần
        System.out.println("".matches("a[a-zA-Z0-9]*"));
        System.out.println("a".matches("a[a-zA-Z0-9]*"));
        System.out.println("aD".matches("a[a-zA-Z0-9]*"));

        //Sự dụng +: 1 hoặc nhiều lần
        System.out.println("".matches("a[a-zA-Z0-9]+"));
        System.out.println("a".matches("a[a-zA-Z0-9]+"));
        System.out.println("aD".matches("a[a-zA-Z0-9]+"));

        //Sủ dụng ?: 0 hoặc 1 lan
        System.out.println("".matches("a[a-zA-Z0-9]?"));
        System.out.println("a".matches("a[a-zA-Z0-9]?"));
        System.out.println("aD".matches("a[a-zA-Z0-9]?"));

        //Sử dụng kí tự ngoặc nhọn{}
        //{n}: Có n kí tự
        System.out.println("".matches("[a-zA-Z0-9]{5}"));
        //{n,m}
        System.out.println("".matches("[a-zA-Z0-9]{5,7}"));
        //{n,}
        System.out.println("".matches("[a-zA-Z0-9]{5,}"));

        //Dien thoai cu XXX
        //Voi xxx la so
        System.out.println("Dien thoai cu");
//      Scanner sc = new Scanner(System.in);
//      String input;
//
//      System.out.print("Vui lòng nhập điện thoại cũ với mã DTCXXXXX (với XXX là số): ");
//      input = sc.nextLine();
//
//      System.out.println(input.matches("DTC[0-9]{3}"));

//        System.out.println("".matches("(0|\\(\\+84\\)3[2-9]\\d{7})"));

        System.out.println("0xxxxxxxxx".matches("^(0|\\(\\+84\\))3[2-9]\\d{7}$"));

        //b
        System.out.println("abcemail@gmail.com".matches("^[A-Za-z0-9_]{6,32}@[A-Za-z0-9]{2,12}\\.[A-Za-z0-9]{2,12}$"));

        //c
        System.out.println("username".matches("^[A-Za-z0-9._]{6,32}$"));

        //d
        System.out.println("Password1".matches("^[A-Z][A-Za-z0-9!@#$%^&*().]{5,31}$"));
    }
}
