package B5_AdvancedObjectOrientedDesign.BaiTap.TrienKhaiInterfaceResizeable;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;
    private double area;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filler, double radius) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return 2* Math.PI * (getRadius() * getRadius());
    }


    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString()
                +", area is= "
                +area();
    }


    @Override
    public void resize(double percent) {
        area = area()*(1+percent);
        System.out.println(area);
    }
}
