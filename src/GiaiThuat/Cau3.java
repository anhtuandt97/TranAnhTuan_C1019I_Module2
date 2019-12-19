package GiaiThuat;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        float s =0;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        } while (n<1);
        for (int i = 1; i <= n; i++) {
            s = s + (float)1/i;
        }
        System.out.println("Tổng S = 1 + 1/2 + 1/3 + ... + 1/n là: " + s);
    }
}
