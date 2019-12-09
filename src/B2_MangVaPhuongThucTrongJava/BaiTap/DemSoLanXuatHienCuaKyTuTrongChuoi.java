package B2_MangVaPhuongThucTrongJava.BaiTap;
import java.util.Scanner;
public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String input = scanner.nextLine();
        System.out.println("Chuoi la: " + input);
        char x;
        System.out.println("Nhap vao ky tu : ");
        x = scanner.next().charAt(0);
        int count=0;
        for (int i=0;i<input.length();i++){
            if(input.charAt(i)==x) {
                count ++;
            }
        }
        System.out.println("So lan xuat hien cua "+ x +" la: "+count);
    }
}
