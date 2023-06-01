package task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortReverseToUpperCasePrintNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Oleksandra", "Petro", "Leonid",
                "Maks", "Masha", "Andriy", "Orest", "Anna", "Viktoria");

        List<String> reverseNamesToUpperCase = names.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("newNames = " + reverseNamesToUpperCase);
        System.out.println("listStream = " + names);
    }
}