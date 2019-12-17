package B5_AdvancedObjectOrientedDesign.ThucHanh.SoSanhHinhHoc;

public class Circle {
    private double radius;
    private String color;
    private boolean types;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean types) {
        this.radius = radius;
        this.color = color;
        this.types = types;
    }

    public double getRadius() {
        return radius;
    }


    public String getColor() {
        return color;
    }



    public boolean isTypes() {
        return types;
    }


}
