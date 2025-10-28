package btjavaoop2.person;

public class Person {
    public String name;
    public int age;
    public String gender;
    String address;
    String phone;

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    String getAddress() {
        return address;
    }

    String getPhone() {
        return phone;
    }
}
