package Assessment.com;

public class Employee {
    public String employeeName;
    public int employeeId;

    public Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

//    public String getEmployeeName() {
//        return employeeName;
//    }
//
//    public void setEmployeeName(String employeeName) {
//        this.employeeName = employeeName;
//    }

    public int getEmployeeId() {
        return employeeId;
    }

//    public void setEmployeeId(int employeeId) {
//        this.employeeId = employeeId;
//    }

    public String toString(){
        return "Employee Present{ Employee Name= "+employeeName+" Employee Id= "+employeeId+"}";
    }
}
