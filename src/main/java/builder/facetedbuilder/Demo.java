package builder.facetedbuilder;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                 .at("123 London Road")
                 .in("London")
                 .withPostCode("jfj3434")
                .works()
                 .at("Fabrikam")
                 .asA("Engineer")
                 .earning(123000)
                .build();
        System.out.println(person);

    }
}
