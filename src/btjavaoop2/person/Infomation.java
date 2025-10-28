package btjavaoop2.person;

public class Infomation {

    public void showPersonInfo(){
        Person person = new Person("Nguyễn Văn Hải",25,"Nam","Nam Từ Liêm - Hà Nội", "0987654321");
        System.out.println("Thông tin nhân viên: ");
        System.out.println("Họ tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());
        System.out.println("Giới tính: " + person.getGender());
        System.out.println("Địa chỉ: " + person.getAddress());
        System.out.println("Số điện thoại: " + person.getPhone());
    }

    public static void main(String[] args) {
        Infomation info = new Infomation();
        info.showPersonInfo();
    }
}
