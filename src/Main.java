import interfaces.ExampleFunctionalInterface;
import java.util.Arrays;

/**
 * @author Dridev
 */
public class Main {
    public static void main(String[] args) {
        // Example of lambda functions

        // Problem: Before, creating a single piece of functionality required creating a class for each case, leading to more boilerplate.
        // Solution: Lambda functions allow creating these pieces of functionality more easily.

        // Examples:

        // Example 1: Print all values of an array without lambda function
        int[] arrayInt = {4, 5, 6, 7, 9};
        printAllValuesWithoutLambda(arrayInt);

        // Example 2: Print all values of an array with lambda function
        printAllValuesWithLambda(arrayInt);

        // Example 3: Using a custom functional interface
        printAllValuesWithMyFunctionalInterface(arrayInt, (array, consumer) -> {
            // Using forEach method of IntConsumer interface to print each element
            for (int element : array) {
                consumer.accept(element);
            }
        });
    }

    // Example 1: Print all values of an array without lambda function
    public static void printAllValuesWithoutLambda(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    // Example 2: Print all values of an array with lambda function
    public static void printAllValuesWithLambda(int[] array) {
        // Using Stream and forEach method with lambda expression
        Arrays.stream(array).forEach(value -> System.out.println(value));
        // Another way to print all values of the array with lambda and method reference
        Arrays.stream(array).forEach(System.out::println);
    }

    // Example 3: Using a custom functional interface
    public static void printAllValuesWithMyFunctionalInterface(int[] array, ExampleFunctionalInterface functions) {
        functions.forEach(array, element -> System.out.println(element));
    }
}
