/*
 * This program implements concept of constructors
 * (default and parameterized)
 */

public class Employee {
        public static void main(String[] args) throws Exception {

                // Create an EmployeeData object with four
                // parameterized constructor
                EmployeeData employee1 = new EmployeeData("Susan Meyers",
                                8647765, "IT", "Sr Programmer Analyst");

                // Display employee1 details
                System.out.println("Employee name is : " +
                                employee1.getname());
                System.out.println("Employee id Nmuber is : " +
                                employee1.getIdNumber());
                System.out.println("Employee department is : " +
                                employee1.getDepartment());
                System.out.println("Employee position is : " +
                                employee1.getPosition() + "\n");

                // Create an EmployeeData object with two
                // parameterized constructor
                EmployeeData employee2 = new EmployeeData("Ahmad Karim",
                                5424130);

                // Display employee2 details
                System.out.println("Employee name is : " +
                                employee2.getname());
                System.out.println("Employee id Nmuber is : " +
                                employee2.getIdNumber());
                System.out.println("Employee department is : " +
                                employee2.getDepartment());
                System.out.println("Employee position is : " +
                                employee2.getPosition() + "\n");

                // Create an EmployeeData object
                // with default constructor
                EmployeeData employee3 = new EmployeeData();

                // Display employee3 details
                System.out.println("Employee name is : " +
                                employee3.getname());
                System.out.println("Employee id Nmuber is : " +
                                employee3.getIdNumber());
                System.out.println("Employee department is : " +
                                employee3.getDepartment());
                System.out.println("Employee position is : " +
                                employee3.getPosition());

        }
}
