package B4_ThuaKe.BaiTap.PoinVaMoveablePoint;

import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu rong: ");
        point.setX(sc.nextFloat());
        System.out.print("Nhap vao chieu dai: ");
        point.setY(sc.nextFloat());
        System.out.println("Xuat ra: ");
        System.out.println(point);
    }
}
