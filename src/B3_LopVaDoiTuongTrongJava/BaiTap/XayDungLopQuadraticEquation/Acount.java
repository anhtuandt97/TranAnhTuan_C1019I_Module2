package B3_LopVaDoiTuongTrongJava.BaiTap.XayDungLopQuadraticEquation;

public class Acount {
    private double a, b, c;

    public Acount() {

    }
    public void seta(double a) {

        this.a = a;
    };

    public void setb(double b) {
        this.b = b;
    };

    public void setc(double c) {

        this.c = c;
    };

//    private double geta() {
//        return this.a;
//    }
//
//    private double getb() {
//        return this.b;
//    }
//    private double getc() {
//        return this.c;
//    }

    public double getDiscriminant(){
        double delta = (2*this.b)-(4*this.a*this.c);
        return  delta;
    }

    public double getRoot1() {
        double  r1 = (-this.b + Math.pow((2*this.b)-(4*this.a*this.c),0.5))/(2*this.a);
        return r1;
    }

    public double getRoot2() {
        double  r2 = (-this.b - Math.pow((2*this.b)-(4*this.a*this.c),0.5))/(2*this.a);
        return r2;
    }
}
