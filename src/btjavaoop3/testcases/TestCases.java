package btjavaoop3.testcases;

import btjavaoop3.common.BaseTest;
import btjavaoop3.common.Constants;

public class TestCases extends BaseTest {

    private String url;
    private String email;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public void setData(String url, String email, String password){
        setUrl(url);
        setEmail(email);
        setPassword(password);
    }

    //Test login
    public void testLogin(){
        createDriver(); // gọi hàm tạo driver từ class cha
        System.out.println("Truy cập vào url: " + getUrl());
        System.out.println("Verify trình duyệt hiển thị đúng url trang login: https://crm.anhtester.com/admin/authentication");
        System.out.println("Verify header: Login");
        System.out.println("Nhập email: " + getEmail());
        System.out.println("Nhập password: " + getPassword());
        System.out.println("Click button Login");
        System.out.println("Verify đăng nhập thành công thì hiền thị url trang dashboard: https://crm.anhtester.com/admin/");
        System.out.println("Verify đăng nhập thành công thì hiền thị menu Dashboard Options");
        closeDriver(Constants.BROWSER); //đóng trình duyệt sau khi test xong
    }

    //Test thêm mới danh mục
    public void testAddCustomers(){
        createDriver(); // gọi hàm tạo driver từ class cha
        System.out.println("Truy cập vào url: " + getUrl());
        System.out.println("Verify trình duyệt hiển thị đúng url trang login: https://crm.anhtester.com/admin/authentication");
        System.out.println("Verify header: Login");
        System.out.println("Nhập email: " + getEmail());
        System.out.println("Nhập password: " + getPassword());
        System.out.println("Click button Login");
        System.out.println("Verify đăng nhập thành công thì hiền thị url trang dashboard: https://crm.anhtester.com/admin/");
        System.out.println("Verify đăng nhập thành công thì hiền thị menu Dashboard Options");
        System.out.println("Click menu Customer");
        System.out.println("Verify header Customers Summary");
        System.out.println("Click button New Customer");
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
        System.out.println("Verify alert message Customer added successfully.");

        System.out.println("Click menu Customers");
        System.out.println("Verify header Customers Summary");
        System.out.println("Click thanh search trên giao diện ");
        System.out.println("Nhập company vừa thêm mới ");
        System.out.println("Verify compay vừa thêm mới đã hiển thị trong kết quả tìm kiếm");
        closeDriver(Constants.BROWSER); //đóng trình duyệt sau khi test xong
    }

    public static void main(String[] args) {
        TestCases testCases= new TestCases();
        testCases.setData("https://crm.anhtester.com/admin/authentication","admin@example.com","123456");
        //Start run test
        System.out.println("============== Run testcase Login ===============");
        testCases.testLogin();
        System.out.println("=============== Run testcase add Customers  ==============");
        testCases.testAddCustomers();

    }
}
