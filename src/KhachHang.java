

public class KhachHang extends ThongTinConNguoi {

    private String kieuXeBan;




    protected KhachHang(String ten, String diaChi, String kieuXeBan) {
        super(ten, diaChi);
        this.kieuXeBan=kieuXeBan;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Kieu Ban xe 1(Cao cap) / 2(THONG THUONG): ");
        kieuXeBan=in.next();
    }

    public void hoaDon(){
        System.out.println("Ten: " +ten);
        System.out.println("Dia Chi: "+diaChi);
        System.out.println("Kieu Xe Ban: "+ kieuXeBan);
    }


    @Override
    public String toString() {
        return "Khach Hang: " +super.toString()
        + "\nKieu Xe Ban" + kieuXeBan;
    }
    

}
