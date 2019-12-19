package CaseStudy.Commons;

import CaseStudy.Models.Villa;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FuncWriteFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static String pathVilla = "src/data/Villa.csv";
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
}
