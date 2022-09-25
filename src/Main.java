import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        List<Employee> employees = employeeManager.listEmpoyee();
        System.out.println("\nList of employees : \n");
        for (Employee employee1 : employees) {
            System.out.printf("\n" + employee1.getFirstName() + " " + employee1.getLastNme() + "\n");
        }

        employeeManager.setBestEmployee(2);

        CustomerManager customerManager = new CustomerManager();
        List<Customer> customers = customerManager.listCustomer();
        System.out.println("\nList of customers : \n");
        for (Customer customer1 : customers) {
            System.out.printf("\n" + customer1.getFirstName() + " " + customer1.getLastNme() + "\n");
        }
    }
}
