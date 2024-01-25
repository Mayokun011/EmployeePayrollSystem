import java.util.ArrayList;
import java.util.List;

abstract class Employee{
    private String name;
    private int id;

    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    //Abstract method been implemented by subclasses
    public abstract void doublecalculateSalary();

    @Override
    public String toString() {
        return "Employee[" +
                "name='" + name + '\'' +
                ", id=" + id +
                ']';
    }
}

class FullTimeEmployee extends Employee{

    private double monthlySalary;
    public FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary(){
        return monthlySalary;
    }

    @Override
    public void doublecalculateSalary() {


    }
}

class PartimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartimeEmployee(String name, int id, int hourWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }

    @Override
    public void doublecalculateSalary() {

    }
}

public class PayrollSystem {
    private List<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee : employeeList){
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }
        }

        if (employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees(){
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }

}
