import java.util.ArrayList;
import java.util.List;

public class CustomerManager extends PersonManager {

    private List<Customer> customers = new ArrayList<Customer>();

   /* public CustomerManager() {
        customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "ahmet", "akın", 21, "ahmet@gmail.com"));
        customers.add(new Customer(2, "Engin", "DEMİROĞ", 40, "engin@gmail.com"));
        customers.add(new Customer(3, "Mustafa Murat", "ÇOŞKUN", 38, "mustafa.murat@gmail.com"));
        customers.add(new Customer(4, "Emre", "DEMİR", 27, "emre@gmail.com"));
        customers.add(new Customer(5, "Yasin", "KOÇ", 22, "yasin@gmail.com"));
    }*/

    public CustomerManager() {
        super();
        customers.add(new Customer(1, "ahmet", "akın", 21, "ahmet@gmail.com"));
        customers.add(new Customer(2, "Engin", "DEMİROĞ", 40, "engin@gmail.com"));
        customers.add(new Customer(3, "Mustafa Murat", "ÇOŞKUN", 38, "mustafa.murat@gmail.com"));
        customers.add(new Customer(4, "Emre", "DEMİR", 27, "emre@gmail.com"));
        customers.add(new Customer(5, "Yasin", "KOÇ", 22, "yasin@gmail.com"));
    }

    public List<Customer> listCustomer() {
        return customers;
    }

    public void generateCustomer(Customer customer) {
        customers.add(new Customer(1, "ahmet", "akın", 21, "ahmet@gmail.com"));
        customers.add(new Customer(2, "Engin", "DEMİROĞ", 40, "engin@gmail.com"));
        customers.add(new Customer(3, "Mustafa Murat", "ÇOŞKUN", 38, "mustafa.murat@gmail.com"));
        customers.add(new Customer(4, "Emre", "DEMİR", 27, "emre@gmail.com"));
        customers.add(new Customer(5, "Yasin", "KOÇ", 22, "yasin@gmail.com"));
        customers.add(customer);
    }

    public List<Customer> addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println(customer.getFirstName() + " " + customer.getLastNme() + " isimli müşteri sisteme başarıyla eklenmiştir.");
        return customers;
    }

    @Override
    public List list() {
        return super.list();
    }

}
