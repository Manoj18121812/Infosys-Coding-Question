package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNull {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A",null,"B",null));

        list.removeIf(Objects::isNull);
        System.out.println(list);
    }
}
