package B5_AdvancedObjectOrientedDesign.BaiTap.TrienKhaiInterfaceResizeable;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("new Area");
        circle.resize(Math.random());

        circle = new Circle(3.5);
        System.out.println(circle);
        System.out.println("new Area");
        circle.resize(Math.random());

        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);
        System.out.println("new Area");
        circle.resize(Math.random());
    }
}

