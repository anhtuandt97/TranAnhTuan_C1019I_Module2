package CaseStudy.Controllers;

import java.util.Scanner;

public class FuncWriteFileCSV {
    public static Scanner sc = new Scanner(System.in);
    public static void displayMainMenu() {
        System.out.println("1.Add New Services\n"
                +"2.Show Services\n"
                +"3.Exit\n");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                addNewService();
                break;
            case 2:
                showService();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Nhap lai!!!");
                displayMainMenu();
        }
    }
    public static void addNewService(){
        System.out.println("1. Add New Villa\n"
                + "2. Add New House\n"
                +"3. Add New Room\n"
                +"4. Back to menu\n"
                +"5. Exit\n");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                backToMenu();
            case 5:
                System.exit(0);
            default:
                System.out.println("Nhap lai!!!");
                addNewService();
        }

    }

    public static void showService(){

    }


    public static void addNewVilla() {

    }

    public static void addNewHouse() {

    }

    public static void addNewRoom() {

    }

    public static void backToMenu(){
        displayMainMenu();
    }
}
