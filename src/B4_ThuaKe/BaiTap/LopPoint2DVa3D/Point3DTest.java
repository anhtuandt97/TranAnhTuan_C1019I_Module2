package B4_ThuaKe.BaiTap.LopPoint2DVa3D;
import  java.util.Scanner;
public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu rong: ");
        point3D.setX(sc.nextFloat());
        System.out.print("Nhap vao chieu dai: ");
        point3D.setY(sc.nextFloat());
        System.out.println("Nhap vao chieu cao");
        point3D.setZ(sc.nextFloat());
        System.out.println("Xuat ra: ");
        System.out.println(point3D);
    }
}
