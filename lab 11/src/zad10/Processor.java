package zad10;

import java.util.function.IntConsumer;

public class Processor {
    public void process(IntConsumer action) {
        action.accept(10);
    }
}