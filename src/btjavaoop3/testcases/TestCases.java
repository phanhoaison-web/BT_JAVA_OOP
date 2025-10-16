package btjavaoop3.testcases;

import btjavaoop3.common.BaseTest;
import btjavaoop3.common.Constants;

public class TestCases extends BaseTest {

    private String url;
    private String email;
    private String password;

    //Hàm khởi tạo
    public TestCases(String url) {
        this.url = url;
    }

    //viết hàm login để dùng chung cho nhiều test case
    public void login(String email, String password){
        System.out.println("Nhập url: " + url);
        System.out.println("Nhập email: " + email);
        System.out.println("Nhập password: " + password);
        System.out.println("Click button Login");
    }

    //Test login
    public void testLogin(){
        createDriver(); // gọi hàm tạo driver từ class cha
        login(email,password);
        System.out.println("Verify ....");
        closeDriver(Constants.BROWSER); //đóng trình duyệt sau khi test xong
    }

    //Test thêm mới danh mục
    public void testAddCustomers(){
        createDriver(); // gọi hàm tạo driver từ class cha
        login(email,password);
        System.out.println("Click menu Customer");
        System.out.println("Verify header Customers Summary");
        System.out.println("Click button New Customer");
        System.out.println("Nhập thông tin thêm mới Customer");
        System.out.println("Verify header Customer Details");
        System.out.println("Nhập Company");
        System.out.println("Nhập VAT Number");
        System.out.println("Nhập Phone");
        System.out.println("Nhập Website");
        System.out.println("Chọn Groups");
        System.out.println("Chọn Currency");
        System.out.println("Chọn Default Language");
        System.out.println("Nhập Address");
        System.out.println("Nhập City");
        System.out.println("Nhập State");
        System.out.println("Nhập Zip Code");
        System.out.println("Chọn Country");
        System.out.println("Click button Save");
        System.out.println("Verify ....");
        closeDriver(Constants.BROWSER); //đóng trình duyệt sau khi test xong
    }

    public static void main(String[] args) {
        //Khởi tạo đối tượng testcase
        TestCases testLogin= new TestCases("https://crm.anhtester.com/admin/authentication");
        //Truyền thông tin đăng nhập
        testLogin.setEmail("admin@example.com"); // sử dụng hàm setter để truyền giá trị cho biến email
        testLogin.setPassword("123456"); // sử dụng hàm setter để truyền giá trị password
        //Start run test
        System.out.println("============== Run testcase Login ===============");
        testLogin.testLogin();
        System.out.println("=============== Run testcase add Customers  ==============");
        TestCases testAddCustomer= new TestCases("https://crm.anhtester.com/admin/authentication");
        //Truyền thông tin đăng nhập
        testAddCustomer.setEmail("admin@example.com"); // sử dụng hàm setter để truyền giá trị cho biến email
        testAddCustomer.setPassword("123456"); // sử dụng hàm setter để truyền giá trị password
        testAddCustomer.testAddCustomers();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
