package GiaiThuat;

import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int n = sc.nextInt();
        int x =0;
        int s=1;
        if (n%2==0) {
            for(int i =1; i<=n/2;i++) {
                x = i*2;
                s = s*x;
            }


            System.out.println("n chan--> s= " + s);
        }
        else {
            for(int i =1; i<=(n-1)/2;i++) {
                x = i*2+1;
                s= s*x;

            }
            System.out.println("n le--> s= " + s);
        }
    }
}
