package prototype;

public class CopyConstructorDemo {
    public static void main(String[] args) {
        Employee john = new Employee("John",new AddressCopy("123 London Road","London","UK"));

        Employee chris = new Employee(john);
        chris.name = "Chris";
        System.out.println(john);
        System.out.println(chris);
    }
}
