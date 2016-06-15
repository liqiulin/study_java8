package chapter2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by qiulin on 2016-6-5.
 */
public class StreamTest {
    public static void main(String[] args) {
        // create stream
        Stream<String> song = Stream.of("hello", " " , "world!");

        // create stream from array
        String[] wolds = {"haha", " ", "hehe"};
        Stream arrayStream = Arrays.stream(wolds, 0, 2);


        // generate stream
        Stream<String> echoStream = Stream.generate(() -> "Echo");

        Stream<Double> doubleStream = Stream.generate(Math::random);
    }
}
