package btjavaoop1;

public class NhanVien {
    String hoten;
    String chucVu;
    String phongBan;
    int tuoi = 0;

    public void themNhanVien(String hoten, String chucVu, String phongBan, int tuoi) {
        this.hoten = hoten;
        this.chucVu = chucVu;
        this.phongBan = phongBan;
        this.tuoi = tuoi;
    }

    public void displayInfo(){
        System.out.println("Thông tin nhân viên");
        System.out.println("Họ và tên: " + hoten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Thuộc phòng ban: "+phongBan);
        System.out.println("Chức vụ: "+chucVu);
    }
}
