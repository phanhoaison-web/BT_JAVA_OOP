package btjavaoop2.person;

public class Infomation {

    public static void main(String[] args) {
        // Tạo đối tượng person với hàm xây dựng
        Person person = new Person("Nguyễn Văn Hải",25,"Nam","Nam Từ Liêm - Hà Nội", "0987654321");
        //Gọi lại tất cả các thông tin từ class Person
        System.out.println("Thông tin nhân viên: ");
        System.out.println("Họ tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());
        System.out.println("Giới tính: " + person.getGender());
        System.out.println("Địa chỉ: " + person.getAddress());
        System.out.println("Số điện thoại: " + person.getPhone());
        System.out.println("========================");
    }
}
