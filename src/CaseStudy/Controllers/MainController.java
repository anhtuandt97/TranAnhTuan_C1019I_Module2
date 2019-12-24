package CaseStudy.Controllers;

import CaseStudy.Commons.FuncWriteFileCSV;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    private static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println("1.Add New Services\n"
                + "2.Show Services\n"
                + "3.Exit\n");
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

    private static void addNewService() {
        System.out.println("\n--------------------------");
        System.out.println("1. Add New Villa\n"
                + "2. Add New House\n"
                + "3. Add New Room\n"
                + "4. Back to menu\n"
                + "5. Exit\n");
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

    public static void showService() {
        System.out.println("\n--------------------------");
        System.out.println("1. Show New Villa\n"
                + "2. Show New House\n"
                + "3. Show New Room\n"
                + "4. Back to menu\n"
                + "5. Exit\n");
        switch (sc.nextInt()) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
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

    private static Services addNewService(Services services) {
        services.setId(UUID.randomUUID().toString().replace("-", ""));
        sc.nextLine();
        System.out.println("Enter name Service: ");
        services.setServiceName(sc.nextLine());
        sc.nextLine();
        System.out.println("Enter Area Use: ");
        services.setUseArea(sc.nextDouble());
        System.out.println("Enter Rent Fee: ");
        services.setRentFee(sc.nextInt());
        System.out.println("Enter Max Of People:");
        services.setMaxOfPeople(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Rent Type");
        services.setRentType(sc.nextLine());
        return services;
    }


    public static void addNewVilla() {
        Services villa = new Villa();
        addNewService(villa);
        System.out.println("Enter Standard Room: ");
        ((Villa) villa).setStandardRoom(sc.nextLine());
        System.out.println("Other Comfort Description");
        ((Villa) villa).setOtherComfortDescription(sc.nextLine());
        System.out.println("Pool Area");
        ((Villa) villa).setPoolArea(sc.nextLine());
        System.out.println("Number Of Floors");
        ((Villa) villa).setNumberOfFloors(sc.nextInt());

        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        listVilla.add((Villa) villa);
        FuncWriteFileCSV.writeVillaToFileCSV(listVilla);
        System.out.println("\n Add Villa: " + villa.getServiceName() + "OK");
        backMainMenu();
    }

    public static void addNewHouse() {
        Services house = new House();
        addNewService(house);
        System.out.println("Enter Standard Room: ");
        ((House) house).setStandardRoom(sc.nextLine());
        System.out.println("Other Comfort Description");
        ((House) house).setOtherComfortDescription(sc.nextLine());
        System.out.println("Number Of Floors");
        ((House) house).setNumberOfFloors(sc.nextInt());

        ArrayList<House> listHouse = new ArrayList<House>();
        listHouse.add((House) house);
        FuncWriteFileCSV.writeHouseToFileCSV(listHouse);
        System.out.println("\n Add House: " + house.getServiceName() + "OK");
        backMainMenu();
    }

    public static void addNewRoom() {
        Services room = new Room();
        addNewService(room);
        System.out.println("Service Free: ");
        ((Room) room).setServiceFree(sc.nextLine());

        ArrayList<Room> listRoom = new ArrayList<Room>();
        listRoom.add((Room) room);
        FuncWriteFileCSV.writeRoomToFileCSV(listRoom);
        System.out.println("\n Add House: " + room.getServiceName() + "OK");
        backMainMenu();
    }

    private static void showAllVilla() {
        ArrayList<Villa> listVilla = FuncWriteFileCSV.getVillaFromCSV();
        for (Villa villa : listVilla) {
            System.out.println("\n--------------------------------------");
            System.out.println(villa.showInfor());
            System.out.println("\n--------------------------------------");
        }
        sc.nextLine();
        backMainMenu();
    }

    private static void showAllHouse() {
        ArrayList<House> listHouse = FuncWriteFileCSV.getHouseFromCSV();
        for (House house : listHouse) {
            System.out.println("\n--------------------------------------");
            System.out.println(house.showInfor());
            System.out.println("\n--------------------------------------");
        }
        sc.nextLine();
        backMainMenu();
    }

    private static void showAllRoom () {
        ArrayList<Room> listRoom = FuncWriteFileCSV.getRoomFromCSV();
        for (Room room : listRoom) {
            System.out.println("\n--------------------------------------");
            System.out.println(room.showInfor());
            System.out.println("\n--------------------------------------");
        }
        sc.nextLine();
        backMainMenu();
    }

    public static void backMainMenu () {
        System.out.println("\n Enter continue...");
        sc.nextLine();
        System.out.println("\n--------------------------");
        displayMainMenu();
    }
}