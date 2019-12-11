package B4_ThuaKe.BaiTap.LopPoint2DVa3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public float [] getXYZ(){
        float [] arr1 = {getX(), getY(), getZ()};
        return arr1;
    }

    @Override
    public String toString() {
        return "Chieu rong la: " + getX() +"\n"+
                "Chieu dai la: " + getY() + "\n"+
                "Chieu cao la: " + getZ() + "\n" +
                Arrays.toString(getXYZ());

    }
}
