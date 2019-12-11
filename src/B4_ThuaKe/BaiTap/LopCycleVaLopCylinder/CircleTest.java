package B4_ThuaKe.BaiTap.LopCycleVaLopCylinder;
import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Nhap vao ban kinh:");
        circle.setRadius(sc.nextDouble());
        System.out.println("Chu vi la: ");
        System.out.println(circle.getPerimeter());

        System.out.println("Dien Tich La: ");
        System.out.println( circle.getArea());

    }
}
