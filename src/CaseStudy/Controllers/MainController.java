package CaseStudy.Controllers;


public class MainController {
    public static FuncWriteFileCSV fileCSV = new FuncWriteFileCSV();
    public static void main(String[] args) {
           fileCSV.displayMainMenu();
    }
}