package module;

public class House extends Services implements Comparable<House>{
    private String standardRoom;
    private String otherAmenities;
    private int floors;

    public House() {
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

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public House(String id, String serviceName, int acreageUsed, int rentalCosts, int maximumPeople, String rentalType, String standardRoom, String otherAmenities, int floors) {
        super(id, serviceName, acreageUsed, rentalCosts, maximumPeople, rentalType);
        this.standardRoom = standardRoom;
        this.otherAmenities = otherAmenities;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return super.toString()+","+standardRoom+","+otherAmenities+","+floors;
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
                ", standardRoom='" + standardRoom+ '\'' +
                ", otherAmenities='" + otherAmenities + '\'' +
                ", floors='" + floors+ '\'' +
                '}';
    }
    @Override
    public int compareTo(House house) {
        return getServiceName().compareTo(house.getServiceName());
    }
}
