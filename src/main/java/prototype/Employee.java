package prototype;

public class Employee {

    public String name;
    public AddressCopy addressCopy;

    public Employee(String name, AddressCopy addressCopy) {
        this.name = name;
        this.addressCopy = addressCopy;
    }

    public Employee(Employee other){
        name = other.name;
        addressCopy = new AddressCopy(other.addressCopy);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", addressCopy=" + addressCopy +
                '}';
    }
}
