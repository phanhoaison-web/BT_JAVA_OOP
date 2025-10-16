package btjavaoop3.common;

public class BaseTest {
    //hàm tạo web driver
    public void createDriver(){
        System.out.println("Creating Driver :" + Constants.BROWSER);
        System.out.println("Report :" + Constants.REPORT);
        System.out.println("Headless: " +  Constants.HEADLESS);
    }

    //hàm đóng web driver khi kết thúc test
    public void closeDriver(String browser){
        System.out.println("Closing Driver: "+ browser);
    }

}
