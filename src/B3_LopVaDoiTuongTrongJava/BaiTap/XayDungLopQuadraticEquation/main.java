package B3_LopVaDoiTuongTrongJava.BaiTap.XayDungLopQuadraticEquation;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Acount acount = new Acount();
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        acount.seta(a);
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        acount.setb(b);
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        acount.setc(c);

        System.out.println("Delta la:  " + acount.getDiscriminant());
        double delta = acount.getDiscriminant();

        if (delta >0){
            System.out.println("Phuong trinh co 2 nghiem: " + acount.getRoot1() + "  and  " + acount.getRoot2());
        }
        else if (delta==0) {
            System.out.println("Phuong Trinh co 1 nghiem duy nhat: "+ acount.getRoot1());
        }
        else if (delta<0) {
            System.out.println("Phuong trinh vo nghiem!!!");
        }
    }

}
