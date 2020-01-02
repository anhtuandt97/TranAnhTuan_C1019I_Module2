package CaseStudy.Commons;

import java.util.Scanner;

public class FuncValidation {
    private static String regex= "";
    private static Scanner sc;

    public static boolean checkName(String str){
        regex="^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
        return str.matches(regex);
    }

    public static boolean checkFreeService(String str){
        regex ="^(massage|karaoke|food|drink|car)$";
        return  str.matches(regex);
    }
    public static double checkValidNumberDouble(String content , String errMess) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextDouble();
            }catch (Exception ex) {
                System.out.println(errMess);
            }
        }
    }

    public static Integer checkValidNumberInteger(String content , String errMess) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextInt();
            }catch (Exception ex) {
                System.out.println(errMess);
            }
        }
    }

    public static boolean checkEmail(String str) {
        regex ="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$" ;
        return str.matches(regex);
    }

    public static boolean checkGender(String str) {
        regex ="^(Male|Female|Unknow)$" ;
        return str.matches(regex);
    }

    public static boolean checkBirthday(String str) {
        regex ="^(0[1-9]|[1-2][0-9]|3[0-1])\\/(0[1-9]|1[0-2])\\/(19[0-9]{2}|200[0-2])$" ;
        return str.matches(regex);
    }
    public static boolean checkIDCard(String str) {
        regex ="^[0-9]{9}$" ;
        return str.matches(regex);
    }

    public static boolean checkPhoneNumber(String str) {
        regex ="^[0-9]{10}$" ;
        return str.matches(regex);
    }
}
