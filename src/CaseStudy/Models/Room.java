package CaseStudy.Models;

public class Room extends Services {
    String serviceFree;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String showInfor() {
        return "Tên dịch vụ: " + super.getServiceName()
                +"\nDiện tích sử dụng: " + super.getUseArea()
                +"\nChi phí thuê: " + super.getRentFee()
                +"\nSố lượng người tối đa: "+ super.getMaxOfPeople()
                +"\nKiểu thuê: "+ super.getRentType()
                +"\nId: " + super.getId()
                + "\nDịch vụ miễn phí đi kèm: " + getServiceFree()
                +"\n-----------------------------------------------------------------";
    }
}
