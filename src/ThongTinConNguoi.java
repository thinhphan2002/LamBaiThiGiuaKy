import java.util.Scanner;

public class ThongTinConNguoi {
    protected String ten, diaChi;

    Scanner in = new Scanner(System.in);

    protected ThongTinConNguoi(){};

    protected ThongTinConNguoi(String ten, String diaChi){
        this.ten=ten;
        this.diaChi=diaChi;
    }


    protected void nhap(){
        System.out.println("Ten Khach Hang: ");
        ten=in.next();
        System.out.println("Dia chi: ");
        diaChi=in.next();
    }

    @Override
    public String toString() {
        return "\nTen: "+ten
        +"\nDia Chi: "+diaChi;
    }
}
