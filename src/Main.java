public class Main {

    public static void main(String[] args) {

        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("Adebayo Taiwo", 112, 12000);
        PartimeEmployee emp2 = new PartimeEmployee("Mbata Nelson", 113, 60,20000);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Detail:");
        payrollSystem.displayEmployees();

        System.out.println("\nRemoving Employee...");
        payrollSystem.removeEmployee(112);

        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployees();

    }
}
