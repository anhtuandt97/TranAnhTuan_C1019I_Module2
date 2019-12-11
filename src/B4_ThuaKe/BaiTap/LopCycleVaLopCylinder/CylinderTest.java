package B4_ThuaKe.BaiTap.LopCycleVaLopCylinder;
import java.util.Scanner;
public class CylinderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder cylinder = new Cylinder();
        System.out.println("Nhap vao ban kinh:");
        cylinder.setRadius(sc.nextDouble());
        System.out.println("Nhap vao chieu cao:");
        cylinder.setHight(sc.nextDouble());
        System.out.println("Dien tich hinh tru La: ");
        System.out.println( cylinder.getAreaCylinder());
    }
}
