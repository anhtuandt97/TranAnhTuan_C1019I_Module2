package CaseStudy.Models;

public class Villa extends Services {
    String standardRoom;
    String otherComfortDescription;
    String poolArea;
    int numberOfFloors;

    public Villa() {
    }


    public Villa(String serviceName, String useArea, double rentFee, int maxOfPeople, String rentType, String id, String standardRoom, String otherComfortDescription, String poolArea, int numberOfFloors) {
        super(serviceName, useArea, rentFee, maxOfPeople, rentType, id);
        this.standardRoom = standardRoom;
        this.otherComfortDescription = otherComfortDescription;
        this.poolArea = poolArea;
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

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
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
                +"\n Diện tích hồ bơi: " + getPoolArea()
                +"\n Số tầng: " + getNumberOfFloors()
                +"\n----------------------------------------------------";
    }
}
