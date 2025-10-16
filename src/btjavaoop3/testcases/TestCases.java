package btjavaoop3.testcases;

import btjavaoop3.common.BaseTest;
import btjavaoop3.common.Constants;

public class TestCases extends BaseTest {

    private String url;
    private String email;
    private String password;

    //Hàm khởi tạo
    public TestCases(String browser, Boolean report, Boolean headless, String url) {
        super(browser, report, headless); // truyền giá trị tham số vào các biến trong class cha
        super.createDriver(); // gọi hàm tạo driver từ class cha
        this.url = url;
    }

    //viết hàm login để dùng chung cho nhiều test case
    public void login(){
        System.out.println("Mở trình duyệt: "+ super.getWebBrowser());
        System.out.println("Nhập url: " + url);
        System.out.println("Nhập email: " + email);
        System.out.println("Nhập password: " + password);
        System.out.println("Click button Login");
        System.out.println("Verify ....");
    }

    //Test login
    public void testLogin(){
        login();
        super.closeDriver(); //đóng trình duyệt sau khi test xong
    }

    //Test thêm mới danh mục
    public void testAddCategory(String category){
        login();
        System.out.println("Click Menu Quản lý Category");
        System.out.println("Click Button Thêm mới");
        System.out.println("Nhập thông tin thêm mới danh mục "+ category +"...");
        System.out.println("Nhập ...");
        System.out.println("Click button Lưu");
        System.out.println("Verify ....");
        super.closeDriver(); //đóng trình duyệt sau khi test xong
    }

    public static void main(String[] args) {
        //Khởi tạo đối tượng testcase
        TestCases tessCase= new TestCases(Constants.BROWSER,Constants.REPORT,Constants.HEADLESS,"https://crm.anhtester.com/admin/authentication");
        //Truyền thông tin đăng nhập
        tessCase.setEmail("admin@example.com"); // sử dụng hàm setter để truyền giá trị cho biến email
        tessCase.setPassword("123456"); // sử dụng hàm setter để truyền giá trị password
        //Start run test
        System.out.println("============== Run testcase Login ===============");
        tessCase.testLogin();
        System.out.println("=============== Run testcase add category  ==============");
        tessCase.testAddCategory("Giày dép");
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
