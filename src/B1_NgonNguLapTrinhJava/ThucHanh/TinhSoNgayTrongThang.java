package B1_NgonNguLapTrinhJava.ThucHanh;
import java.util.Scanner;
public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("28 or 29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("31 days");
                break;
        }
    }
}
