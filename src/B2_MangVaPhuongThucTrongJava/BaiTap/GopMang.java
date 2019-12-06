package B2_MangVaPhuongThucTrongJava.BaiTap;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        int [] array1;
        array1 = new int [4];
        int [] array2;
        array2 = new int [4];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < array1.length) {
            System.out.print("Nhap vao vi tri thu " + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }
        for(int k:array1) {
            System.out.print(k + "\t");
        }
        System.out.println();
        int j = 0;
        while (j < array2.length) {
            System.out.print("Nhap vao vi tri thu " + (j + 1) + " : ");
            array2[j] = scanner.nextInt();
            j++;
        }
        for (int h:array2) {
            System.out.print(h + "\t");
        }
        System.out.println();

        int [] array3;
        array3 = new int [array1.length + array2.length];
        int d =0;
        for (int a=0;a<array1.length;a++) {
            array3[d] = array1[a];
            d++;
        }

        for (int b=0;b<array2.length;b++) {
            array3[d] = array2[b];
            d++;
        }

        System.out.println("Mang 3 la:");
        for (int n =0; n<array3.length; n++) {
            System.out.print(array3[n] + "\t");
        }
    }
}
