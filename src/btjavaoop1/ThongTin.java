package btjavaoop1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        //Lưu thông tin nhân viên
        nhanVien.themNhanVien("Nguyễn Văn Hải","Nhân viên","Kinh Doanh",25);
        //In thông tin nhân viên vừa nhập
        nhanVien.displayInfo();
    }
}
