package controler;

import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;
import file.FileUtils;
import module.Customer;
import module.Employee;

import java.util.*;

public class EmployeeCotroller {
    private static final String EMPLOYEE_PATH = "D:\\casetudy2\\src\\file\\employee.csv";
    Scanner scanner = new Scanner(System.in);
     FileUtils fileUtils = new FileUtils();

    public void addNewEmployee() {
        String iD;
        String fullName;
        int age;
        String address;

            System.out.println("Nhập ID :");
            iD = scanner.nextLine();

            System.out.println("Nhập Name :");
            fullName = scanner.nextLine();
            System.out.println("Nhập age :");
            String temp = scanner.nextLine();
                age = Integer.parseInt(temp);
        do {
            System.out.println("Nhập địa chỉ :");
            address = scanner.nextLine();
        } while (address == null);
        Employee employee = new Employee(iD, fullName, age, address);
        writeToEmployeeCsv(employee);
    }

    public void showEmployeeMap() {
        Map<String, Employee> employeeMap = new TreeMap<>(readFromEmployeeCsv());
        System.out.println("-------------------------");
        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
            System.out.println("Employee's ID =" + entry.getKey() + " " + entry.getValue().showEmployeeInformation());
        }
        System.out.println("-------------------------");
    }


    public void writeToEmployeeCsv(Employee employee) {
        fileUtils.writeFile( EMPLOYEE_PATH, employee,true);
    }

    public Map<String, Employee> readFromEmployeeCsv() {
        List<String[]> strings = new ArrayList<>(fileUtils.readerFile(EMPLOYEE_PATH));
        Map<String, Employee> employeeMap = new TreeMap<>();
        for (String[] str : strings) {
                Employee employee = new Employee();
                employee.setEmployeeId(str[0]);
                employee.setFullName(str[1]);
                employee.setAge(Integer.parseInt(str[2]));
                employee.setAddress(str[3]);



            employeeMap.put(employee.getEmployeeId(), employee);
            }
           return employeeMap;
        }

    public Stack<Employee> readEmployeeCsv() {
        List<String[] > list = new ArrayList<>(fileUtils.readerFile(EMPLOYEE_PATH));
        Stack<Employee> employeeStack = new Stack<>();
        for(String[] strings : list){
                Employee employee = new Employee();
                employee.setEmployeeId(strings[0]);
                employee.setFullName(strings[1]);
                employee.setAge(Integer.parseInt(strings[2]));
                employee.setAddress(strings[3]);

                employeeStack.push(employee);
        }
        return employeeStack;
    }

}
