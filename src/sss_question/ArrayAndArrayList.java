package sss_question;

public class ArrayAndArrayList {
    /*
    =======ARRAY & ARRAYLIST=======
    Array:
    - Có kích thước có định
    -
    ArrayList:
    - Có thể thay đổi được kích thước
    - Ảnh của thằng arraylist bên dưới là thằng array có thêm bo sung như thêm sửa xoá (ok)
    */

//---------------------------------------------------------------------------------------------//

    /*
    - Hướng đến hành động sử dụng Interface
    - Hướng đến dữ liệu sử dụng abstract
    */

//---------------------------------------------------------------------------------------------//

    /*
    =====Node=====
    - Biến để lưu giá trị
    - Node để tham chiếu tới node khác
    */

//---------------------------------------------------------------------------------------------//

    /*
    =====ARRAYLIST & LINKEDLIST=====

    Arraylist:
    - Một mảng có thể co giãn được vùng nhớ
    - Truy cập : Nhanh
    - Xoá/Thêm : Chậm
    - get() hiệu quả hơn
    Vì sao Arraylist get ra nhanh hơn ?
    - Các phần tử của nó liên tuc nhau trong ô nhớ
    Vì sao Arraylist xoá/ thêm chậm ?
    -

    Linkedlist:
    - Sử dụng một danh sách liên kết để lưu trữ
    - Truy cập : Chậm
    - Xoá/Thêm : Nhanh
    - Những ô nhớ kh liên tục nhau nên tốc độ xảy ra chậm hơn, get() kh hiệu quả
    - Sử dụng danh sách liên kết
    + Trường hợp sửa không xác định được
    + Cơ chế hoạt động dựa vào các node trong danh sách liên kết
    Vì sao ?

    - Khi nào mà thêm/xoá liên tục thi dùng LinkedList
    */

//---------------------------------------------------------------------------------------------//

    /*
    =====STACK=====
    - Là cau trúc dữ liệu dạng danh sách, thêm và lấy các phần tu theo quy tắc FILO
    - Các phương thức:
    + push(): thêm
    + peek(): lấy ra xem không xoá
    + pop(): lấy ra xem và xo
    + isEmpty(): Rỗng
    + size(): Trả về số lượng hiện có

    =====QUEUE=====
    - Theo cơ chế First In First Out
    - Các phương thức
    + add(): Thêm
    + remove(): xoá

    =====GENERICS=====
    - Là 1 tính năng xác định kiểu dữ liệu
    - Cho phép sử dụng dữ liệu như 1 tham số
    - E: Đại diện cho Element(thường dùng như List, Set,...)
    - T: Type : kiểu dữ liệu tổng quát
    - N: đại diện cho number
    - K: Key được sử dụng trong cấu trúc Map
    - V: Value cũng được sử dụng trong cấu trúc Map
    Khi nào can sử dụng Generics ?
    - Cho phép truyền dữ liệu như 1 tham số
    - Cho phép tạo ra các class, method, interface hoạt động với nhiều kiểu dữ liệu khác nhau
    -
    */

//---------------------------------------------------------------------------------------------//

    /*
    Hãy phân biệt List và Set
    List:
    - Các phần tử có thể trùng lặp
    Set:
    - Các phần tử không thể trùng lặp
    */

//---------------------------------------------------------------------------------------------//

    /*
    =======Hãy so sánh Equals() và HashCode() ?

    Equals():
    - Mục đích: Kiểm tra xem hai đối tượng có bằng nhau không.
    - Cách thức hoạt động: Phương thức này so sánh nội dung của các đối tượng để xác định xem chúng có bằng nhau không.
    - Sử dụng trong so sánh

    HasdCode():
    - Mục đích: Trả về một mã băm đại diện cho đối tượng.
    - Cách thức hoạt động: Phương thức này tạo ra một giá trị số nguyên dựa trên nội dung của đối tượng,
    được sử dụng trong các cấu trúc dữ liệu như HashMap, HashSet.
    - Mối quan hệ
    - Là một giá trị số nguyên được tính toán bằng dữ liệu đầu vào
    - Đặc điểm:
    + Với một đầu vào cố định, mã băm phải luôn giống nhau
    + 2 dối tượng khác nhau có thể cùng mã băm
    - Mục tiêu: Hỗ trợ tìm kiếm nhanh

    HashSet():
    - Các phần tử trong HashSet không có thứ tự cụ thể
    - Thêm, xoá và lấy phần tử nhanh
    - Mỗi bucket là một linked list để lưu trữ các phần tử dựa trên mã băm
    - initialCapacity = 16(Sức chứa ban đầu)
    - loadFactor = 0.75(Hệ sôs đầy)
    - Cơ ches hoạt động:

    */
}
