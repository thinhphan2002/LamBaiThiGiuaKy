import java.util.Scanner;

public class HienThiThongTin{

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ThongTinConNguoi thongTinConNguoi = new ThongTinConNguoi();
    System.out.println("==============================================");
    SinhVien sinhVien = new SinhVien(6.0, "THINH", "QUAN1", 6, 6);
    System.out.println(sinhVien.toString());
    System.out.println("==============================================");
    KhachHang khachHang = new KhachHang("QUAN", "QUAN7", "THONG THUONG");
    System.out.println(khachHang.toString());
    System.out.println("==============================================");
    NhanVien nhanVien = new NhanVien("Nhan Vien", 50, "NHAN", "QUAN8");
    System.out.println(nhanVien.toString());
    System.out.println("==============================================");
    

}

    
}
