package CaseStudy.Models;

public class House extends Services {
    String standardRoom;
    String otherComfortDescription;
    int numberOfFloors;

    public House() {
    }

    public House(String serviceName, String useArea, double rentFee, int maxOfPeople, String rentType, String id, String standardRoom, String otherComfortDescription, int numberOfFloors) {
        super(serviceName, useArea, rentFee, maxOfPeople, rentType, id);
        this.standardRoom = standardRoom;
        this.otherComfortDescription = otherComfortDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherComfortDescription() {
        return otherComfortDescription;
    }

    public void setOtherComfortDescription(String otherComfortDescription) {
        this.otherComfortDescription = otherComfortDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfor() {
       return "Tên dịch vụ: " + super.getServiceName()
                +"\nDiện tích sử dụng: " + super.getUseArea()
                +"\nChi phí thuê: " + super.getRentFee()
                +"\nSố lượng người tối đa: "+ super.getMaxOfPeople()
                +"\nKiểu thuê: "+ super.getRentType()
                +"\nId: " + super.getId()
                +"\nTiêu chuẩn phòng: " + getStandardRoom()
                +"\n Mô tả tiện nghi khác: " + getOtherComfortDescription()
                +"\n Số tầng: " + getNumberOfFloors()
                +"\n-------------------------------------------------------";
    }
}
