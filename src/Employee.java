public class Employee extends Person {
    private double salary;

    public Employee() {
        super();
    }

    public Employee(int id, String firstName, String lastName, int age, String email, double salary) {
        super(id, firstName, lastName, age, email);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
