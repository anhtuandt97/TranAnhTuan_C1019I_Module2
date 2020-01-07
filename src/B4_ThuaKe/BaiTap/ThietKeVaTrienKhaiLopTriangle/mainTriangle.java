package B4_ThuaKe.BaiTap.ThietKeVaTrienKhaiLopTriangle;

import java.util.Scanner;

public class mainTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Nhap vao canh thu nhat: ");
        triangle.setSide1( sc.nextDouble());
        System.out.println("Nhap vao canh thu hai: ");
        triangle.setSide2(sc.nextDouble());
        System.out.println("Nhap vao canh thu ba: ");
        triangle.setSide3(sc.nextDouble());
        System.out.println("Nhap vao mau cua tam giac: ");
        triangle.setCollor(sc.nextLine());
        System.out.println(triangle.toString());

    }
}
