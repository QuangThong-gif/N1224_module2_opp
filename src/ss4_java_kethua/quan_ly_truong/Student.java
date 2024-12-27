package ss4_java_kethua.quan_ly_truong;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student(){
        super();
    }
    public Student(int id, String name, double score) {
        super(id,name);
        this.score = score;
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.print("Nhập điểm : ");
        score = Double.parseDouble(input.nextLine());
    }

    public void output(){
        super.output();
        System.out.println("Điểm: " + this.score);
    }
}
