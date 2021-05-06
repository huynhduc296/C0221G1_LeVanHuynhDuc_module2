package controler;

import file.FileUtils;
import module.*;
import vaidatecheck.*;

import javax.xml.bind.ValidationException;
import java.text.ParseException;
import java.util.*;

public class NewServies {
    public static void addVilla() {
        System.out.println("Nhập thông tin");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập id");
        String id;
        do {
            id = scanner.nextLine();
            if (CheckInformation.validateVillaCode(id)) {
                break;
            }
            System.out.println("---Input false, try again---");
        } while (true);

        System.out.println("nhập tên dịch vụ massage|karaoke|food|drink|car");
        String serviceName;
        do {
            serviceName = scanner.nextLine();
            if (CheckInformation.validateInclusionServices(serviceName)) {
                break;
            }
            System.out.println("---Input false, try again---");
        } while (true);
        System.out.println("diện tích sử dụng");
        String acreageUsed = scanner.nextLine();
        System.out.println("Chi phí thuê");
        String rentalCosts = scanner.nextLine();
        System.out.println("Số luongj người tối đa");
        String maximumPeople = scanner.nextLine();
        System.out.println("Kiểu thuê Year|Month|Day|Hour");
        String rentalType;
        do {
            rentalType = scanner.nextLine();
            if (CheckInformation.validateRentalType(rentalType)) {
                break;
            }
            System.out.println("---Input false, try again---");
        } while (true);
        System.out.println("Tiêu chuẩn phòng");
        String standard = scanner.nextLine();
        System.out.println("Tiện nghi khác");
        String otherAmenities = scanner.nextLine();
        System.out.println("Diện tích hồ bơi");
        String acreagePool = scanner.nextLine();
        System.out.println("Số tầng");
        String floors = scanner.nextLine();
        Villa villa = new Villa(id, serviceName, Integer.parseInt(acreageUsed), Integer.parseInt(rentalCosts), Integer.parseInt(maximumPeople), rentalType, standard, otherAmenities, Integer.parseInt(acreagePool), Integer.parseInt(floors));
        FileUtils fileUtils = new FileUtils();
        fileUtils.writeFile("D:\\casetudy2\\src\\file\\villa.csv", villa, true);
    }
    public static void addHouse() {
        System.out.println("Nhập thông tin");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập id");
        String id;
        do {
            id = scanner.nextLine();
            if (CheckInformation.validateHouseCode(id)) {
                break;
            }
            System.out.println("---Input false, try again---");
        } while (true);

        System.out.println("nhập tên dịch vụ massage|karaoke|food|drink|car");

        String serviceName;
        do {
            serviceName = scanner.nextLine();
            if (CheckInformation.validateInclusionServices(serviceName)) {
                break;
            }
            System.out.println("---Input false, try again---");
        } while (true);
        System.out.println("diện tích sử dụng");
        String acreageUsed = scanner.nextLine();
        System.out.println("Chi phí thuê");
        String rentalCosts = scanner.nextLine();
        System.out.println("Số luongj người tối đa");
        String maximumPeople = scanner.nextLine();
        System.out.println("Kiểu thuê Year|Month|Day|Hour");
        String rentalType;
        do {
            rentalType = scanner.nextLine();
            if (CheckInformation.validateRentalType(rentalType)) {
                break;
            }
            System.out.println("---Input false, try again---");
        } while (true);
        System.out.println("Tiêu chuẩn phòng");
        String standard = scanner.nextLine();
        System.out.println("Tiện nghi khác");
        String otherAmenities = scanner.nextLine();
        System.out.println("Số tầng");
        String floors = scanner.nextLine();
        House house = new House(id, serviceName, Integer.parseInt(acreageUsed), Integer.parseInt(rentalCosts), Integer.parseInt(maximumPeople), rentalType, standard, otherAmenities,Integer.parseInt(floors));
        FileUtils fileUtils = new FileUtils();
        fileUtils.writeFile("D:\\casetudy2\\src\\file\\house.csv",house , true);
    }
    public static void addRoom() {
        System.out.println("Nhập thông tin");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id");
        String id;
        do {
            id = scanner.nextLine();
            if (CheckInformation.validateRoomCode(id)) {
                break;
            }
            System.out.println("---Input false, try again---");
        } while (true);
        System.out.println("nhập tên dịch vụ massage|karaoke|food|drink|car");
        String serviceName;
        do {
            serviceName = scanner.nextLine();
            if (CheckInformation.validateInclusionServices(serviceName)) {
                break;
            }
            System.out.println("---Input false, try again---");
        } while (true);
        System.out.println("diện tích sử dụng");
        String acreageUsed = scanner.nextLine();
        System.out.println("Chi phí thuê");
        String rentalCosts = scanner.nextLine();
        System.out.println("Số luongj người tối đa");
        String maximumPeople = scanner.nextLine();
        System.out.println("Kiểu thuê Year|Month|Day|Hour");
        String rentalType;
        do {
            rentalType = scanner.nextLine();
            if (CheckInformation.validateRentalType(rentalType)) {
                break;
            }
            System.out.println("---Input false, try again---");
        } while (true);
        System.out.println("Tiêu chuẩn phòng");
        String standard = scanner.nextLine();
        System.out.println("Tiện nghi khác");
        Room room = new Room(id, serviceName, Integer.parseInt(acreageUsed), Integer.parseInt(rentalCosts), Integer.parseInt(maximumPeople), rentalType,standard);
        FileUtils fileUtils = new FileUtils();
        fileUtils.writeFile("D:\\casetudy2\\src\\file\\room.csv",room ,true);
    }

