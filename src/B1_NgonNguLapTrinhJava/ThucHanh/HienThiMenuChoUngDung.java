package B1_NgonNguLapTrinhJava.ThucHanh;
import java.util.Scanner;
public class HienThiMenuChoUngDung {
    public static void main(String[] args) {
        int choose = -1;
        while (choose != 4) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the rectangle");
            System.out.println("3. Draw the square");
            System.out.println("4. Exit!");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    break;
                case 2:
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    break;
            }
        }
    }
}
