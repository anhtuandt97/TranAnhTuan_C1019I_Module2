package B1_NgonNguLapTrinhJava.BaiTap;
import java.util.Scanner;
public class SoNguyenToNhoHon100 {
    public static boolean isSNT(int b){
        for(int i=2;i<b;i++){
            if (b%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num;
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        num = input.nextInt();
        int n = 2;
        String str = "";
        while (n<num){
            if(isSNT(n)){
                str += n + " ";
            }
            n++;
        }
        System.out.println(str);
    }
}
