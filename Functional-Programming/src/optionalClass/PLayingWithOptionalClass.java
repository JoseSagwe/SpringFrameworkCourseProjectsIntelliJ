package optionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PLayingWithOptionalClass {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "mango");

        //check the first fruit that starts with "b"
        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");

        //optional
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
//        System.out.println(optional.get());

        //You can create optional values using optional
        Optional<String> car = Optional.of("Mazda");

    }
}
