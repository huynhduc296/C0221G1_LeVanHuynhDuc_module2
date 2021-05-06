package controler;
import javax.xml.bind.ValidationException;
import java.util.Scanner;

public class MainController {
    Scanner scanner=new Scanner(System.in);
    BookingController bookingController=new BookingController();
    EmployeeCotroller employeeCotroller=new EmployeeCotroller();
    public void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("Chọn :\n" +
                    "1.Thêm dịch vụ mới \n" +
                    "2.Hiển thị dịch vụ\n" +
                    "3.Thêm khách hàng mới \n" +
                    "4.Hiển thị thông tin của khách hàng \n" +
                    "5.Thêm đặt chỗ mới\n" +
                    "6.Thêm hiển thị Nhân viên \n" +
                    "7.Hiển thị thông tin khách hàng đã đặt \n" +
                    "8.Thoát \n"
            );
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn nếu bạn muốn");
            String choice = scanner.nextLine();
            try {
                validateError(8,Integer.parseInt(choice));
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (choice) {
                case "1":
                    addNewServies ();
                    break;
                case "2":
                    showServies();
                    break;
                case "3":
                    NewServies.addCustomer();
                    break;
                case "4":
                    NewServies.showCustomer();
                    break;
                case "5":
                    bookingController.addNewBooking();
                    break;
                case "6":
                    employeeManagement();
                    break;
                case "7":
                    bookingController.showBookingList();
                    break;
                case "8":
                    check = false;
                default:
                    break;
            }
        }
    }
    public void addNewServies () {
        boolean check = true;
        while (check) {
            System.out.println("Chọn :\n" +
                    "1.Thêm Villa mới \n" +
                    "2.Thêm Houses mới\n" +
                    "3.Thêm Room mới \n" +
                    "4.Quay lại Menu \n" +
                    "5.Thoát \n"
            );
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn nếu bạn muốn");

            String choice1 = scanner.nextLine();
            try {
                validateError(5,Integer.parseInt(choice1));
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (choice1) {
                case "1":
                   NewServies.addVilla();
                    break;
                case "2":
                    NewServies.addHouse();
                    break;
                case "3":
                    NewServies.addRoom();
                    break;
                case "4":
                    displayMainMenu();
                    break;
                case "5":
                    check=false;
                    break;
                default:
                    break;
            }
        }
    }
    public void employeeManagement() {
        boolean check = true;
        while (check) {
            System.out.println(
                    "1.Thêm Nhân viên\n" +
                    "2.Hiển thị nhân vien\n" +
                    "3.Back To Main Menu\n" +
                    "4.Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn nếu bạn muốn");

            String choice1 = scanner.nextLine();
            try {
                validateError(8, Integer.parseInt(choice1));
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (choice1) {

                case "1":
                    employeeCotroller.addNewEmployee();
                    break;

                case "2":
                    employeeCotroller.showEmployeeMap();
                    break;
                case "3":
                    displayMainMenu();
                    break;
                case "4":
                    System.exit(0);
            }
        }
    }
    public void showServies () {
        boolean check = true;
        while (check) {
            System.out.println("Chọn :\n" +
                    "1.Hiện thị tất cả Villa  \n" +
                    "2.T.Hiển thị tất cả House\n" +
                    "3.Hiển thị tất cả Room\n" +
                    "4.Show All Name Villa Not Duplicate \n" +
                    "5.Show All Name House Not Duplicate \n" +
                    "6.Show All Name Name Not Duplicate \n" +
                    "7.Quay lại Menu \n" +
                    "8.Thoát \n"
            );
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn nếu bạn muốn");

            String choice1 = scanner.nextLine();
            try {
                validateError(8,Integer.parseInt(choice1));
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (choice1) {
                case "1":
                    NewServies.showVilla();
                    break;
                case "2":
                    NewServies.showHouse();
                    break;
                case "3":
                    NewServies.showRoom();
                    break;
                case "4":
                    NewServies.showVillaListNotDuplicate();
                    break;
                case "5":
                    NewServies.showHouseListNotDuplicate();
                    break;
                case "6":
                    NewServies.showRoomListNotDuplicate();
                    break;
                case "7":
                    displayMainMenu();
                    break;
                case "8":
                    check=false;
                    break;
                default:
                    break;
            }
        }
    }

    public void  validateError(int numOfChoose, int numIn)throws ValidationException {
        if(numIn<=0||numIn>numOfChoose){
            throw new ValidationException("có các lựa chọn từ 1 đến"+numOfChoose);
        }
    }
}
