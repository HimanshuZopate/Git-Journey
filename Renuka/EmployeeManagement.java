
package Renuka;

public class EmployeeManagement {

    public static void main(String[] args) {

        int employeeId = 101;
        String employeeName = "Rahul";
        String department = "IT";
        String designation = "Software Developer";
        double salary = 35000.50;

        displayEmployeeDetails(
            employeeId,
            employeeName,
            department,
            designation,
            salary
        );
    }

    public static void displayEmployeeDetails(
            int id,
            String name,
            String dept,
            String role,
            double salary) {

        System.out.println("===== Employee Details =====");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Designation: " + role);
        System.out.println("Salary: " + salary);
    }
}
