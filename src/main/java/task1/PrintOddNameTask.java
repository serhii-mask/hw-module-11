package task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintOddNameTask {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Oleksandra", "Petro", "Leonid",
                "Maks", "Masha", "Andriy", "Orest", "Anna", "Viktoria");

        String result = IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}