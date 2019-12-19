package GiaiThuat;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        boolean isLeapYear;
        do {
            System.out.print("Nhập năm: ");
            year = sc.nextInt();
        } while (year<1);

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d là năm nhuận\n", year);
                    isLeapYear = true;
                } else {
                    System.out.printf("%d là năm không nhuận\n", year);
                    isLeapYear = false;
                }
            } else {
                System.out.printf("%d là năm nhuận\n", year);
                isLeapYear = true;
            }
        } else {
            System.out.printf("%d là năm không nhuận \n", year);
            isLeapYear = false;
        }


        int month;
        do {
            System.out.print("Nhập tháng: ");
            month = sc.nextInt();
        } while (month<1 || month > 12);

        switch (month) {
            case 2:
                if (isLeapYear == true) {
                    System.out.println("Tháng có 28 ngày ");
                }
                else {
                    System.out.println("Tháng có 29 ngày ");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày!");
                break;
            default:
                System.out.println("Tháng có 31 ngày");
                break;
        }

    }
}
