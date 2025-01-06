package ss7_dsa_list.my_arraylist;

public class MyArrayList {
    private int capacity;
    private int[] arr;
    private int size;
    private int[] emptyArray = {};

    public int size() {
        return size;
    }

    public MyArrayList() {
        arr = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
    }

    // a. Thêm phần tử element vào cuối.
    public void add(int element) {
        if (arr == emptyArray) {
            this.capacity = 10;
            this.arr = new int[this.capacity];
        }
        if (size == capacity) {
            this.capacity *= 1.5; // 1
            if (size == capacity) { // Tránh trường hợp capacity = 0 hoặc 1
                capacity++;
            }
        }

        int[] brr = new int[this.capacity];

        for (int i = 0; i < size; i++) {
            brr[i] = arr[i];
        }

        arr = brr;

        arr[size] = element;
        size++;
    }

    // b. Trả về thông tin đối tượng
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(arr[i]).append("\t");
        }
        return stringBuilder.toString();
    }

    // c. Thêm phần tử vào vị trí index
    public void add(int index, int element) {
        // Kiểm tra index có hợp lệ
        if (index < 0 || index > size) {
            System.out.println("Index ngoài phạm vi!");
            return;
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }
        }

        int[] brr = new int[this.capacity];

        for (int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }

        brr[index] = element;

        for (int i = index; i < size; i++) {
            brr[i + 1] = arr[i];
        }

        arr = brr;

        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;

        size++;
    }

    // d. Thay thế phần tử tại vị trí index
    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoài phạm vi!");
            return;
        }
        arr[index] = element;
    }

    // e. Trả về phần tử tại index
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoài phạm vi!");
            return null;
        }
        return arr[index];
    }

    // f. Lấy vị trí index phần tử đầu tiên tìm thấy
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoài phạm vi!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // i. Xóa tất cả phần tử element
    public void removeElement(int element) {
        int newIndex = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] != element) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }

        size = newIndex;
    }
}
