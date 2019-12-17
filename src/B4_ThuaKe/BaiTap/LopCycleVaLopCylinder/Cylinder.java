package B4_ThuaKe.BaiTap.LopCycleVaLopCylinder;

public class Cylinder extends Circle {
    private double hight;

    public Cylinder() {
        super();
    }

    public double getHight()
    {
        return hight;
    }

    public void setHight(double hight) {

        this.hight = hight;
    }

    public double getAreaCylinder() {

        return super.getArea() * this.hight;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
