package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortReverseToUpperCasePrintNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Oleksandra", "Petro", "Leonid",
                "Maks", "Masha", "Andriy", "Orest", "Anna", "Viktoria");

        List<String> reverseNamesToUpperCase = new ArrayList<>();

        names.stream()
                .sorted()
                .forEach(n -> reverseNamesToUpperCase.add(0, n.toUpperCase()));

        System.out.println("newNames = " + reverseNamesToUpperCase);
        System.out.println("listStream = " + names);
    }
}