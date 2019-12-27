package CaseStudy.Controllers;

import CaseStudy.Commons.FuncValidation;
import CaseStudy.Commons.FuncWriteFileCSV;
import CaseStudy.Models.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    private static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println("1.Add New Services\n"
                + "2.Show Services\n"
                + "3.Add New Customer\n"
                + "4.Show Information Customer\n"
                + "5.Add New Booking Resort\n"
                + "6.Exit\n");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                addNewService();
                break;
            case 2:
                showService();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                showInformationCustomer();
                backMainMenu();
                break;
            case 5:
                addNewBookingResort();
                break;
            case 6:
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
        System.out.println( "1. Show New Villa\n"
                + "2. Show New House\n"
                + "3. Show New Room\n"
                + "4. Show All Name Villa Not Duplicate\n"
                + "5. Show All Name House Not Duplicate\n"
                + "6. Show All Name Name Not Duplicate\n"
                + "7. Back to menu\n"
                + "8. Exit\n");
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
        String content = "";
        String errMess = "";

        services.setId(UUID.randomUUID().toString().replace("-", ""));
        sc.nextLine();
        System.out.println("Enter name Service: ");
        services.setServiceName(sc.nextLine());
        while(!FuncValidation.checkName(services.getServiceName())){
            System.out.println("Service Name is validate. Please try again!!!");
            System.out.println("Enter Name Service: ");
            services.setServiceName(sc.nextLine());
        }


        content ="Enter Area Use:";
        errMess = "Area Use is invalid (Area > 30, Area must be a Double). Please try again!!!";
        services.setUseArea(FuncValidation.checkValidNumberDouble(content, errMess));
        while (services.getUseArea()<=30) {
            System.out.println(errMess);
            services.setUseArea(FuncValidation.checkValidNumberDouble(content, errMess));
        }

        content ="Enter Rent Fee:";
        errMess = "Rent Fee is invalid (Rent Fee > 0, Area must be a Double). Please try again!!!";
        services.setRentFee(FuncValidation.checkValidNumberDouble(content, errMess));
        while (services.getRentFee()<=0) {
            System.out.println(errMess);
            services.setRentFee(FuncValidation.checkValidNumberDouble(content, errMess));
        }

        content ="Enter Max Of People:";
        errMess = "Max Of People is invalid (People > 0, Area must be a Integer). Please try again!!!";
        services.setMaxOfPeople(FuncValidation.checkValidNumberInteger(content, errMess));
        while (services.getMaxOfPeople()<=0||services.getMaxOfPeople()>=20) {
            System.out.println(errMess);
            services.setMaxOfPeople(FuncValidation.checkValidNumberInteger(content, errMess));
        }


        System.out.println("Enter Rent Type");
        services.setRentType(sc.nextLine());
        while(!FuncValidation.checkName(services.getRentType())){
            System.out.println("Rent Type is validate. Please try again!!!");
            System.out.println("Enter Rent Type: ");
            services.setRentType(sc.nextLine());
        }
        return services;
    }


    public static void addNewVilla() {
        String content = "";
        String errMess = "";
        Services villa = new Villa();
        addNewService(villa);
        System.out.println("Enter Standard Room: ");
        ((Villa) villa).setStandardRoom(sc.nextLine());
        while(!FuncValidation.checkName(((Villa) villa).getStandardRoom())){
            System.out.println("Standard Room is validate. Please try again!!!");
            System.out.println("Enter Standard Room: ");
            ((Villa) villa).setStandardRoom(sc.nextLine());
        }

        System.out.println("Enter Other Comfort Description");
        ((Villa) villa).setOtherComfortDescription(sc.nextLine());
        while(!FuncValidation.checkName(((Villa) villa).getOtherComfortDescription())){
            System.out.println("Other Comfort Description is validate. Please try again!!!");
            System.out.println("Enter Other Comfort Description: ");
            ((Villa) villa).setOtherComfortDescription(sc.nextLine());
        }


        content ="Enter Pool Area :";
        errMess = "Pool Area  is invalid (Pool Area > 30, Area must be a Double). Please try again!!!";
        ((Villa) villa).setPoolArea(FuncValidation.checkValidNumberDouble(content, errMess));
        while (((Villa) villa).getUseArea()<=30) {
            System.out.println(errMess);
            ((Villa) villa).setUseArea(FuncValidation.checkValidNumberDouble(content, errMess));
        }

        content ="Enter Number Of Floors :";
        errMess = "Number Of Floors  is invalid (Number Of Floors > 0, Area must be a Integer). Please try again!!!";
        ((Villa) villa).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMess));
        while (((Villa) villa).getNumberOfFloors()<0) {
            System.out.println(errMess);
            ((Villa) villa).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMess));
        }

        // cach khac phuc khoong luu dc nhieu villa trong file
        //truoc khi thuc hien them 1 file chung ta lay ra toan bo danh sach villa trong file villa ra listvilla

        ArrayList<Villa> listVilla = FuncWriteFileCSV.getVillaFromCSV();
        //sau khi thuc hien xong thi thuc hien them vao danh sach listvilla do
        listVilla.add((Villa) villa);
        //sau do luu list villa vao file Villa.CSV
        FuncWriteFileCSV.writeVillaToFileCSV(listVilla);
        System.out.println("\n Add Villa: " + villa.getServiceName() + "  OK");
        backMainMenu();
    }

    public static void addNewHouse() {
        String content = "";
        String errMess = "";
        Services house = new House();
        addNewService(house);
        System.out.println("Enter Standard Room: ");
        ((House) house).setStandardRoom(sc.nextLine());
        while(!FuncValidation.checkName(((House) house).getStandardRoom())){
            System.out.println("Standard Room is validate. Please try again!!!");
            System.out.println("Enter Standard Room: ");
            ((House) house).setStandardRoom(sc.nextLine());
        }

        System.out.println("Enter Other Comfort Description");
        ((House) house).setOtherComfortDescription(sc.nextLine());
        while(!FuncValidation.checkName(((House) house).getOtherComfortDescription())){
            System.out.println("Other Comfort Description is validate. Please try again!!!");
            System.out.println("Enter Other Comfort Description: ");
            ((House) house).setOtherComfortDescription(sc.nextLine());
        }

        content ="Enter Number Of Floors :";
        errMess = "Number Of Floors  is invalid (Number Of Floors > 0, Area must be a Integer). Please try again!!!";
        ((House) house).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMess));
        while (((House) house).getNumberOfFloors()<0) {
            System.out.println(errMess);
            ((House) house).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMess));
        }

        ArrayList<House> listHouse = FuncWriteFileCSV.getHouseFromCSV();
        listHouse.add((House) house);
        FuncWriteFileCSV.writeHouseToFileCSV(listHouse);
        System.out.println("\n Add House: " + house.getServiceName() + "  OK");
        backMainMenu();
    }

    public static void addNewRoom() {
        Services room = new Room();
        addNewService(room);
        System.out.println("Enter Service Free: ");
        ((Room) room).setServiceFree(sc.nextLine());
        while(!FuncValidation.checkFreeService(((Room) room).getServiceFree())){
            System.out.println("Service Free is validate. Please try again!!!");
            System.out.println("Service Free Service: ");
            ((Room) room).setServiceFree(sc.nextLine());
        }

        ArrayList<Room> listRoom = FuncWriteFileCSV.getRoomFromCSV();
        listRoom.add((Room) room);
        FuncWriteFileCSV.writeRoomToFileCSV(listRoom);
        System.out.println("\n Add House: " + room.getServiceName() + "  OK");
        backMainMenu();
    }

    private static void showAllVilla() {
        ArrayList<Villa> listVilla = FuncWriteFileCSV.getVillaFromCSV();
        for (Villa villa : listVilla) {
            System.out.println("\n--------------------------------------");
            System.out.println(villa.showInfor());
            System.out.println("\n--------------------------------------");
        }
        backMainMenu();
    }

    private static void showAllHouse() {
        ArrayList<House> listHouse = FuncWriteFileCSV.getHouseFromCSV();
        for (House house : listHouse) {
            System.out.println("\n--------------------------------------");
            System.out.println(house.showInfor());
            System.out.println("\n--------------------------------------");
        }
        backMainMenu();
    }

    private static void showAllRoom () {
        ArrayList<Room> listRoom = FuncWriteFileCSV.getRoomFromCSV();
        for (Room room : listRoom) {
            System.out.println("\n--------------------------------------");
            System.out.println(room.showInfor());
            System.out.println("\n--------------------------------------");
        }
        backMainMenu();
    }

    private static void addNewCustomer(){
        Customer customer = new Customer();
        customer.setIdCustomer(UUID.randomUUID().toString().replace("-", ""));
        sc.nextLine();
        System.out.println("Enter Name Customer: ");
        customer.setNameCustomer(sc.nextLine());
        while(!FuncValidation.checkName(customer.getNameCustomer())){
            System.out.println("Name Customer is validate. Please try again!!!");
            System.out.println("Enter Name Customer: ");
            customer.setNameCustomer(sc.nextLine());
        }

        System.out.println("Enter Birthday Customer(DD/MM/YYYY): ");
        customer.setBirthday(sc.nextLine());
        while(!FuncValidation.checkBirthday(customer.getBirthday())){
            System.out.println("Birthday Customer is validate. Year from 1990 to 2002. Please try again!!!");
            System.out.println("Enter Birthday Customer: ");
            customer.setBirthday(sc.nextLine());
        }

        System.out.println("Enter Gender Customer: ");
        customer.setGender(sc.nextLine());
        String gender = customer.getGender();
        gender = gender.substring(0,1).toUpperCase()+gender.substring(1).toLowerCase();
        while(!FuncValidation.checkGender(gender)){
            System.out.println("Gender Customer is validate. Please try again!!!");
            System.out.println("Enter Gender Customer: ");
            customer.setGender(sc.nextLine());
            gender = customer.getGender();
            gender = gender.substring(0,1).toUpperCase()+gender.substring(1).toLowerCase();
        }

        System.out.println("Enter ID Card: ");
        customer.setIdCard(sc.nextInt());
        while(!FuncValidation.checkIDCard(String.valueOf(customer.getIdCard()))){
            System.out.println("ID Card is validate. Please try again!!!");
            System.out.println("ID Card Customer: ");
            customer.setIdCard(sc.nextInt());
        }

        System.out.println("Enter Phone Number: ");
        customer.setPhoneNumber(sc.nextInt());
        while(!FuncValidation.checkPhoneNumber(String.valueOf(customer.getPhoneNumber()))){
            System.out.println("Phone Number is validate. Please try again!!!");
            System.out.println("Enter Phone Number: ");
            customer.setPhoneNumber(sc.nextInt());
        }

        sc.nextLine();
        System.out.println("Enter Email Customer: ");
        customer.setEmailCustomer(sc.nextLine());
        while(!FuncValidation.checkEmail(customer.getEmailCustomer())){
            System.out.println("Email Customer is validate. Please try again!!!");
            System.out.println("Enter Email Customer: ");
            customer.setEmailCustomer(sc.nextLine());
        }

        System.out.println("Enter Type Customer: ");
        customer.setTypeCustomer(sc.nextLine());
        while(!FuncValidation.checkName(customer.getTypeCustomer())){
            System.out.println("Email Type is validate. Please try again!!!");
            System.out.println("Enter Type Customer: ");
            customer.setEmailCustomer(sc.nextLine());
        }

        System.out.println("Enter Address Customer: ");
        customer.setAddressCustomer(sc.nextLine());
        while(!FuncValidation.checkName(customer.getAddressCustomer())){
            System.out.println("Email Address is validate. Please try again!!!");
            System.out.println("Enter Address Customer: ");
            customer.setAddressCustomer(sc.nextLine());
        }

        ArrayList<Customer> listCustomer = FuncWriteFileCSV.getCustomerFromCSV();
        listCustomer.add((Customer) customer);
        FuncWriteFileCSV.writeCustomerToFileCSV(listCustomer);
        System.out.println("\n Add Customer: " + customer.getNameCustomer() + "  OK");
        backMainMenu();
    }

    public static void showInformationCustomer(){
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.getCustomerFromCSV();
        listCustomer.sort(new SortName());
        for (Customer customer : listCustomer) {
            System.out.println("\n--------------------------------------");
            System.out.println(customer.showInfor());
            System.out.println("\n--------------------------------------");
        }
    }

    public static void addNewBookingResort(){
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.getCustomerFromCSV();
        listCustomer.sort(new SortName());
        int i = 1;
        for (Customer customer : listCustomer) {
            System.out.println("\nNo"+i);
            System.out.println(customer.showInfor());
            System.out.println("\n--------------------------------------");
            i++;
        }
        System.out.println("Choose Customer: ");
        Customer customer = listCustomer.get(sc.nextInt()-1);
        System.out.println("1. Booking Villa\n"
                + "2. Booking House\n"
                + "3. Booking Room\n"
                + "4. Back to menu\n"
                + "5. Exit\n");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                ArrayList<Villa> listVilla = FuncWriteFileCSV.getVillaFromCSV();
                int j=1;
                for (Villa villa : listVilla) {
                    System.out.println("\nNo" + j);
                    System.out.println(villa.showInfor());
                    System.out.println("\n--------------------------------------");
                    j++;
                }
                System.out.println("Choose Villa: ");
                Villa villa = listVilla.get(sc.nextInt()-1);
                customer.setServices(villa);
                ArrayList<Customer> listBookingVilla = FuncWriteFileCSV.getBookingFromCSV();
                listBookingVilla.add(customer);
                FuncWriteFileCSV.writeBookingToFileCSV(listBookingVilla);
                System.out.println("Add Successfull!!! ");
                backMainMenu();
                break;
            case 2:
                ArrayList<House> listHouse = FuncWriteFileCSV.getHouseFromCSV();
                int k=1;
                for (House house : listHouse) {
                    System.out.println("\nNo" + k);
                    System.out.println(house.showInfor());
                    System.out.println("\n--------------------------------------");
                    k++;
                }
                System.out.println("Choose House: ");
                House house = listHouse.get(sc.nextInt()-1);
                customer.setServices(house);
                ArrayList<Customer> listBookingHouse = FuncWriteFileCSV.getBookingFromCSV();
                listBookingHouse.add(customer);
                FuncWriteFileCSV.writeBookingToFileCSV(listBookingHouse);
                System.out.println("Add Successfull!!! ");
                backMainMenu();
                break;
            case 3:
                ArrayList<Room> listRoom = FuncWriteFileCSV.getRoomFromCSV();
                int h=1;
                for (Room room : listRoom) {
                    System.out.println("\nNo" + h);
                    System.out.println(room.showInfor());
                    System.out.println("\n--------------------------------------");
                    h++;
                }
                System.out.println("Choose Room: ");
                Room room = listRoom.get(sc.nextInt()-1);
                customer.setServices(room);
                ArrayList<Customer> listBookingRoom = FuncWriteFileCSV.getBookingFromCSV();
                listBookingRoom.add(customer);
                FuncWriteFileCSV.writeBookingToFileCSV(listBookingRoom);
                System.out.println("Add Successfull!!! ");
                backMainMenu();
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

    public static void backMainMenu () {
        System.out.println("\n Enter continue...");
        sc.nextLine();
        System.out.println("\n--------------------------");
        displayMainMenu();
    }
}