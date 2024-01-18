package interfaces;


import java.util.function.IntConsumer;

@FunctionalInterface
public interface ExampleFunctionalInterface {

    void forEach(int[] array, IntConsumer consumer);
}
