import java.util.List;

public class PersonManager<T> {

    private List<T> persons;

    public PersonManager() {

    }

    public PersonManager(List<T> persons) {
        this.persons = persons;
    }

    public void add(T person) {
        persons.add(person);
    }

    public List<T> list() {
        return persons;
    }

}
