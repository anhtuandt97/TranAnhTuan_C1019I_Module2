package CaseStudy.Commons;

import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

public class FuncWriteFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final int NUM_OF_LINE_SKIP =1;
    private static String pathVilla = "src/CaseStudy/data/Villa.csv";
    private static String[] headerRecordVilla = new String[]{"serviceName", "useArea","rentFee","maxOfPeople",
            "rentType","id","standardRoom","otherComfortDescription","poolArea","numberOfFloors"};
    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList){
        try(Writer writer = new FileWriter(pathVilla);
            CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(headerRecordVilla);
            for(Villa villa: arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getServiceName(),
                        String.valueOf(villa.getUseArea()),
                        String.valueOf(villa.getRentFee()),
                        String.valueOf(villa.getMaxOfPeople()),
                        villa.getRentType(),
                        villa.getId(),
                        villa.getStandardRoom(),
                        villa.getOtherComfortDescription(),
                        String.valueOf(villa.getPoolArea()),
                        String.valueOf(villa.getNumberOfFloors()),
                });
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static String pathHouse = "src/CaseStudy/data/House.csv";
    private static String[] headerRecordHouse = new String[]{ "serviceName", "useArea","rentFee","maxOfPeople",
            "rentType","id","standardRoom","otherComfortDescription","numberOfFloors"};
    public static void writeHouseToFileCSV(ArrayList<House> arrayList){
        try(Writer writer = new FileWriter(pathHouse);
            CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(headerRecordHouse);
            for(House house: arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getServiceName(),
                        String.valueOf(house.getUseArea()),
                        String.valueOf(house.getRentFee()),
                        String.valueOf(house.getMaxOfPeople()),
                        house.getRentType(),
                        house.getId(),
                        house.getStandardRoom(),
                        house.getOtherComfortDescription(),
                        String.valueOf(house.getNumberOfFloors())
                });
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static String pathRoom = "src/CaseStudy/data/Room.csv";
    private static String[] headerRecordRoom = new String[]{ "serviceName", "useArea","rentFee","maxOfPeople",
            "rentType","id","serviceFree"};
    public static void writeRoomToFileCSV(ArrayList<Room> arrayList){
        try(Writer writer = new FileWriter(pathRoom);
            CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordRoom);
            for(Room room: arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getServiceName(),
                        String.valueOf(room.getUseArea()),
                        String.valueOf(room.getRentFee()),
                        String.valueOf(room.getMaxOfPeople()),
                        room.getRentType(),
                        room.getId(),
                        room.getServiceFree()
                });
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static String pathCustomer = "src/CaseStudy/data/Customer.csv";
    private static String[] headerRecordCustomer = new String[]{ "idCustomer","nameCustomer", "birthday","gender","idCard",
            "phoneNumber","emailCustomer","typeCustomer","addressCustomer"};
    public static void writeCustomerToFileCSV(ArrayList<Customer> arrayList){
        try(Writer writer = new FileWriter(pathCustomer);
            CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordCustomer);
            for(Customer customer: arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getIdCustomer(),
                        customer.getNameCustomer(),
                        customer.getBirthday(),
                        customer.getGender(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getPhoneNumber()),
                        customer.getEmailCustomer(),
                        customer.getTypeCustomer(),
                        customer.getAddressCustomer()
                });
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Customer>getCustomerFromCSV(){
        Path path = Paths.get(pathCustomer);
        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(pathCustomer);
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);

        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>)csvToBean.parse();
    }

    public static ArrayList<Villa>getVillaFromCSV(){
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(pathVilla);
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);

        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>)csvToBean.parse();
    }

    public static ArrayList<Room>getRoomFromCSV(){
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(pathRoom);
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);

        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Room>)csvToBean.parse();
    }

    public static ArrayList<House>getHouseFromCSV(){
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(pathHouse);
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);

        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>)csvToBean.parse();
    }

    private static String pathBooking = "src/CaseStudy/data/Booking.csv";
    private static String[] headerRecordBooking = new String[]{"idCustomer","nameCustomer", "birthday","gender","idCard",
            "phoneNumber","emailCustomer","typeCustomer","addressCustomer","serviceName", "useArea","rentFee","maxOfPeople",
            "rentType","id"};
    public static ArrayList<Customer>getBookingFromCSV(){
        Path path = Paths.get(pathBooking);
        if (!Files.exists(path)){
            try {
                Writer writer = new FileWriter(pathBooking);
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordBooking);

        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathBooking))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>)csvToBean.parse();
    }

    public static void writeBookingToFileCSV(ArrayList<Customer> arrayList){
        try(Writer writer = new FileWriter(pathBooking);
            CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(headerRecordBooking);
            for(Customer customer: arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getIdCustomer(),
                        customer.getNameCustomer(),
                        customer.getBirthday(),
                        customer.getGender(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getPhoneNumber()),
                        customer.getEmailCustomer(),
                        customer.getTypeCustomer(),
                        customer.getAddressCustomer(),
                        customer.getServices().getServiceName(),
                        String.valueOf(customer.getServices().getUseArea()),
                        String.valueOf(customer.getServices().getRentFee()),
                        String.valueOf(customer.getServices().getMaxOfPeople()),
                        customer.getServices().getRentType(),
                        customer.getServices().getId(),

                });
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static TreeSet<String>getAllServiceFromCSV(String path){
        BufferedReader br = null;
        TreeSet<String>result = new TreeSet<String>();
        try {
            String line;
            br = new BufferedReader(new FileReader(path));
            while(( br.readLine() !=null)){
                line=br.readLine();
                if(getNameServiceFromFile(line).equals("NameService")){
                    continue;
                }
                result.add(getNameServiceFromFile(line));
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public  static TreeSet<String> getNameServiceFromFile(String scvLine) {
        String name = "";
        if (scvLine != null){
            String[] splitData = scvLine.split(",");
            name = splitData[1];
        }
        return name;
    }
}