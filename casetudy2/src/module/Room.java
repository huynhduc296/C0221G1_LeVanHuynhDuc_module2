package module;

public class Room extends Services implements Comparable<Room> {
    private String freeService;
    public Room(){
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String serviceName, int acreageUsed, int rentalCosts, int maximumPeople, String rentalType, String freeService) {
        super(id, serviceName, acreageUsed, rentalCosts, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    @Override
        public String toString() { return super.toString()+","+freeService;
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
                ", standardRoom='" +freeService+ '\'' +
                '}';
    }

    @Override
    public int compareTo(Room room) {
        return getServiceName().compareTo(room.getServiceName());
    }
}
