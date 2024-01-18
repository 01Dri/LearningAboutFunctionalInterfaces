import java.util.List;

public class StreamsMethods {


    public static void main(String[] args) {
        /**
         * @EXAMPLES_FUNCTIONAL_METHODS
         * Lets go to see some methods of data structure 'Stream' most used
         */

        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10);

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
         * filter method receive a predicate to filter something
         * Lets filter this array
         */

        /**
         * @EXAMPLE_USE_CASE_FILTER
         * In this example, lets remove each pair number of array
         * (IMPORTANT!!!) :  When we called 'Stream' we don't modified the original array but a copy
         */
        List<Integer> newListIntegerWithoutPairNumber = integers.stream().filter(value -> value % 2 != 0).toList();
        System.out.println(newListIntegerWithoutPairNumber); // Result new array: [1, 3, 5, 7, 9]

    }
}
