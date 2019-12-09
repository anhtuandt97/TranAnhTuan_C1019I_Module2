package B3_LopVaDoiTuongTrongJava.BaiTap.XayFungLopStopWatch;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
//        this.startTime = System.currentTimeMillis();
    }

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public double getEscapTme() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (long i = 0; i < 10000000; i++) {
            Math.random();
        }
        stopWatch.end();
        System.out.print("Thoi gian bat dau la: " + stopWatch.getStartTime() + "\n");
        System.out.print("Thoi gian ket thuc la: " + stopWatch.getEndTime() + "\n");
        System.out.println("Thoi gian dem duoc la: " + stopWatch.getEscapTme());
    }
}
