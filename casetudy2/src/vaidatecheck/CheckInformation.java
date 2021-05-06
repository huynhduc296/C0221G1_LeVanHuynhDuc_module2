package vaidatecheck;

import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInformation {
    private static Pattern pattern;
    private static Matcher matcher;
    Scanner scanner;

    public CheckInformation() {
        this.scanner = new Scanner(System.in);
    }

    public static boolean isValidService(String string, String reget) {
        pattern = Pattern.compile(reget);
        matcher = pattern.matcher(string);
        boolean Flag = matcher.matches();
        if (!Flag) {
            System.out.println("Input not matching" + reget);
        }

        return Flag;
    }

    private static final String REGEX_VILLA_CODE = "^(SVVL-)\\d{4}$";
    private static final String REGEX_HOUSE_CODE = "^(SVHO-)\\d{4}$";
    private static final String REGEX_ROOM_CODE = "^(SVRO-)\\d{4}$";
    private static final String NAME = "^[A-Z][a-z]*(\\ [A-Z][a-z]*)*$";
    private static final String AREA = "^([1-9]\\d{2,}|[3-9]\\d)\\.\\d+$";
    private static final String RENTCOST = "^[1-9][0-9]+(\\.[0-9]+)*$";
    private static final String AMOUNT_PEOPLE = "^([0][1-9]|[1][0-9])$";
    private static final String INCLUSION_SERVICES = "^(massage|karaoke|food|drink|car)$";
    private static final String FLOOR = "^[1-99]$";
    private static final String BIRTH_DAY = "^(((0[1-9]|[12]\\d|3[01])/((0[13578])|(1[02])))|((0[1-9]|[12]\\d|30)/((0[2469])|11)))/((19[4-9]\\d)|200[0-3])$";
    private static final String EMAIL = "^[a-z]+([\\_\\.]?[a-z\\d]+)*@[a-z]{3,7}\\.[a-z]{3}$";
    private static final String GENDER = "^([Mm][Aa][lL][Ee]|[Ff][Ee][Mm][Aa][Ll][Ee]|[Uu][Nn][Kk][Nn][Oo][Ww][Nn])$";
    private static final String ID_CARD = "^\\d{9}$";
    private static final String RENTAL_TYPE = "^(Year|Month|Day|Hour)$";
    private static final String PHONE_NUMBER = "^\\d{10,11}$";
    private static final String CUSTOMER_TYPE = "^(Diamond|Platinum|Gold|Silver|Member)$";
    private static final String EMPLOYEE_AGE = "^(1[89]|[2-5]\\d|6[0-5])$";
    private static final String REGEX_NUMBER = "^\\d+$";

    public static boolean validateVillaCode(String string) {
        return Pattern.matches(REGEX_VILLA_CODE, string);
    }

    public static boolean validateHouseCode(String string) {
        return Pattern.matches(REGEX_HOUSE_CODE, string);
    }

    public static boolean validateRoomCode(String string) {
        return Pattern.matches(REGEX_ROOM_CODE, string);
    }

    public static boolean validateName(String string) {
        return Pattern.matches(NAME, string);
    }

    public static boolean validateArea(String string) {
        return Pattern.matches(AREA, string);
    }

    public static boolean validateRentCost(String string) {
        return Pattern.matches(RENTCOST, string);
    }

    public static boolean validateAmountPeople(String string) {
        return Pattern.matches(AMOUNT_PEOPLE, string);
    }

    public static boolean validateInclusionServices(String string) {
        return Pattern.matches(INCLUSION_SERVICES, string);
    }

    public static boolean validateFloor(String string) {
        return Pattern.matches(FLOOR, string);
    }

    public static boolean validateRentalType(String string) {
        return Pattern.matches(RENTAL_TYPE, string);
    }

    public static boolean validateCustomerType(String string) {
        try {
            if (Pattern.matches(CUSTOMER_TYPE, string)) {
                return true;
            } else {
                throw new CustomerTypeException("Invalid format (ex: Platinum,Diamond,Gold,Silver,Member");
            }
        } catch (CustomerTypeException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static boolean validateEmployeeAge(String string) {
        try {
            if (Pattern.matches(EMPLOYEE_AGE, string)) {
                return true;
            }
            throw new AgeException("The age can not less than 18 or more than 65");
        } catch (AgeException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static boolean validateChoice(String string) {
        try {
            if (Pattern.matches(REGEX_NUMBER, string)) {
                return true;
            }
            throw new NumberFormatException("Please input a integer");
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public String inputNameCustomer() throws NameException {
        String regex = "^([A-Z][a-z]*\\s)+[A-Z][a-z]*$";
        Pattern pattern = Pattern.compile(regex);
        String name = this.scanner.nextLine();
        Matcher matcher = pattern.matcher(name);
        if (!matcher.matches()) {
            throw new NameException("Ten phai viet hoa chu cai dau, chi co 1 khoang trang o giua 2 tu");
        } else {
            return name;
        }
    }

    public String inputEmailCustomer() throws EmailException {
        String regex = "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+){1,2}$";
        Pattern pattern = Pattern.compile(regex);
        String email = this.scanner.nextLine();
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new EmailException("email co duy nhat 1 '@' va co 1 den 2 dau '.' \nvidu: abc@gmail.com.vn ");
        } else {
            return email;
        }
    }

    public String inputGenderCustomer() throws GenderException {
        String gender = this.scanner.nextLine();
        String genderTrim = gender.trim();
        if (genderTrim.length() != 4 && genderTrim.length() != 6) {
            throw new GenderException("gioi tinh phai la male, female hoac unknow");
        } else {
            String genderUp = genderTrim.toUpperCase();
            byte var6 = -1;
            switch(genderUp.hashCode()) {
                case -1787143004:
                    if (genderUp.equals("UNKNOW")) {
                        var6 = 2;
                    }
                    break;
                case 2358797:
                    if (genderUp.equals("MALE")) {
                        var6 = 0;
                    }
                    break;
                case 2070122316:
                    if (genderUp.equals("FEMALE")) {
                        var6 = 1;
                    }
            }

            String genderResult;
            switch(var6) {
                case 0:
                    genderResult = "Male";
                    break;
                case 1:
                    genderResult = "Female";
                    break;
                case 2:
                    genderResult = "Unknow";
                    break;
                default:
                    throw new GenderException("gioi tinh phai la male, female hoac unknow");
            }

            System.out.println(genderResult);
            return genderResult;
        }
    }

    public String inputIdCardCustomer() throws IdCardException {
        String regex = "^\\d{3}[ ]\\d{3}[ ]\\d{3}$";
        Pattern pattern = Pattern.compile(regex);
        String idCard = this.scanner.nextLine();
        Matcher matcher = pattern.matcher(idCard);
        if (!matcher.matches()) {
            throw new IdCardException("idCard phai theo format XXX XXX XXX\n vidu: 197 003 011");
        } else {
            return idCard;
        }
    }

    public String inputDateOfBirth() throws ParseException {
        String regex = "^([0][1-9]|[1-2][0-9]|[3][0-1])[/]([0][1-9]|[1][0-2])[/]\\d{4}";
        Pattern pattern = Pattern.compile(regex);

        String birthDay;
        boolean check;
        do {
            check = true;
            birthDay = this.scanner.nextLine();
            Matcher matcher = pattern.matcher(birthDay);
            if (!matcher.matches()) {
                System.out.println("nhap sai format dd/MM/yyyy hoac sai ngay thang gi day (31 ngay, 12 thang)\n hay nhap lai");
                check = false;
            } else {
                String month = birthDay.substring(3, 5);
                String day = birthDay.substring(0, 2);
                String year = birthDay.substring(6);
                if (!month.equals("04") && !month.equals("06") && !month.equals("09") && !month.equals("11")) {
                    if (month.equals("02")) {
                        boolean isLeapYear = CheckYear.isLeapYear(year);
                        if (!isLeapYear && Integer.parseInt(day) > 28) {
                            System.out.println("nam " + year + " ko phai nam nhuan. cao nhat 28 ngay thoi\n hay nhap lai");
                            check = false;
                        } else if (isLeapYear && Integer.parseInt(day) > 29) {
                            System.out.println("nam " + year + " la nam nhuan. cao nhat 29 ngay thoi\n hay nhap lai");
                            check = false;
                        } else if (!CheckYear.checkYearUpTo1900AndUpTo18Age(day, month, year)) {
                            check = false;
                        }
                    } else if (!CheckYear.checkYearUpTo1900AndUpTo18Age(day, month, year)) {
                        check = false;
                    }
                } else if (Integer.parseInt(day) > 30) {
                    System.out.println("thang 4, 6, 9, 11 co toi da 30 ngay thoi\n hay nhap lai");
                    check = false;
                } else if (!CheckYear.checkYearUpTo1900AndUpTo18Age(day, month, year)) {
                    check = false;
                }
            }
        } while(!check);

        return birthDay;
    }
}
