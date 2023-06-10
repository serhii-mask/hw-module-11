package task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        final Stream<String> streamA = Stream.of("Alpha", "Beta", "Gama", "Zetta");
        final Stream<String> streamB = Stream.of("1", "2", "3");

        final Stream<String> result = zip(streamA, streamB);
        result
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static <T> Stream<T> zip(Stream<T> streamA, Stream<T> streamB) {

        List<T> resultList = new ArrayList<>();
        final Iterator<T> iteratorA = streamA.iterator();
        final Iterator<T> iteratorB = streamB.iterator();

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            resultList.add(iteratorA.next());
            resultList.add(iteratorB.next());
        }

        return resultList.stream();
    }

}
