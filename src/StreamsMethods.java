import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Dridev
 * Demonstrates examples of commonly used methods in the Stream API.
 */
public class StreamsMethods {

    public static void main(String[] args) {
        // Examples of Functional Methods in the Stream API
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // MAP_METHOD
        // Example: Multiply each value of the array by 2
        List<Integer> newListIntegers = integers.stream().map(value -> value * 2).toList();
        System.out.println("Original Array: " + integers);
        System.out.println("New Array (doubled): " + newListIntegers);

        // FILTER_METHOD
        // Example: Remove each even number from the array
        List<Integer> newListIntegerWithoutPairNumber = integers.stream().filter(value -> value % 2 != 0).toList();
        System.out.println("New Array (without even numbers): " + newListIntegerWithoutPairNumber);

        // FOR_EACH_METHOD
        // Example: Print each value of the array
        System.out.println("Printing each value of the array:");
        integers.stream().forEach(System.out::println);

        // REDUCE_METHOD
        // Example: Sum all values of the array
        Optional<Integer> result = integers.stream().reduce(Integer::sum);
        System.out.println("Sum of all values: " + result.orElse(0)); // Using orElse to handle the Optional

        // DISTINCT_METHOD
        // Example: Remove duplicates from the array
        List<Integer> listIntegerWithDuplicates = List.of(1, 1, 2, 2, 3, 4, 5);
        List<Integer> listIntegerWithoutDuplicates = listIntegerWithDuplicates.stream().distinct().toList();
        System.out.println("Array without duplicates: " + listIntegerWithoutDuplicates);

        // FLAT_MAP_METHOD
        // Example: Flatten a list of lists into a single list
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> flattenedList = listOfLists.stream().flatMap(List::stream).toList();
        System.out.println("Flattened List: " + flattenedList);

        // OBSERVATION
        System.out.println("These are just a few examples, and the Stream API provides a rich set of methods for various stream manipulations. The choice of method depends on the specific requirements of your use case.");
    }
}
