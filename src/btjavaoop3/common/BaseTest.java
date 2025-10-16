package btjavaoop3.common;

public class BaseTest {

    private String browser;
    private Boolean report;
    private Boolean headless;
    private String webBrowser; // biến lưu thông tin trình duyệt

    //hàm khởi tạo có tham số
    public BaseTest(String browser, Boolean report, Boolean headless) {
        this.browser = browser;
        this.report = report;
        this.headless = headless;
    }

    //hàm tạo web driver
    public void createDriver(){
        System.out.println("=====================================");
        System.out.println("Creating Driver :" + browser.toUpperCase());
        //Lựa chọn loại trình duyệt theo biến browser
        switch (browser.toUpperCase()){
            case "CHROME":
                webBrowser = "Google chrome";
                break;
            case "FIREFOX":
                webBrowser = "Fire fox";
                break;
            case "EDGE":
                webBrowser = "Microsoft Edge";
                break;
        }
        System.out.println("Report :" + report);
        System.out.println("Headless: " +  headless);
    }

    //hàm đóng web driver khi kết thúc test
    public void closeDriver(){
        System.out.println("Closing Driver "+ browser);
    }

    public String getWebBrowser() {
        return webBrowser;
    }

    public void setWebBrowser(String webBrowser) {
        this.webBrowser = webBrowser;
    }
}
