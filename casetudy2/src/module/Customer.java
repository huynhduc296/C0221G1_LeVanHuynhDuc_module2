package module;

public class Customer implements Comparable<Customer> {
    private String fullName;
    private String dateOfbirth;
    private String gender;
    private String idCardNumber;
    private String phoneNumber;
    private String email;
    private String typeOfGuests;
    private String address;
    private Services services;

    public Customer(String fullName, String dateOfbirth, String gender, String idCardNumber, String phoneNumber, String email, String typeOfGuests, String address) {
        this.fullName = fullName;
        this.dateOfbirth = dateOfbirth;
        this.gender = gender;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfGuests = typeOfGuests;
        this.address = address;
    }

    public Customer(String[] strings,Services service) {
        this.fullName = strings[0];
        this.dateOfbirth = strings[1];
        this.gender = strings[2];
        this.idCardNumber = strings[3];
        this.phoneNumber = strings[4];
        this.email = strings[5];
        this.typeOfGuests = strings[6];
        this.address = strings[7];
        this.services = service;
    }
   public Customer (){

   }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfGuests() {
        return typeOfGuests;
    }

    public void setTypeOfGuests(String typeOfGuests) {
        this.typeOfGuests = typeOfGuests;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfor(){
        if(getServices()!=null){
            return "Customer{" +
                    "FullName='" + fullName + '\'' +
                    ", birthday='" + dateOfbirth + '\'' +
                    ", gender='" + gender + '\'' +
                    ", IDCard='" + idCardNumber + '\'' +
                    ", phonenumber='" + phoneNumber + '\'' +
                    ", email='" + email + '\'' +
                    ", customertype='" + typeOfGuests + '\'' +
                    ", address='" + address + '\'' +
                    ", service='" + services.showInfor()+
                    "'}";
        }
        return "Customer{" +
                "FullName='" + fullName + '\'' +
                ", birthday='" + dateOfbirth + '\'' +
                ", gender='" + gender + '\'' +
                ", IDCard='" + idCardNumber + '\'' +
                ", phonenumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", customertype='" + typeOfGuests + '\'' +
                ", address='" + address + '\'' +
                ", service='" + services+
                "'}";
    }
    @Override
    public String toString() {
        String string= fullName +","+ dateOfbirth +","+ gender +","+ idCardNumber  +","+phoneNumber +","+email  +","+ typeOfGuests  +","+ address;
        if (services != null) {
            string += "," + services.toString();
        }
        return string;
    }

    @Override
    public int compareTo(Customer o) {
        int result = this.getFullName().compareTo(o.getFullName());
        if (result == 0) {
            return this.getDateOfbirth().compareTo(o.getDateOfbirth());
        }
        return result;
    }
}
