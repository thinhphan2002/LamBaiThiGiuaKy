import java.util.Scanner;

public class GiaoDich {
    protected int maGD, soLuong;
    protected String ngayGD;
    protected double dongia, thanhTien;

    Scanner in = new Scanner(System.in);

    protected GiaoDich(){
        this.dongia =0;
        this.maGD =0;
        this.soLuong =0;
        this.ngayGD = "";
        this.thanhTien = 0;
    }
    protected GiaoDich(int ma, int sl, String ngay, double gia, double tTien){
        this.maGD = ma;
        this.soLuong = sl;
        this.ngayGD = ngay;
        this.dongia = gia;
        this.thanhTien = tTien;
    }
    public void setMaGD(int maGD) {
        this.maGD = maGD;
    }
    public int getMaGD() {
        return maGD;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }
    public String getNgayGD() {
        return ngayGD;
    }
    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    public double getDongia() {
        return dongia;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public double getThanhTien() {
        return thanhTien;
    }
    protected void nhap(){
        System.out.println("MA GIAO DICH: ");
        maGD= in.nextInt();
        System.out.println("NGAY GIAO DICH: ");
        ngayGD=in.nextLine();
        System.out.println("DON GIA: ");
        dongia=in.nextDouble();
        System.out.println("SO LUONG: ");
        soLuong =in.nextInt();
    }
    @Override
    public String toString() {
        return "MA GIAO DICH: "+maGD
        +"\nNGAY GIAO DICH: "+ ngayGD
        +"\nDON GIA: "+ dongia
        +"\nSO LUONG: "+ soLuong;
    }
}
