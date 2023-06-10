package task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }

    public static void main(String[] args) {
        long seed = 0;
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);

        Stream<Long> randomStream = generateRandomStream(seed, a, c, m);
        randomStream
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
