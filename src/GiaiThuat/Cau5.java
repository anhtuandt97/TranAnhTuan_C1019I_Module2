package GiaiThuat;

import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float sum =0;
        float temp  ;
        int x;
        do {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        } while (n < 1);
        for (int i = 1; i <= (2*n)-1 ; i++) {
            x = i*2-1;
            for (int j =1; j<=x; j++) {
                x *= j;
            }
            temp = x;
            sum += (float) 1/temp;
        }
        System.out.println("Tong S=1+1/3!+1/5!+.....+1/(2n-1)! la: " + sum);
    }
}
