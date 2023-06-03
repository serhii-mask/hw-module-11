package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortReverseToUpperCasePrintNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Oleksandra", "Petro", "Leonid",
                "Maks", "Masha", "Andriy", "Orest", "Anna", "Viktoria");

        List<String> reverseNamesToUpperCase = new ArrayList<>();
        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(n -> reverseNamesToUpperCase.add(0, n));

        System.out.println("newNames = " + reverseNamesToUpperCase);
        System.out.println("listStream = " + names);
    }
}