package CaseStudy.Commons;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FuncWriteFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static String pathVilla = "src/CaseStudy/data/Villa.csv";
    private static String[] headerRecordVilla = new String[]{ "serviceName", "useArea","rentFee","maxOfPeople",
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
}