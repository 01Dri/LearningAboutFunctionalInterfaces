package interfaces;


import java.util.function.IntConsumer;

/**
 * @author Dridev
 */

// It defines a function interface
@FunctionalInterface
public interface ExampleFunctionalInterface {

    // A unique abstract method
    void forEach(int[] array, IntConsumer consumer);
}
