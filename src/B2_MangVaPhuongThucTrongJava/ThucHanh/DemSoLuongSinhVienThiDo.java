package B2_MangVaPhuongThucTrongJava.ThucHanh;
import java.util.Scanner;
public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
         do {
             System.out.print("Nhap do dai mang");
             size = scanner.nextInt();

             if(size>30) {
                 System.out.print("Do dai khong duoc qua 30");
             }
         } while (size>30);

         array = new int[size];
         int i = 0;
         while (i<size) {
             System.out.println("Sinh vien thu: "+ (i+1) + ": ");
             array[i]= scanner.nextInt();
             i++;
         }

         int count = 0;
         System.out.println("Danh sach sinh vien");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n So sinh vien dau bai thi la: " + count);
    }
}
