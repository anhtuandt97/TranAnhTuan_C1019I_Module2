package CaseStudy.Models;

public abstract class Services {
    private String serviceName;
    private  String useArea;
    private double rentFee;
    private int maxOfPeople;
    private String rentType;
    private String id;

    public Services() {
    }

    public Services(String serviceName, String useArea, double rentFee, int maxOfPeople, String rentType, String id) {
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.rentFee = rentFee;
        this.maxOfPeople = maxOfPeople;
        this.rentType = rentType;
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUseArea() {
        return useArea;
    }

    public void setUseArea(String useArea) {
        this.useArea = useArea;
    }

    public double getRentFee() {
        return rentFee;
    }

    public void setRentFee(double rentFee) {
        this.rentFee = rentFee;
    }

    public int getMaxOfPeople() {
        return maxOfPeople;
    }

    public void setMaxOfPeople(int maxOfPeople) {
        this.maxOfPeople = maxOfPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract String showInfor();
}
