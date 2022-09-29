package prototype;

import org.apache.commons.lang3.SerializationUtils;

public class DemoSer {
    public static void main(String[] args) {
        Foo foo = new Foo(42,"life");
        Foo foo1 = SerializationUtils.roundtrip(foo);

        foo1.whatever= "fgdg";

        System.out.println(foo);
        System.out.println(foo1);
    }
}
