package B4_ThuaKe.BaiTap.ThietKeVaTrienKhaiLopTriangle;

public class Triangle extends Shape {
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String collor) {
        super(side1, side2, side3, collor);
    }

    public double getHalfPerimeter(){
        return 0.5*(getSide1()+getSide2()+getSide3());
    }

    public double getArea(){
        return Math.sqrt(getHalfPerimeter()*(getHalfPerimeter()-getSide1())*(getHalfPerimeter()-getSide2())*(getHalfPerimeter()-getSide3()));
    }

    @Override
    public String toString(){
        return "Canh 1: " + getSide1() +
                "\nCanh 2: " + getSide2()+
                "\nCanh 3: " + getSide3()+
                "\nCollor:"+ getCollor()+
                "\nChu vi tam giac la: " + getHalfPerimeter()*2.0+
                "\nDien tich tam giac la: "+ getArea();
    }
}
