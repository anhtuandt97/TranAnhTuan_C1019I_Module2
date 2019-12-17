package CaseStudy.Models;

public class Main {
    public static void main(String[] args) {
        Services services[] = new Services[3];
        services[0] = new Villa();
        services[1] = new House();
        services[2] = new Room();

        for ( Services x:services) {
            System.out.println(x.showInfor());
        }
    }
}
