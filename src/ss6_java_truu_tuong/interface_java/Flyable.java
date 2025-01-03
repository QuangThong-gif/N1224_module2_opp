package ss6_java_truu_tuong.interface_java;

public interface Flyable {
    int MAX = 100;
    void fly();

    default void fly2(){
        System.out.println("Có body - default");
    }

    static void fly3(){
        System.out.println("Có body  - static");
    }
}
