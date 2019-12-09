package B2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        size = scanner.nextInt();
        array = new int[size+1];
        int i = 0;
        while (i < (size)) {
            System.out.print("Nhap vao vi tri thu " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Phan tu trong mang la: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        System.out.println();
        System.out.print("Nhap so can xoa: ");
        int X = scanner.nextInt();
        System.out.print("Tai vi tri so: ");
        int index;
        for( index=0; index<array.length; index++) {
            if (array[index]==X) {
                System.out.print(index +"\n");
                break;
            }
        }

        for (int j =index; j<=array.length-index; j++) {
                array[j] = array[j+1];
        }

        System.out.println("Mang sau khi xoa la: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
