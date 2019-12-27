package CaseStudy.Models;

public class Customer {
    private String idCustomer;
    private String nameCustomer;
    private String birthday;
    private String gender;
    private int idCard;
    private int phoneNumber;
    private String emailCustomer;
    private String typeCustomer;
    private String addressCustomer;
    private Services services;

    public Customer() {
    }

    public Customer(String idCustomer,String nameCustomer, String birthday, String gender, int idCard, int phoneNumber, String emailCustomer, String typeCustomer, String addressCustomer, Services services) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.emailCustomer = emailCustomer;
        this.typeCustomer = typeCustomer;
        this.addressCustomer = addressCustomer;
        this.services = services;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfor(){
        return  "ID Customer: "+ getIdCustomer()+
                "Name: " + getNameCustomer()+
                "\n Birthday: " + getBirthday()+
                "\nGender: " +getGender()+
                "\nID Card: " + getIdCard()+
                "\nPhone Number: "+ getPhoneNumber()+
                "\nEmail: "+ getEmailCustomer()+
                "\nType: "+ getTypeCustomer()+
                "\nAddress: "+getAddressCustomer()
                +"\n----------------------------------------------------";
    }
}
