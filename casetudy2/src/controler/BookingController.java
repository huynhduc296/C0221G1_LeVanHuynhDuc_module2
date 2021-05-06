package controler;

import file.FileUtils;
import module.*;
import vaidatecheck.CheckInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingController {
    Scanner scanner = new Scanner(System.in);
    private static final String CUSTOMER_PATH = "D:\\casetudy2\\src\\file\\customer.csv";
    private static final String BOOKING_PATH = "D:\\casetudy2\\src\\file\\booking.csv";
    private static final String VILLA_PATH = "D:\\casetudy2\\src\\file\\villa.csv";
    private static final String HOUSE_PATH = "D:\\casetudy2\\src\\file\\house.csv";
    private static final String ROOM_PATH = "D:\\casetudy2\\src\\file\\room.csv";
    FileUtils rewriteFile=new FileUtils();
    FileUtils readerFile=new FileUtils();
    NewServies newServies=new NewServies();
    public void addNewBooking() {
        List<Customer> customerList = new ArrayList<>(NewServies.read3());
        int size = customerList.size();
        if (size == 0) {
            System.out.println("K có khách hàng nào cả ^^");
            System.out.println("------------------------");
            return;
        }
        newServies.showCustomer();
        int choice;
        do {
            choice = choice();
        } while (choice < 1 || choice > size);

        System.out.println("1.Booking Villa. \n" +
                "2.Booking House. \n" +
                "3.Booking Room.\n" +
                "4.Exit.");
        Customer customer = customerList.get(choice - 1);
        customerList.remove(choice - 1);
        readerFile.writeList(CUSTOMER_PATH, customerList, false);
        do {
            choice = choice();
        } while (choice < 1 || choice > 4);

        switch (choice) {
            case 1:
                List<Villa> villaList = new ArrayList<>(NewServies.showVilla());
                booking(customer, villaList, VILLA_PATH);
                break;
            case 2:
                List<House> houseList = new ArrayList<>(NewServies.showHouse());
                booking(customer, houseList, HOUSE_PATH);
                break;
            case 3:
                List<Room> roomList = new ArrayList<>(NewServies.showRoom());
                booking(customer, roomList, ROOM_PATH);
                break;
            case 4:
                System.exit(0);
        }

    }
    public void booking(Customer customer, List<? extends Services> list, String PATH) {
        int size = list.size();
        if (size == 0) {
            System.out.println("Danh sach Trong");
            System.out.println("------------------------");
            return;
        }

        int choice;
        do {
            choice = choice();
        } while (choice < 1 || choice > size);
        customer.setServices(list.get(choice - 1));
        rewriteFile.writeFile(BOOKING_PATH,customer, true);
        list.remove(choice - 1);
        rewriteFile.writeList(PATH,list, true);
    }
    int choice() {
        int choice;
        do {
            System.out.println("Nhập lựa chọn của bạn (k nằm ngoài phạm vi) :");
            String tempChoice = scanner.nextLine();
            if (CheckInformation.validateChoice(tempChoice)) {
                choice = Integer.parseInt(tempChoice);
                break;
            }
        } while (true);
        return choice;
    }

    public List<Customer> showBookingList() {
        List<String[]> list = new ArrayList<>(readerFile.readerFile(BOOKING_PATH));
        List<Customer> customerList = new ArrayList<>();
        if (list.size() == 0) {
            System.out.println("Booking's list is empty");
            System.out.println("----------------------------");
            return customerList;
        }
        System.out.println("------------------------------");
        for (String[] strings : list) {
            if (strings.length == 18) {
                Villa villa = new Villa();
                villa.setId(strings[8]);
                villa.setServiceName(strings[9]);
                villa.setAcreageUsed(Integer.parseInt((strings[10])));
                villa.setRentalCosts(Integer.parseInt(strings[11]));
                villa.setMaximumPeople(Integer.parseInt(strings[12]));
                villa.setRentalType(strings[13]);
                villa.setStandardRoom(strings[14]);
                villa.setOtherAmenities(strings[15]);
                villa.setAcreagePool(Integer.parseInt(strings[16]));
                villa.setFloors(Integer.parseInt(strings[17]));
                Customer customer = new Customer(strings, villa);
                customerList.add(customer);
            }
            if (strings.length == 17) {
                House house = new House();
                house.setId(strings[8]);
                house.setServiceName(strings[9]);
                house.setAcreageUsed(Integer.parseInt((strings[10])));
                house.setRentalCosts(Integer.parseInt(strings[11]));
                house.setMaximumPeople(Integer.parseInt(strings[12]));
                house.setRentalType(strings[13]);
                house.setStandardRoom(strings[14]);
                house.setOtherAmenities(strings[15]);
                house.setFloors(Integer.parseInt(strings[16]));
                Customer customer = new Customer(strings, house);
                customerList.add(customer);
            }
            if (strings.length== 15) {
                Room room = new Room();
                room.setId(strings[8]);
                room.setServiceName(strings[9]);
                room.setAcreageUsed(Integer.parseInt((strings[10])));
                room.setRentalCosts(Integer.parseInt(strings[11]));
                room.setMaximumPeople(Integer.parseInt(strings[12]));
                room.setRentalType(strings[13]);
                room.setFreeService(strings[14]);
                Customer customer = new Customer(strings, room);
                customerList.add(customer);
            }
        }
        for(int i = 0 ; i < customerList.size();i++){
            System.out.println((i+1) +". " + customerList.get(i).showInfor());
        }
        System.out.println("------------------------------");
        return customerList;
    }

}

