package a1206.optional;

import java.util.Optional;

public class Optional2 {
    public static void main(String[] args) {
        Optional<String> optionalName = findName("john");
        System.out.println(optionalName.orElse("\nname not found"));
    }

    private static Optional<String> findName(String name) {
        if("john".equals(name)) {
            return Optional.of("\n" + name);
        }
        return Optional.empty();
    }
}
