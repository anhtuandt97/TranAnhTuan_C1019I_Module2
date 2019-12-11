package B4_ThuaKe.BaiTap.LopPoint2DVa3D;
import java.util.Scanner;
public class Poin2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu rong: ");
        point2D.setX(sc.nextFloat());
        System.out.print("Nhap vao chieu dai: ");
        point2D.setY(sc.nextFloat());
        System.out.println("Xuat ra: ");
        System.out.println(point2D);
    }
}
