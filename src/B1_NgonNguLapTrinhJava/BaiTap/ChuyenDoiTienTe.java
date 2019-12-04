package B1_NgonNguLapTrinhJava.BaiTap;
import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double rate = 23000;
        double usd ;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so tien USD: ");
        usd = input.nextDouble();
        double quyDoi = usd * rate;
        System.out.println("Gia tri VND: " + quyDoi);
    }
}
