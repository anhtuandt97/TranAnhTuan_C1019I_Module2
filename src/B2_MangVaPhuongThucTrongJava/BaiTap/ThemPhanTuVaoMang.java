package B2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length/2) {
            System.out.print("Nhap vao vi tri thu " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Phan tu trong mang la: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        System.out.println("Nhap so can chen:");
        int X = scanner.nextInt();

        System.out.println("Chon vi tri can chen");
        int k = scanner.nextInt();
        for (i=0; i<size; i++) {
            if (i==k) {
                array[i+1] = array[i];
                array[k] = X;
            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}