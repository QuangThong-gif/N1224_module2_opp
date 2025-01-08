package ss9_set_map.set;

import java.util.HashSet;

public class Exercise1C {
    // tìm các phần tử chung của 2 mảng
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Tạo hai Set để lưu trữ các phần tử từ hai mảng
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        HashSet<Integer> commonElements = new HashSet<>(set1);

        commonElements.retainAll(set2);

        System.out.println("Các phần tử chung giữa hai mảng là:");
        for (int element : commonElements) {
            System.out.println(element);
        }
    }
}
