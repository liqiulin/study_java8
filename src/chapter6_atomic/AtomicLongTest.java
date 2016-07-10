package chapter6_atomic;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by qiulin on 2016-6-21.
 */
public class AtomicLongTest {
    public static void main(String[] args) {
        AtomicLong largest = new AtomicLong();
        largest.updateAndGet(x -> Math.max(x, 10));
        System.out.println(largest.get());

        largest.incrementAndGet();
        System.out.println(largest.get());

     //   largest.getAndAccumulate( x -> Math.max(x, 20));
    }
}
