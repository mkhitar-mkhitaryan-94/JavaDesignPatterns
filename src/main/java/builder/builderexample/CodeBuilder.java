package builder.builderexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CodeBuilder {
    private String className;
    private Map<String, String> fields = new HashMap<>();


    public CodeBuilder(String className) {
        this.className = className;
    }

    public CodeBuilder addField(String name, String tyoe) {
        fields.put(tyoe, name);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("public class %s\n", this.className));
        sb.append("{\n");
        Set<String> keys = fields.keySet();
        for (String type : keys) {
            String name = fields.get(type);
            sb.append(String.format("  public %s %s; \n", type, name));
        }
        sb.append("}");
        System.out.println(sb);
        return sb.toString();

    }

}

