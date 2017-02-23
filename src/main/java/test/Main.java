package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/**
 * @author <a href="mailto:brent.douglas@ysura.com">Brent Douglas</a>
 */
public class Main {

    public static void main(final String... args) throws Exception {
        final Map<String, Function<Class<?>, Boolean>> map = new HashMap<>();
        map.put("foo", (it -> Objects.equals("bar", it.getName())));

        // Works fine if the redundant parens are removed
        //map.put("foo", it -> Objects.equals("bar", it.getName()));
    }
}
