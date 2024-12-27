package ss4_java_kethua.quan_ly_truong;

import java.util.Scanner;

public class Teacher extends Person {
    private int age;

    public Teacher(){
        super();
    }
    public Teacher(int id, String name, int age) {
        super(id,name);
        this.age = age;
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.print("Nhập tuổi : ");
        age = Integer.parseInt(input.nextLine());
    }

    public void output(){
        super.output();
        System.out.println("Tuổi: " + this.age);
    }
}
