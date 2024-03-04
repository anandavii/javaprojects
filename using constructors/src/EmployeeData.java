/*
 * EmployeeData class with constructors
 */

public class EmployeeData {

    // Variable declaration
    private String empName, department, position;
    private int idNumber;

    /**
     * Constructor with four parameters
     * 
     * @param name Stores name of the employee
     * @param id   Stores id of the employee
     * @param dept Stores department of the employee
     * @param pos  Stores job title of the employee
     */
    public EmployeeData(String name, int id, String dept, String pos) {
        empName = name;
        idNumber = id;
        department = dept;
        position = pos;
    }

    /**
     * Constructor with two parameters
     * 
     * @param name Stores name of the employee
     * @param id   Stores id of the employee
     */
    public EmployeeData(String name, int id) {
        empName = name;
        idNumber = id;
        department = "";
        position = "";
    }

    /**
     * Default Constructor
     */
    public EmployeeData() {
        empName = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    /**
     * The setname, setIdNumber, setDepartment,
     * setPosition method stores name, id,
     * department and position respectivly
     * 
     * @param name Stores name of the employee
     * @param id   Stores id of the employee
     * @param dept Stores department of the employee
     * @param pos  Stores job title of the employee
     */
    public void setname(String name) {
        empName = name;
    }

    public void setIdNumber(int id) {
        idNumber = id;
    }

    public void setDepartment(String dept) {
        department = dept;
    }

    public void setPosition(String pos) {
        position = pos;
    }

    /**
     * The getName, getIdNumber, getDepartment,
     * getPosition method returns name, id,
     * department and position respectivly
     * 
     * @return value for the name, id,
     *         department and position field
     */
    public String getname() {
        return empName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
}