    public static List<Villa> showVilla() {
        List<Villa> list = new ArrayList<>(read());
        for (Villa villa : list) {
            System.out.println(villa.showInfor());
        }
        return list;
    }

    public static List<Villa> read() {
        FileUtils fileUtils = new FileUtils();
        List<String[]> listLine = new ArrayList<>(fileUtils.readerFile("D:\\casetudy2\\src\\file\\villa.csv"));
        List<Villa> villaArrayList = new ArrayList<>();
        for (String[] strings : listLine) {
            Villa villa = new Villa();
            villa.setId(strings[0]);
            villa.setServiceName(strings[1]);
            villa.setAcreageUsed(Integer.parseInt(strings[2]));
            villa.setRentalCosts(Integer.parseInt(strings[3]));
            villa.setMaximumPeople(Integer.parseInt(strings[4]));
            villa.setRentalType(strings[5]);
            villa.setStandardRoom(strings[6]);
            villa.setOtherAmenities(strings[7]);
            villa.setAcreagePool(Integer.parseInt(strings[8]));
            villa.setFloors(Integer.parseInt(strings[9]));
            villaArrayList.add(villa);
        }
        return villaArrayList;
    }
    public static List<House> showHouse() {
        List<House> list = new ArrayList<>(read1());
        for (House house : list) {
            System.out.println(house.showInfor());
        }
        return list;
    }
    public static List<House> read1() {
        FileUtils fileUtils = new FileUtils();
        List<String[]> listLine = new ArrayList<>(fileUtils.readerFile("D:\\casetudy2\\src\\file\\house.csv"));
        List<House> villaArrayList = new ArrayList<>();
        for (String[] strings : listLine) {
            House house = new House();
            house.setId(strings[0]);
            house.setServiceName(strings[1]);
            house.setAcreageUsed(Integer.parseInt(strings[2]));
            house.setRentalCosts(Integer.parseInt(strings[3]));
            house.setMaximumPeople(Integer.parseInt(strings[4]));
            house.setRentalType(strings[5]);
            house.setStandardRoom(strings[6]);
            house.setOtherAmenities(strings[7]);
            house.setFloors(Integer.parseInt(strings[8]));
            villaArrayList.add(house);
        }
        return villaArrayList;
    }
    public static List<Room> showRoom() {
        List<Room> list = new ArrayList<>(read2());
        for (Room room : list) {
            System.out.println(room.showInfor());
        }
        return list;
    }
    public static List<Room> read2() {
        FileUtils fileUtils = new FileUtils();
        List<String[]> listLine = new ArrayList<>(fileUtils.readerFile("D:\\casetudy2\\src\\file\\room.csv"));
        List<Room> villaArrayList = new ArrayList<>();
        for (String[] strings : listLine) {
            Room room = new Room();
            room.setId(strings[0]);
            room.setServiceName(strings[1]);
            room.setAcreageUsed(Integer.parseInt(strings[2]));
            room.setRentalCosts(Integer.parseInt(strings[3]));
            room.setMaximumPeople(Integer.parseInt(strings[4]));
            room.setRentalType(strings[5]);
            room.setFreeService(strings[6]);

            villaArrayList.add(room);
        }
        return villaArrayList;
    }

