package ss7_dsa_list.my_linkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();

        // a. addFirst (int element)
        myList.addFirst(10);
        myList.addFirst(20);
        myList.addFirst(30);

        // b. toString(): Trả về thông tin đối tượng
        System.out.println("b. Danh sách ban đầu: " + myList.toString());

        // c. addLast (int element)
        myList.addLast(40);
        myList.addLast(50);

        // d. add (int index, int element)
        myList.add(2, 25);
        System.out.println("d. Danh sách sau khi thêm 25 vào vị trí 2: " + myList.toString());

        // e. removeFirst ()
        myList.removeFirst();
        System.out.println("e. Danh sách sau khi xóa phần tử đầu tiên: " + myList.toString());

        // f. removeLast ()
        myList.removeLast();
        System.out.println("f. Danh sách sau khi xóa phần tử cuối cùng: " + myList.toString());

        // g. remove (int index)
        myList.remove(2);
        System.out.println("g. Danh sách sau khi xóa phần tử tại vị trí 2: " + myList.toString());

        // h. getFirst ()
        Integer firstElement = myList.getFirst();
        System.out.println("h. Phần tử đầu tiên trong danh sách: " + firstElement);

        // i. getLast ()
        Integer lastElement = myList.getLast();
        System.out.println("i. Phần tử cuối cùng trong danh sách: " + lastElement);

        // j. get (int index)
        Integer elementAtIndex = myList.get(1);
        System.out.println("j. Phần tử tại vị trí 1 trong danh sách: " + elementAtIndex);

        // k. set (int index, int element)
        myList.set(0, 15);
        System.out.println("k. Danh sách sau khi thay thế phần tử tại vị trí 0 thành 15: " + myList.toString());

        // l. indexOf ()
        Integer indexOfElement = myList.indexOf(20);
        System.out.println("l. Vị trí index của phần tử 20 là: " + indexOfElement);

        // n. lastIndexOf ()
        Integer lastIndexOfElement = myList.lastIndexOf(25);
        System.out.println("n. Vị trí index cuối cùng của phần tử 25 là: " + lastIndexOfElement);
    }
}

