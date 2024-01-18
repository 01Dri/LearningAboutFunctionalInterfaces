import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMethods {


    public static void main(String[] args) {
        /**
         * @EXAMPLES_FUNCTIONAL_METHODS
         * Lets go to see some methods of data structure 'Stream' most used
         */

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // First we need call 'Stream'
        /**
         * @MAP_METHOD
         * This method of stream is used to mapping the array or to transform each value of array
         * Map function receive the functional interface 'Function'
         * Lets mapping this array
         */

        /**
         * @EXAMPLE_USE_CASE_MAP
         * In this example, lets multiply each value of array with 2 value
         * (IMPORTANT!!!) :  When we called 'Stream' we don't modified the original array but a copy
         */
        List<Integer> newListIntegers = integers.stream().map(value -> value * 2).toList(); // How you can see, a new array was created !!!
        System.out.println(integers); // Result the original array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(newListIntegers); // Result new array: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]


        /**
         * @FILTER_METHOD
         * This method of stream is used to filter the array
         * filter method receive the functional interface predicate
         * Lets filter this array
         */

        /**
         * @EXAMPLE_USE_CASE_FILTER
         * In this example, lets remove each pair number of array
         * (IMPORTANT!!!) :  When we called 'Stream' we don't modified the original array but a copy
         */
        List<Integer> newListIntegerWithoutPairNumber = integers.stream().filter(value -> value % 2 != 0).toList();
        System.out.println(newListIntegerWithoutPairNumber); // Result new array: [1, 3, 5, 7, 9]

        /**
         * @FOR_EACH_METHOD
         * This method of stream is used to make some action in each value of array
         * filter method receive the functional interface consumer
         * Lets do for each in this array
         */
        integers.stream().forEach(System.out::println); // All values were printed

        /**
         * @REDUCE_METHOD
         * This method of stream is used to reduction  the elements
         * filter method receive the functional interface binary operation
         * Lets to reduce this array
         */

        /**
         * @EXAMPLE_USE_CASE_REDUCE
         * In this example, lets the sum all value of array, this will to reduce the array in 1 final value
         * (IMPORTANT!!!) :  When we called 'Stream' we don't modified the original array but a copy
         * (IMPORTANT!!!) :  The method reduce return Optional class, this class can contain or nor a value
         */

        Optional<Integer> result = integers.stream().reduce(Integer::sum);
        System.out.println(result); // Optional result: Optional[55]

        //DETAIL: If you want to get integer value instead optional, just call 'get' method
        Integer integerResultSum = integers.stream().reduce(Integer::sum).get();
        System.out.println(integerResultSum); // Integer result: 55


        /**
         * @DISTINCT_METHOD
         * This method of stream is used to remove all duplicates on array
         * filter method not receive param
         * Lets to remove duplicates this array
         * (IMPORTANT!!!) :  When we called 'Stream' we don't modified the original array but a copy
         */

        List<Integer> listIntegerWithDuplicates = List.of(1,1,2,2,3,4,5);
        List<Integer> listIntegerWithoutDuplicates = listIntegerWithDuplicates.stream().distinct().toList();
        System.out.println(listIntegerWithoutDuplicates); // Result: [1, 2, 3, 4, 5]


        /**
         * @FLAP_MAP_METHOD
         * This method of stream is used to transform a collection into a single stream of elements
         * flap map method receive the functional interface Function and Stream
         * Lets to flattens this array
         */
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4)); // A list with a list inside: [[1, 2], [3, 4]]
        List<Integer> flattenedList = listOfLists.stream().flatMap(List::stream).toList(); // A unique list with all values
        System.out.println(flattenedList); // Result: [1, 2, 3, 4]

        /**
         * @OBSERVATION:
         * These are just a few examples, and the Stream API provides a rich set of methods for various stream manipulations. The choice of method depends on the specific requirements of your use case.
         */
    }
}
