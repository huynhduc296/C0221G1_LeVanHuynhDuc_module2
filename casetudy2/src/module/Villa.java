package module;

public class Villa extends Services implements Comparable<Villa> {
    private String standardRoom;
    private String otherAmenities;
    private int acreagePool;
    private int floors;

    public Villa(String id, String serviceName, int acreageUsed, int rentalCosts, int maximumPeople, String rentalType, String standardRoom, String otherAmenities, int acreagePool, int floors) {
        super(id, serviceName, acreageUsed, rentalCosts, maximumPeople, rentalType);
        this.standardRoom = standardRoom;
        this.otherAmenities = otherAmenities;
        this.acreagePool = acreagePool;
        this.floors = floors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherAmenities() {
        return otherAmenities;
    }

    public void setOtherAmenities(String otherAmenities) {
        this.otherAmenities = otherAmenities;
    }

    public int getAcreagePool() {
        return acreagePool;
    }

    public void setAcreagePool(int acreagePool) {
        this.acreagePool = acreagePool;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }



    public Villa(String standardRoom, String otherAmenities, int acreagePool, int floors) {
        this.standardRoom = standardRoom;
        this.otherAmenities = otherAmenities;
        this.acreagePool = acreagePool;
        this.floors = floors;
    }

    public Villa(){
    }

    public Villa(String id, String serviceName, int acreageUsed, int rentalCosts, int maximumPeople, String rentalType) {
        super(id, serviceName, acreageUsed, rentalCosts, maximumPeople, rentalType);
    }

    @Override
    public String toString() {
        return super.toString()+","+standardRoom+","+otherAmenities+","+acreagePool+","+floors;
    }

    @Override
    public String showInfor() {
  return "Services{" +
                "id='" + getId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", acreageUsed=" + getAcreageUsed() +
                ", rentalCosts=" + getRentalCosts() +
                ", maximumPeople=" + getMaximumPeople() +
                ", rentalType='" + getRentalType() + '\'' +
                ", standardRoom='" +standardRoom+ '\'' +
                ", otherAmenities='" + otherAmenities + '\'' +
                ", acreagePool='" + acreagePool+ '\'' +
                ", floors='" +floors + '\'' +
                '}';
    }

    @Override
    public int compareTo(Villa villa) {
        return getServiceName().compareTo(villa.getServiceName());
    }
}
