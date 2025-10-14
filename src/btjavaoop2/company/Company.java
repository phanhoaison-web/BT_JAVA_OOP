package btjavaoop2.company;

import btjavaoop2.person.Person;

public class Company {

    public static void main(String[] args) {
        Person person = new Person("Nguyễn Văn Hải",25,"Nam","Mỹ Đình - Hà Nội","0987123456");
        System.out.println("Thông tin nhân viên: ");
        System.out.println("Họ tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());
        System.out.println("Giới tính: " + person.getGender());
        System.out.println("========================");
    }
}
