public class NhanVien extends ThongTinConNguoi {
    private String chucVu;
    private double luong;


    protected NhanVien(String  chucVu, double luong,String ten, String diaChi) {
        super(ten, diaChi);
        this.chucVu=chucVu;
        this.luong=luong;
    }

    public double luong(){
        return luong;
    }

    @Override
    protected void nhap() {
        super.nhap();
        System.out.println("CHUC VU: ");
        chucVu=in.next();
        System.out.println("Luong Nhan Vien: ");
        luong=in.nextDouble();
    }

   
    
    @Override
    public String toString() {
        return "Nhan Vien: " +super.toString()
        + "\nChuc Vu: "+ chucVu
        + "\nLuong: " +luong;
    }
}
