package CaseStudy.Controllers;

import CaseStudy.Commons.FuncWriteFileCSV;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    private static Scanner sc = new Scanner(System.in);
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
                System.out.println("Loi!!! Back to menu");
                backMainMenu();
        }
    }
    private static void addNewService(){
        System.out.println("\n--------------------------");
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
                backMainMenu();
            case 5:
                System.exit(0);
            default:
                System.out.println("Loi!!! Back to menu");
                backMainMenu();
        }

    }

    public static void showService(){

    }

    private static Services addNewService(Services services){
        services.setId(UUID.randomUUID().toString().replace("-",""));
        System.out.println("Enter name Service: ");
        services.setServiceName(sc.nextLine());
        System.out.println("Enter Area Use: ");
        services.setUseArea(sc.nextDouble());
        System.out.println("Enter Rent Fee: ");
        services.setRentFee(sc.nextInt());
        System.out.println("Enter Max Of People:");
        services.setMaxOfPeople(sc.nextInt());
        System.out.println("Enter Rent Type");
        services.setRentType(sc.nextLine());
        return services ;
    }


    public static void addNewVilla() {
        Services villa = new Villa();
         addNewService(villa);
        System.out.println("Enter Standard Room: ");
        ((Villa)villa).setStandardRoom(sc.nextLine());
        System.out.println("Other Comfort Description");
        ((Villa)villa).setOtherComfortDescription(sc.nextLine());
        System.out.println("Pool Area");
        ((Villa)villa).setPoolArea(sc.nextLine());
        System.out.println("Number Of Floors");
        ((Villa)villa).setNumberOfFloors(sc.nextInt());

        ArrayList<Villa> listVilla = new ArrayList<Villa>() ;
        listVilla.add((Villa) villa);
        FuncWriteFileCSV.writeVillaToFileCSV(listVilla);
        System.out.println("\n Add Villa: " + villa.getServiceName()+ "OK");
        backMainMenu();
    }

    public static void addNewHouse() {

    }

    public static void addNewRoom() {

    }

    public static void backMainMenu(){
        System.out.println("\n Enter continue...");
        sc.nextLine();
        System.out.println("\n--------------------------");
        displayMainMenu();
    }
}
