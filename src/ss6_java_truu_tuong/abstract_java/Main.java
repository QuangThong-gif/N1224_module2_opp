package ss6_java_truu_tuong.abstract_java;

public class Main {
    public static void main(String[] args) {
        Animal_TruuTuong animal = new Animal_TruuTuong() {
            @Override
            public void tiengKeu() {
                System.out.println("tiengKeu");
            }
        };
        final int x = 100;

//        Object str = "Hello World";
//
//        animal.toString();
//        animal.equals(null);
    }
}