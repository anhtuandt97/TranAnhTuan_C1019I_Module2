package GiaiThuat;

import java.util.Scanner;

public class Cau8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.println("Nhap so thu nhat: ");
             a= sc.nextInt();
            System.out.println("Nhap so thu hai: ");
             b= sc.nextInt();
        }
        while (a<=0||b<=0);

        int temp1= a;
        int temp2 =b;
        int ucln;
        int bcnn;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        ucln = temp1;
        bcnn = (a*b)/ucln;
        System.out.println("Uoc chung lon nhat cua 2 so la: "+ ucln);
        System.out.println("Boi chung nho nhat cua 2 so la: " + bcnn);



    }
}
