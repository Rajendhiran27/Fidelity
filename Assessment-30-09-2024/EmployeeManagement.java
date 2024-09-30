package Assessment.com;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class EmployeeManagement {
    public Set<Employee> employee=new HashSet<>();
    public void AddEmployee(Employee employees){
        employee.add(employees);
//        employee.add(new Employee(employeeName,employeeId));
//        employee.add(new Employee("Rajendhiran",122));
//        employee.add(new Employee("Thanush",123));

    }
    public Employee getEmployee(int employeeId) throws EmployeeNotFoundException{
        for(Employee employees :employee){
            if(employees.getEmployeeId()==employeeId){
                return employees;
            }
        }
        throw new EmployeeNotFoundException("Employee id: "+employeeId+" Not Present");
    }
    public static void main(String[] args){
        EmployeeManagement employeeManagement=new EmployeeManagement();
        employeeManagement.AddEmployee(new Employee("Rajendhiarn",1));
        try{
            System.out.println(employeeManagement.getEmployee(1));
            System.out.println(employeeManagement.getEmployee(2));
        }
        catch(EmployeeNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
