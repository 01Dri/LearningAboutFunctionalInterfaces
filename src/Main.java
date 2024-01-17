import interfaces.IntConsumerInterface;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {

        /**
         * Starting with Lambda functions
         *
         * What the problem they resolve ?
         *
         * @PROBLEM: Before when we wanted to create a single piece of functionality, it was necessary to create each class for these cases,
         * it will to cause more boilerplate.
         *
         * @SOLUTION: With lambda function or anonymous function, we can to create these pieces of functionality more easily
         *
         * @EXAMPLES:
         */

     // Lets to create a function that print all values of array without lambda function
        int[] arrayInt = {4,5,6,7,9};
        printAllValuesWithoutLambda(arrayInt);
        printAllValuesWithLambda(arrayInt);
        printAllValuesWithMyFunctionalInterface(arrayInt, (s, consumer) -> {

            // How configured bellow, we to informed that our interface must print element, but how we want that it make this for each value, we used a for and called the method `accept` of ...
            // IntConsumer interface that called the o method 'forEach' in 'IntConsumerInterface'

            for (int element : arrayInt) {
                consumer.accept(element);
            }
        });
    }
    /**
     * @FIRST_EXAMPLE_WITHOUT_LAMBDA:
     * Lets to create a function that print all values of array without lambda function
     */
    public static void printAllValuesWithoutLambda(int[] array) {
        // This way we used the classic for each to print all values of array with two lines of code
        for (int v: array) {
            System.out.println(v);
        }
    }

    /**
     * @FIRST_EXAMPLE_WITH_LAMBDA
     */
    public static void printAllValuesWithLambda(int[] array) {
        /**
            * <sumamary>
            * This way we used the data structure "Stream' that we allow to use some lambda methods
            * But an array with values of primitive type not have `Stream` for default, because this, we used the class Arrays of Java util
            * Now we have 'for each' method by stream, this method receive 'IntConsume' that in summary allow us to pass a lambda function or a function of one line
            * </sumamary>
         */
        Arrays.stream(array).forEach(value -> System.out.println(value));  // 'Value' is the parameter of lambda function also represents each value of array
        Arrays.stream(array).forEach(System.out::println); // Other way of to print all values of array with lambda
    }

    /**
     * @CREATE_A_FUNCTIONAL_INTERFACE
     * Now going to create our  functional interface to use lambda
     */

    /**
     * This method receives two arguments: an array of integers and a functional interface.
     * The functional interface's 'forEach' method is called, and we pass a lambda expression
     * to specify the action the interface should perform, in this case, printing each element.
     *
     * @param array     The array of integers to be processed.
     * @param functions The functional interface defining the action to be performed.
     */
    public static void printAllValuesWithMyFunctionalInterface(int[] array , IntConsumerInterface functions) {
        // Using the accept method of the IntConsumer interface to perform the action
        functions.forEach(array, element -> {
            System.out.println(element);
        });
    }
}