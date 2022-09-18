package builder;

public class DemoFluent {
    public static void main(String[] args) {
        EmployeeBuilder eb = new EmployeeBuilder();
        Person dmitri = eb
                .withName("Dmitri")
                .worksAt("Developer")
                .build();
        System.out.println(dmitri);

    }
}
