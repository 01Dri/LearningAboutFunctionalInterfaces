import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Dridev
 * Demonstrates examples of functional interfaces in Java.
 */
public class FunctionalInterfaces {

    /**
     * Main entry point for the program.
     */
    public static void main(String[] args) {
        // Introduction to Functional Interfaces

        /**
         * In Java, a functional interface is an interface that contains only one abstract method.
         * Functional interfaces are a key concept in the context of functional programming and the introduction of lambda expressions in Java 8.
         * The presence of a single abstract method makes it possible to use lambda expressions or method references to provide the implementation for that method concisely.
         */

        // Examples of Functional Interfaces

        // Function<T, R> - Represents a function that takes an argument of type T and produces a result of type R.
        Function<String, Integer> stringLength = s -> s.length();
        int length = stringLength.apply("Hello, World!");
        System.out.println("Length of the string: " + length);

        // Predicate<T> - Represents a predicate (boolean-valued function) of one argument.
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Is 15 even? " + isEven.test(15));

        // Consumer<T> - Represents an operation that accepts a single input argument and returns no result.
        Consumer<String> printElement = s -> System.out.println(s);
        String[] words = {"Apple", "Banana", "Orange"};
        for (String word : words) {
            printElement.accept(word);
        }

        // Supplier<T> - Represents a supplier of results.
        Supplier<Double> randomSupplier = () -> Math.random();
        double randomValue = randomSupplier.get();
        System.out.println("Random value: " + randomValue);
    }
}