    public static void addCustomer() {
        CheckInformation checkInformation=new CheckInformation();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên khách hàng");
        String fullName;
        while (true) {
            try {
                fullName = checkInformation.inputNameCustomer();
                break;
            } catch ( NameException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Nhập ngày tháng năm sinh");
        String dateOfBirth;
        while (true) {
            try {
                dateOfBirth = checkInformation.inputDateOfBirth();
                break;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Nhập giới tính ");
        String gender;
        while (true) {
            try {
                gender = checkInformation.inputGenderCustomer();
                break;
            } catch (GenderException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Nhập số CMND");
        String idCard;
        while (true) {
            try {
                idCard = checkInformation.inputIdCardCustomer();
                break;
            } catch (IdCardException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Nhập số điên thoại");
        String phoneNumber=scanner.nextLine();
        System.out.println("Nhập email");
        String email;
        while (true) {
            try {
                email = checkInformation.inputEmailCustomer();
                break;
            } catch (EmailException e) {
                e.printStackTrace();
            }
        }
        System.out.println("kiểu khách hàng");
        String typeOFCustomer=scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address=scanner.nextLine();
        Customer customer = new Customer(fullName,dateOfBirth,gender,idCard,phoneNumber,email,typeOFCustomer,address);
        FileUtils fileUtils = new FileUtils();
        fileUtils.writeFile("D:\\casetudy2\\src\\file\\customer.csv", customer, true);
    }

    public static List<Customer> showCustomer() {
        List<Customer> list = new ArrayList<>(read3());
        for (Customer customer: list) {
            System.out.println(customer.showInfor());
        }
        return list;
    }
    public static void showRoomListNotDuplicate() {
        Set<Room>roomSet = new TreeSet<>(read2());
        int size = roomSet.size();
        if (size ==0){
            System.out.println("Villa's list is empty");
            System.out.println("---------------------");
        }
        for (Room room : roomSet) {
            System.out.println(room.showInfor());
        }
    }
    public static void showHouseListNotDuplicate() {
        Set<House> houseSet = new TreeSet<>(read1());
        int size = houseSet.size();
        if (size ==0){
            System.out.println("Villa's list is empty");
            System.out.println("---------------------");
        }
        for (House house : houseSet) {
            System.out.println(house.showInfor());
        }
    }
    public static void showVillaListNotDuplicate() {
        Set<Villa> villaSet = new TreeSet<>(read());
        int size = villaSet.size();
        if (size ==0){
            System.out.println("Villa's list is empty");
            System.out.println("---------------------");
        }
        for (Villa villa : villaSet) {
            System.out.println(villa.showInfor());
        }
    }


    public static List<Customer> read3() {
        FileUtils fileUtils = new FileUtils();
        List<String[]> listLine = new ArrayList<>(fileUtils.readerFile("D:\\casetudy2\\src\\file\\customer.csv"));
        List<Customer> villaArrayList = new ArrayList<>();
        for (String[] strings : listLine) {
            Customer customer = new Customer();
            customer.setFullName(strings[0]);
            customer.setDateOfbirth(strings[1]);
            customer.setGender(strings[2]);
            customer.setIdCardNumber(strings[3]);
            customer.setPhoneNumber(strings[4]);
            customer.setEmail(strings[5]);
            customer.setTypeOfGuests(strings[6]);
            customer.setAddress(strings[7]);

            villaArrayList.add(customer);
        }
        return villaArrayList;
    }
    public void  validateError(int numOfChoose, int numIn)throws ValidationException {
        if (numIn <= 0 || numIn > numOfChoose) {
            throw new ValidationException("có các lựa chọn từ 1 đến" + numOfChoose);
        }
    }
}
