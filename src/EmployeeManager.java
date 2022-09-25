import java.util.ArrayList;
import java.util.List;

public class EmployeeManager extends PersonManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "ali", "KÖSE", 43, "ali.köse@gmail.com", 11000));
        employees.add(new Employee(2, "Engin", "DEMİROĞ", 40, "engin@gmail.com", 55000));
        employees.add(new Employee(3, "Ali Murat", "GÜREL", 38, "ali.gurel@gmail.com", 10000));
    }

    public List<Employee> listEmpoyee() {
        return employees;
    }

    public void generateEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> addCustomer(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getFirstName() + " " + employee.getLastNme() + " isimli personel sisteme başarıyla eklenmiştir.");
        return employees;
    }

    @Override
    public List<Employee> list() {
        return employees;
    }

    public Employee setBestEmployee(int employeeId) {

        Employee bestEmployee = employees.stream().filter(employee -> employee.getId() == employeeId).findAny().orElse(null);

        if (bestEmployee == null) {
            System.out.printf("\nSistemde %d numaralı id'ye sahip personel bulunmamaktadır.\n", employeeId);
            return null;
        } else {
            System.out.printf("\nAyın elemenı %s %s isimli personeldir.\n", bestEmployee.getFirstName(), bestEmployee.getLastNme());
            return bestEmployee;
        }
    }
}
