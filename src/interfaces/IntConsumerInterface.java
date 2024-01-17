package interfaces;


import java.util.function.IntConsumer;

@FunctionalInterface
public interface IntConsumerInterface {

    void forEach(int[] array, IntConsumer consumer);
}
