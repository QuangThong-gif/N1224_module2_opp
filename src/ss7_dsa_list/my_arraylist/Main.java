package ss7_dsa_list.my_arraylist;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        // a. Thêm phần tử element vào cuối.
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(30);
        myArrayList.add(30);

        // b. Trả về thông tin đối tượng
        System.out.println("b. Danh sách ban đầu: " + myArrayList.toString());

        // c. Thêm phần tử vào vị trí index
        myArrayList.add(2, 25);
        System.out.println("c. Danh sách sau khi thêm 25 vào vị trí 2: " + myArrayList.toString());

        // d. Thay thế phần tử tại vị trí index
        myArrayList.set(3, 35);
        System.out.println("d. Danh sách sau khi thay thế ở vị trí 3 bằng 35: " + myArrayList.toString());

        // e. Trả về phần tử tại index
        int elementAtIndex = myArrayList.get(4);
        System.out.println("e. Phần tử tại vị trí 4 là: " + elementAtIndex);

        // f. Lấy vị trí index phần tử đầu tiên tìm thấy
        int elementToFind = 30;
        int indexOfElement = myArrayList.indexOf(elementToFind);
        if (indexOfElement != -1) {
            System.out.println("f. Vị trí index của phần tử " + elementToFind + " là: " + indexOfElement);
        } else {
            System.out.println("Không tìm thấy phần tử " + elementToFind + " trong danh sách.");
        }

        // g. Lấy vị trí index phần tử cuối cùng tìm thấy
        int lastIndexOfElement = myArrayList.lastIndexOf(elementToFind);
        if (lastIndexOfElement != -1) {
            System.out.println("g. Vị trí index cuối cùng của phần tử " + elementToFind + " là: " + lastIndexOfElement);
        } else {
            System.out.println("Không tìm thấy phần tử " + elementToFind + " trong danh sách.");
        }

        // h. Xóa phần tử tại vị trí index
        myArrayList.remove(1);
        System.out.println("h. Danh sách sau khi xóa phần tử tại vị trí 1: " + myArrayList.toString());

        // i. Xóa tất cả phần tử element
        myArrayList.removeElement(30);
        System.out.println("i. Danh sách sau khi xóa tất cả phần tử có giá trị 30: " + myArrayList.toString());
    }
}

