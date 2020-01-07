package B4_ThuaKe.BaiTap.PoinVaMoveablePoint;

import java.util.Scanner;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint  = new MovablePoint();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu rong: ");
        movablePoint.setX(sc.nextFloat());
        System.out.print("Nhap vao chieu dai: ");
        movablePoint.setY(sc.nextFloat());
        System.out.print("Nhap vao speed chieu rong: ");
        movablePoint.setXSpeed(sc.nextFloat());
        System.out.println("Nhap vao speed chieu dai: ");
        movablePoint.setYSpeed(sc.nextFloat());
        System.out.println("Trước khi dịch chuyển: ");
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println("Sau khi dịch chuyển: ");
        System.out.println(movablePoint);

    }
}
