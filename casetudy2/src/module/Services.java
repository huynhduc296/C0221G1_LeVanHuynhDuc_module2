package module;

public  abstract class Services {
    private String id;
    private String serviceName;
    private int acreageUsed;
    private int rentalCosts;
    private int maximumPeople;
    private String rentalType;

    public Services(String id, String serviceName, int acreageUsed, int rentalCosts, int maximumPeople, String rentalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.acreageUsed = acreageUsed;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }
    public Services(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getAcreageUsed() {
        return acreageUsed;
    }

    public void setAcreageUsed(int acreageUsed) {
        this.acreageUsed = acreageUsed;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() { return id +","+ serviceName +","+ acreageUsed +","+ rentalCosts +","+ maximumPeople +","+ rentalType; }

    public abstract String showInfor();

}
