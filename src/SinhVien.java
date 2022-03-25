public class SinhVien extends ThongTinConNguoi {
    private double diemMon1, diemMon2;
    private double diemTong;

    protected SinhVien(double diemTong,String ten, String diaChi, double diemMon1, double diemMon2) {
        super(ten, diaChi);
        this.diemMon1=diemMon1;
        this.diemMon2=diemMon2;
        this.diemTong=diemTong;
    }




    



    @Override
    protected void nhap(){
        super.nhap();
        System.out.println("DIEM MON 1: ");
        diemMon1=in.nextDouble();
        System.out.println("DIEM MON 2: ");
        diemMon2=in.nextDouble();
        System.out.println("TINH DIEM TONG: ");
        diemTong=in.nextDouble();


    }


    @Override
    public String toString() {
        return "Sinh Vien: " + super.toString()
        +"\nDiem Mon 1: " + diemMon1
        +"\nDiem Mon 2: " +diemMon2
        +"\nDiem Tong: " +diemTong;
    }
    
}
